/*
 *  Class for Player
 */

package com.kenny.entity;

import java.awt.Graphics2D;
import java.awt.Rectangle;
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
	int hasKey = 0;
	
	// player constructor
	public Player(GamePanel gp, KeyHandler keyH) {
		this.gp = gp;
		this.keyH = keyH;
		
		// player on the center of the screen
		screenX = gp.screenWidth / 2 - (gp.tileSize / 2);
		screenY = gp.screenHeight / 2 - (gp.tileSize / 2);
		
		// player area that will collision on the tiles
		solidArea = new Rectangle(8, 16, 32, 32);
		solidAreaDefaultX = solidArea.x;
		solidAreaDefaultY = solidArea.y;
		
		setDefaultValues();
		getPlayerImage();
	}
	
	// default values for the player
	public void setDefaultValues() {
	    // player position in the world map
		worldX = gp.tileSize * 23;
		worldY = gp.tileSize * 21;
		speed = 4;
		direction ="down";
	}
	
	// get player image and animating asset
	public void getPlayerImage() {
		
		try {
			down1 = ImageIO.read(getClass().getResourceAsStream("/player/walk/kenny_down_1.png"));
			down2 = ImageIO.read(getClass().getResourceAsStream("/player/walk/kenny_down_2.png"));
			down3 = ImageIO.read(getClass().getResourceAsStream("/player/walk/kenny_down_3.png"));
			down4 = ImageIO.read(getClass().getResourceAsStream("/player/walk/kenny_down_4.png"));
			
			left1 = ImageIO.read(getClass().getResourceAsStream("/player/walk/kenny_left_1.png"));
			left2 = ImageIO.read(getClass().getResourceAsStream("/player/walk/kenny_left_2.png"));
			left3 = ImageIO.read(getClass().getResourceAsStream("/player/walk/kenny_left_3.png"));
			left4 = ImageIO.read(getClass().getResourceAsStream("/player/walk/kenny_left_4.png"));

			right1 = ImageIO.read(getClass().getResourceAsStream("/player/walk/kenny_right_1.png"));
			right2 = ImageIO.read(getClass().getResourceAsStream("/player/walk/kenny_right_2.png"));
			right3 = ImageIO.read(getClass().getResourceAsStream("/player/walk/kenny_right_3.png"));
			right4 = ImageIO.read(getClass().getResourceAsStream("/player/walk/kenny_right_4.png"));

			up1 = ImageIO.read(getClass().getResourceAsStream("/player/walk/kenny_up_1.png"));
			up2 = ImageIO.read(getClass().getResourceAsStream("/player/walk/kenny_up_2.png"));
			up3 = ImageIO.read(getClass().getResourceAsStream("/player/walk/kenny_up_3.png"));
			up4 = ImageIO.read(getClass().getResourceAsStream("/player/walk/kenny_up_4.png"));
			
			idleFront1 = ImageIO.read(getClass().getResourceAsStream("/player/idle/kenny_idle_front_1.png"));
			idleFront2 = ImageIO.read(getClass().getResourceAsStream("/player/idle/kenny_idle_front_2.png"));
			idleFront3 = ImageIO.read(getClass().getResourceAsStream("/player/idle/kenny_idle_front_3.png"));
			idleFront4 = ImageIO.read(getClass().getResourceAsStream("/player/idle/kenny_idle_front_4.png"));
			
			idleLeft1 = ImageIO.read(getClass().getResourceAsStream("/player/idle/kenny_idle_left_2.png"));
			idleLeft2 = ImageIO.read(getClass().getResourceAsStream("/player/idle/kenny_idle_left_3.png"));
			idleLeft3 = ImageIO.read(getClass().getResourceAsStream("/player/idle/kenny_idle_left_4.png"));
			idleLeft4 = ImageIO.read(getClass().getResourceAsStream("/player/idle/kenny_idle_left_5.png"));
			
			idleRight1 = ImageIO.read(getClass().getResourceAsStream("/player/idle/kenny_idle_right_2.png"));
			idleRight2 = ImageIO.read(getClass().getResourceAsStream("/player/idle/kenny_idle_right_3.png"));
			idleRight3 = ImageIO.read(getClass().getResourceAsStream("/player/idle/kenny_idle_right_4.png"));
			idleRight4 = ImageIO.read(getClass().getResourceAsStream("/player/idle/kenny_idle_right_5.png"));
			
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

	        }
	        
	        else if(keyH.leftPressed == true) {
	            direction = "left";

	            
	        }
	        
	        else if(keyH.downPressed == true) {
	            direction = "down";

	            
	        }
	        
	        else if(keyH.rightPressed == true) {
	            direction = "right";

	            
	        }
	        
	        // check tile collision
	        collisionOn = false;
	        gp.cCheker.checkTile(this);
	        
	        // check object collision
	        int objIndex = gp.cCheker.checkObject(this, true);
	        pickUpObject(objIndex);
	        
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
	    // if no keys pressed, then sprite stop walking animation
	    else {
	    	
	    	// sprite stand still
	    	if(spriteCounter < 60)
	    		spriteNum = 2;
	        
	    	// sprite idle animation
	    	else{
	    		//transition
	    		if(spriteCounter == 60)
	                spriteNum = 5;
	    		else if(spriteCounter == 70)
	                spriteNum = 6;
	    		
	    		//looping animation for idle
	    		else if(spriteCounter == 80 || (spriteNum == 8 && spriteCounter%20 == 0 )){
	    			spriteNum = 7;
	    		}
	    		else if(spriteNum == 7 && spriteCounter%20 == 0) {
	    			spriteNum = 8;
	    		}
	    	}
	    }
	        
	        
		
	}
	
	public void pickUpObject(int i) {
		
		if(i != 999) {
			
			String objectName = gp.key[i].name;
			
			switch(objectName) {
			case "Winter Key" :
				hasKey++;
				gp.key[i] = null;
				break;
			case "Winter Gate" :
				if(hasKey > 0) {
					gp.key[i] = null;
					hasKey--;
				}
			}
			
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
		
		// draw the player, the player doesn't change but the map
	    g2d.drawImage(image, screenX, screenY, gp.tileSize, gp.tileSize, null);
	}
}
