/*
 *  Class for Player
 */

package com.kenny.entity;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

import com.kenny.main.GamePanel;
import com.kenny.main.KeyHandler;

public class Player extends Entity {
	
	GamePanel gp;
	KeyHandler keyH;
	
	//indicate where the player will be drawn
	public final int screenX;
	public final int screenY;
	
	// player constructor
	public Player(GamePanel gp, KeyHandler keyH) {
		this.gp = gp;
		this.keyH = keyH;
		
		screenX = gp.screenWidth/2 - (gp.tileSize/2);
		screenY = gp.screenHeight/2 - (gp.tileSize/2);
		
		setDefaultValues();
		getPlayerImage();
	}
	
	// default values for the player
	public void setDefaultValues() {
		worldX = gp.tileSize * 23;
		worldY = gp.tileSize * 21;
		speed = 3;
		direction ="down";
	}
	
	// get player image and animating asset
	public void getPlayerImage() {
		
		try {
			down1 = ImageIO.read(getClass().getResourceAsStream("/player/kenny_down_1.png"));
			down2 = ImageIO.read(getClass().getResourceAsStream("/player/kenny_down_2.png"));
			down3 = ImageIO.read(getClass().getResourceAsStream("/player/kenny_down_3.png"));
			down4 = ImageIO.read(getClass().getResourceAsStream("/player/kenny_down_4.png"));
			
			left1 = ImageIO.read(getClass().getResourceAsStream("/player/kenny_left_1.png"));
			left2 = ImageIO.read(getClass().getResourceAsStream("/player/kenny_left_2.png"));
			left3 = ImageIO.read(getClass().getResourceAsStream("/player/kenny_left_3.png"));
			left4 = ImageIO.read(getClass().getResourceAsStream("/player/kenny_left_4.png"));

			right1 = ImageIO.read(getClass().getResourceAsStream("/player/kenny_right_1.png"));
			right2 = ImageIO.read(getClass().getResourceAsStream("/player/kenny_right_2.png"));
			right3 = ImageIO.read(getClass().getResourceAsStream("/player/kenny_right_3.png"));
			right4 = ImageIO.read(getClass().getResourceAsStream("/player/kenny_right_4.png"));

			up1 = ImageIO.read(getClass().getResourceAsStream("/player/kenny_up_1.png"));
			up2 = ImageIO.read(getClass().getResourceAsStream("/player/kenny_up_2.png"));
			up3 = ImageIO.read(getClass().getResourceAsStream("/player/kenny_up_3.png"));
			up4 = ImageIO.read(getClass().getResourceAsStream("/player/kenny_up_4.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// key handler for the player
	public void update() {
	    
	    // if key pressed
	    spriteCounter++;
	    if(keyH.upPressed == true || 
	            keyH.leftPressed == true ||
	            keyH.downPressed == true || 
	            keyH.rightPressed == true) {
	        
	        if(keyH.upPressed == true) {
	            direction = "up";
	            worldY -= speed;
	        }
	        
	        else if(keyH.leftPressed == true) {
	            direction = "left";
	            worldX -= speed;
	            
	        }
	        
	        else if(keyH.downPressed == true) {
	            direction = "down";
	            worldY += speed;
	            
	        }
	        
	        else if(keyH.rightPressed == true) {
	            direction = "right";
	            worldX += speed;
	            
	        }
	        
	        // animating sprite
	        
	        if(spriteCounter > 12) {
	            if(spriteNum == 4)
	                spriteNum = 1;
	            else
	                spriteNum++;
	            spriteCounter = 0;
	        }
	    }
	    // if no keys pressed, then sprite stop animating and stand still
	    else {
	        spriteNum = 1;
	    }
	        
	        
		
	}
	
	// player draw method
	public void draw(Graphics2D g2d) {
		 // white rectangle  player
		 // g2d.setColor(Color.white);
		 // g2d.fillRect(x, y, gp.tileSize, gp.tileSize);
		
		BufferedImage image = null;
		
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
			break;
		}
		
		// draw the player
		g2d.drawImage(image, screenX, screenY, gp.tileSize, gp.tileSize, null);
		
	}
}
