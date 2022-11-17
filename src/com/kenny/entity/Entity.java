/*
 *  Class for Entities
 */

package com.kenny.entity;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.kenny.main.GamePanel;
import com.kenny.main.UtilityTool;

public class Entity {
    
    GamePanel gp;
    
    // entity location on world & speed
	public int  worldX, worldY;
	public int speed;
	
	// SPRITE SETTINGS
	// image for entity movement & idle
	public BufferedImage right1, right2, right3, right4, 
 				  up1, up2, up3, up4, 
 				  left1, left2, left3, left4, 
 				  down1, down2, down3, down4;
 	public BufferedImage idleFront1, idleFront2, idleFront3, idleFront4,
 				  idleLeft1, idleLeft2, idleLeft3, idleLeft4,
				  idleRight1, idleRight2, idleRight3, idleRight4;
 	// entity direction
	public String direction;
	int spriteCounter = 0;
	int spriteNum = 1;
	
	// Entity size scaling
	int scalling = 1;
	
	// COLLISION SETTINGS
	public Rectangle solidArea = new Rectangle(0, 0, 48, 48);
	public int 	solidAreaDefaultX, solidAreaDefaultY;
	public boolean collisionOn = false;
	
	// Entity animation
	public int actionLockCounter = 0;
	
	// Array of Dialogues
	public String dialogues[] = new String[20];
	public int dialogueIndex = 0;
	
	public Entity(GamePanel gp) {
	    this.gp = gp;
	}
	
	public void setAction() {}
	
	public void speak() {
        
        if(dialogues[dialogueIndex] == null) {
            dialogueIndex = 0;
        }
        gp.ui.currentDialogue = dialogues[dialogueIndex];
        dialogueIndex++;
        
        // setting for when sprite speak is facing to player
        // tapi karena belum ada asset sprite nya, ya di-comment dulu aja ya...
//	        switch(gp.player.direction) {
//	            case "up":
//	                direction = "down";
//	                break;
//	            case "down":
//	                direction = "up";
//	                break;
//	            case "left":
//	                direction = "right";
//	                break;
//	            case "right":
//	                direction = "left";
//	                break;
//	        }
	}
	
	public void update() {
	    
	    setAction();
	    
	    collisionOn = false;
	    gp.cCheker.checkTile(this);
	    gp.cCheker.checkObject(this, false);
	    gp.cCheker.checkPlayer(this);
	    
	    // if collision is false, player can move
        if(collisionOn == false) {
            switch(direction) {
                case "up":
                    worldY -= speed;
                    break;
                case "left":
                    worldX -= speed;
                    break;
                case "down":
                    worldY += speed;
                    break;
                case "right":
                    worldX += speed;
                    break;                  
            }
        }
        
        // animating sprite
        if(spriteCounter > 10) {
            if(spriteNum >= 4)
                spriteNum = 1;
            else
                spriteNum++;
            spriteCounter = 0;
        }
	}
	
    
    public void draw(Graphics2D g2d) {
        
        BufferedImage image = null;
        
        // object position on the screen
        int screenX = worldX - gp.player.worldX + gp.player.screenX;
        int screenY = worldY - gp.player.worldY + gp.player.screenY;
            
        // Improve render, draw only the tiles that seen on the screen
        if(worldX + 3 * gp.tileSize > gp.player.worldX - gp.player.screenX &&
                worldX - 3 * gp.tileSize < gp.player.worldX + gp.player.screenX &&
                worldY + 3 * gp.tileSize > gp.player.worldY - gp.player.screenY &&
                worldY - 3 * gp.tileSize < gp.player.worldY + gp.player.screenY) {
            
         // get buffer image for each direction
            switch(direction) {
            case "down":
                if (spriteNum == 1) {
                    image = down1;              
                }
                if (spriteNum == 2) {
                    image = down2;              
                }
                if (spriteNum == 3) {
                    image = down3;              
                }
                if (spriteNum == 4) {
                    image = down4;              
                }
                if (spriteNum == 5) {
                    image = idleFront1;              
                }
                if (spriteNum == 6) {
                    image = idleFront2;              
                }
                if (spriteNum == 7) {
                    image = idleFront3;              
                }
                if (spriteNum == 8) {
                    image = idleFront4;              
                }
                break;
            case "left":
                if (spriteNum == 1) {
                    image = left1;              
                }
                if (spriteNum == 2) {
                    image = left2;              
                }
                if (spriteNum == 3) {
                    image = left3;              
                }
                if (spriteNum == 4) {
                    image = left4;              
                }
                if (spriteNum == 5) {
                    image = idleLeft1;              
                }
                if (spriteNum == 6) {
                    image = idleLeft2;              
                }
                if (spriteNum == 7) {
                    image = idleLeft3;              
                }
                if (spriteNum == 8) {
                    image = idleLeft4;              
                }
                break;
            case "right":
                if (spriteNum == 1) {
                    image = right1;
                }
                if (spriteNum == 2) {
                    image = right2;              
                }
                if (spriteNum == 3) {
                    image = right3;              
                }
                if (spriteNum == 4) {
                    image = right4;              
                }
                if (spriteNum == 5) {
                    image = idleRight1;              
                }
                if (spriteNum == 6) {
                    image = idleRight2;              
                }
                if (spriteNum == 7) {
                    image = idleRight3;              
                }
                if (spriteNum == 8) {
                    image = idleRight4;              
                }
                break;
            case "up":
                if (spriteNum == 1) {
                    image = up1;
                }
                if (spriteNum == 2) {
                    image = up2;              
                }
                if (spriteNum == 3) {
                    image = up3;              
                }
                if (spriteNum == 4) {
                    image = up4;              
                }
                if (spriteNum == 5) {
                    image = idleFront1;              
                }
                if (spriteNum == 6) {
                    image = idleFront2;              
                }
                if (spriteNum == 7) {
                    image = idleFront3;              
                }
                if (spriteNum == 8) {
                    image = idleFront4;              
                }
                break;
            }
            
            g2d.drawImage(image, screenX, screenY, null);
            // System.out.println("sX : " + screenX + " sY :" + screenX);
        }
    }
    
    public BufferedImage setup(String imagePath) {
        
        UtilityTool uTool = new UtilityTool();
        BufferedImage image = null;
        
        try {
            image = ImageIO.read(getClass().getResourceAsStream(imagePath + ".png"));
            image = uTool.scaleImage(image, gp.tileSize * scalling, gp.tileSize * scalling);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return image;
    }

}
