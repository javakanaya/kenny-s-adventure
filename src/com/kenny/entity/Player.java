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
import com.kenny.main.UtilityTool;
import com.kenny.tile.Tile;

public class Player extends Entity {
    
	GamePanel gp;
	KeyHandler keyH;
	
	//indicate where the player will be drawn
	public final int screenX;
	public final int screenY;
	public int[] hasKey = {0, 0, 0, 0};
	int keys[] = new int[4];
	
	// player constructor
	public Player(GamePanel gp, KeyHandler keyH) {
	    
	    super(gp);
	    
		this.gp = gp;
		this.keyH = keyH;
		
		// player on the center of the screen
		screenX = gp.screenWidth / 2 - (gp.tileSize / 2);
		screenY = gp.screenHeight / 2 - (gp.tileSize / 2);
		
		// player area that will collision on the tiles
		solidArea = new Rectangle(14, 16, 20, 24);
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
	 
		down1 = setup("/player/walk/kenny_down_1");
		down2 = setup("/player/walk/kenny_down_2");
		down3 = setup("/player/walk/kenny_down_3");
		down4 = setup("/player/walk/kenny_down_4");
		
		left1 = setup("/player/walk/kenny_left_1");
		left2 = setup("/player/walk/kenny_left_2");
		left3 = setup("/player/walk/kenny_left_3");
		left4 = setup("/player/walk/kenny_left_4");

		right1 = setup("/player/walk/kenny_right_1");
		right2 = setup("/player/walk/kenny_right_2");
        right3 = setup("/player/walk/kenny_right_3");
        right4 = setup("/player/walk/kenny_right_4");
		
		up1 = setup("/player/walk/kenny_up_1");
		up2 = setup("/player/walk/kenny_up_2");
		up3 = setup("/player/walk/kenny_up_3");
		up4 = setup("/player/walk/kenny_up_4");
		
		idleFront1 = setup("/player/idle/kenny_idle_front_1");
		idleFront2 = setup("/player/idle/kenny_idle_front_2");
		idleFront3 = setup("/player/idle/kenny_idle_front_3");
		idleFront4 = setup("/player/idle/kenny_idle_front_4");
		
	    idleLeft1 = setup("/player/idle/kenny_idle_left_2");
	    idleLeft2 = setup("/player/idle/kenny_idle_left_3");
	    idleLeft3 = setup("/player/idle/kenny_idle_left_4");
	    idleLeft4 = setup("/player/idle/kenny_idle_left_5");
	    
        idleRight1 = setup("/player/idle/kenny_idle_right_2");
        idleRight2 = setup("/player/idle/kenny_idle_right_3");
        idleRight3 = setup("/player/idle/kenny_idle_right_4");
        idleRight4 = setup("/player/idle/kenny_idle_right_5");
	}
	
	// update method
	public void update() {
	    
	    // key handler for the player
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
	    if(gp.obj[5] == null && gp.obj[6] == null && gp.obj[7] == null && gp.obj[8] == null) {
	        gp.gameState = gp.finishState;
	        gp.stopMusic();   
	    }
	}
	
	// pickup object method
	public void pickUpObject(int i) {
	    
	    // i indicates the name of the object
		if(i != 999) {
		    // get the object name
			String objectName = gp.obj[i].name;
			
			// condition for each object
			switch(objectName) {
			case "Winter Key" :
				// give SE to Key
				// gp.playSE(1);
				hasKey[0]++;
				keys[0] = 1;
				gp.obj[i] = null;
				gp.ui.showMessage("You got a Winter Key!");
				break;
			case "Spring Key" :
				// give SE to Key
				// gp.playSE(1);
			    hasKey[1]++;
				keys[1] = 1;
				gp.obj[i] = null;
				gp.ui.showMessage("You got a Spring Key!");
				break;
			case "Summer Key" :
				// give SE to Key
				// gp.playSE(1);
			    hasKey[2]++;
				keys[2] = 1;
				gp.obj[i] = null;
				gp.ui.showMessage("You got a Summer Key!");
				break;
			case "Autumn Key" :
				// give SE to Key
				// gp.playSE(1);
			    hasKey[3]++;
				keys[3] = 1;
				gp.obj[i] = null;
				gp.ui.showMessage("You got an Autumn Key!");
				break;
			case "Winter Gate" :
				if(keys[0] == 1) {
				    hasKey[0]--;
					gp.obj[i] = null;
				}
				else
				    gp.ui.showMessage("You need a Winter Key!");
				break;
			case "Spring Gate" :
				if(keys[1] == 1) {
				    hasKey[1]--;
					gp.obj[i] = null;
				}
				else
				    gp.ui.showMessage("You need a Spring Key!");
				break;
			case "Summer Gate" :
				if(keys[2] == 1) {
				    hasKey[2]--;
					gp.obj[i] = null;
				}
				else
				    gp.ui.showMessage("You need a Summer Key!");
				break;
			case "Autumn Gate" :
				if(keys[3] == 1) {
				    hasKey[3]--;
					gp.obj[i] = null;
				}
				else
				    gp.ui.showMessage("You need an Autumn Key!");
				break;
			case "Bone" :
				speed += 2;
				gp.obj[i] = null;
				gp.ui.showMessage("Speed up!");
				break;
			}
			
		}
		
	}
	
	// player draw method
	public void draw(Graphics2D g2d) {
	    
	    // set buffer image
		BufferedImage image = null;
		
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
		
		// draw the player, the player doesn't change but the map
	    g2d.drawImage(image, screenX, screenY, null);
	}
}
