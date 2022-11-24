/*
 *  Class for Player
 */

package com.kenny.entity;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import com.kenny.main.GamePanel;
import com.kenny.main.KeyHandler;
import com.kenny.object.s_autumn.OBJ_AutumnKey;
import com.kenny.object.s_spring.OBJ_SpringKey;
import com.kenny.object.s_summer.OBJ_SummerKey;
import com.kenny.object.s_winter.OBJ_IcePillarOn;
import com.kenny.object.s_winter.OBJ_WinterKey;

public class Player extends Entity {
    
    GamePanel gp;
    KeyHandler keyH;
    
    //indicate where the player will be drawn
    public final int screenX;
    public final int screenY;
    public int[] pillar = {1, 1, 1, 1};
    public ArrayList<Entity> inventory  = new ArrayList<>();
    
    // player constructor
    public Player(GamePanel gp, KeyHandler keyH) {
        
        super(gp);
        
        this.gp = gp;
        this.keyH = keyH;
        
        // player on the center of the screen
        screenX = gp.screenWidth / 2 - (gp.tileSize / 2);
        screenY = gp.screenHeight / 2 - (gp.tileSize / 2);
        
        // player area that will collision on the tiles
        setSolidArea(14, 16, 20, 24);
        
        setDefaultValues();
        getPlayerImage();
        setItem();
    }
    
    // default values for the player
    public void setDefaultValues() {
        
        // player position in the world map
        worldX = gp.tileSize * 50;
        worldY = gp.tileSize * 50;
        speed = 10;
        direction ="down";
    }
    
    public void setItem() {
        inventory.add(new OBJ_AutumnKey(gp));
        inventory.add(new OBJ_WinterKey(gp));
        inventory.add(new OBJ_SummerKey(gp));
        inventory.add(new OBJ_SpringKey(gp));
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
                keyH.rightPressed == true ||
                keyH.enterPressed == true) {            
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
            
            // CHECK TILE COLLISION
            collisionOn = false;
            gp.cCheker.checkTile(this);
            
            // CHECK OBJECT COLLISION
            int objIndex = gp.cCheker.checkObject(this, true);
            pickUpObject(objIndex);
            
            // CHECK NPC COLLISION
            // pass NPC array
            int npcIndex = gp.cCheker.checkEntity(this, gp.npc);
            interactNPC(npcIndex);
            
            // CHECK EVENT
            gp.eHandler.checkEvent();
            
            
            // if collision is false, player can move
            if(collisionOn == false && keyH.enterPressed == false) {
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
            
            // after all (NPC and EVENT) checked, then change the enter pressed state
            gp.keyH.enterPressed = false;
            
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
        
//        // i indicates the name of the object
//        if(i != 999) {
//            // get the object name
//            String objectName = gp.obj[i].name;
//            
//            // condition for each object
//            switch(objectName) {
//            case "Winter Key" :
//                // give SE to Key
//                // gp.playSE(1);
//                hasKey[0]++;
//                keys[0] = 1;
//                gp.obj[i] = null;
//                gp.ui.showMessage("You got a Winter Key!");
//                break;
//            case "Spring Key" :
//                // give SE to Key
//                // gp.playSE(1);
//                hasKey[1]++;
//                keys[1] = 1;
//                gp.obj[i] = null;
//                gp.ui.showMessage("You got a Spring Key!");
//                break;
//            case "Summer Key" :
//                // give SE to Key
//                // gp.playSE(1);
//                hasKey[2]++;
//                keys[2] = 1;
//                gp.obj[i] = null;
//                gp.ui.showMessage("You got a Summer Key!");
//                break;
//            case "Autumn Key" :
//                // give SE to Key
//                // gp.playSE(1);
//                hasKey[3]++;
//                keys[3] = 1;
//                System.out.println(i);
//                gp.obj[i] = null;
//                gp.ui.showMessage("You got an Autumn Key!");
//                break;
//            case "Winter Gate" :
//                if(keys[0] == 1) {
//                    hasKey[0]--;
//                    gp.obj[i] = null;
//                }
//                else
//                    gp.ui.showMessage("You need a Winter Key!");
//                break;
//            case "Spring Gate" :
//                if(keys[1] == 1) {
//                    hasKey[1]--;
//                    gp.obj[i] = null;
//                }
//                else
//                    gp.ui.showMessage("You need a Spring Key!");
//                break;
//            case "Summer Gate" :
//                if(keys[2] == 1) {
//                    hasKey[2]--;
//                    gp.obj[i] = null;
//                }
//                else
//                    gp.ui.showMessage("You need a Summer Key!");
//                break;
//            case "Autumn Gate" :
//                if(keys[3] == 1) {
//                    hasKey[3]--;
//                    gp.obj[i] = null;
//                }
//                else
//                    gp.ui.showMessage("You need an Autumn Key!");
//                break;
//            case "Bone" :
//                speed += 3;
//                gp.obj[i] = null;
//                System.out.println(i);
//                gp.ui.showMessage("Speed up!");
//                break;
//            case "Ice Pile Close" :
//            	if(keyH.interactPressed == true)
//            	{
//            		gp.obj[i] = null;
//                    gp.ui.showMessage("Break!");
//            	}
//                break;    
//            case "Ice Pile Open" :
//            	if(keyH.interactPressed == true)
//            	{
//            		gp.obj[i] = null;
//                    gp.ui.showMessage("Break!");
//            	}
//                break;  
//            case "Ice Pillar Off" :
//            	if(keyH.interactPressed == true)
//            	{
//            		if(gp.obj[15] == null) {
//            			gp.obj[15] = new OBJ_IcePillarOn(gp);
//                	    gp.obj[15].worldX = gp.obj[i].worldX;
//                	    gp.obj[15].worldY = gp.obj[i].worldY;
//                	    gp.obj[i] = null;
//                        gp.ui.showMessage("It's ON!");
//                        pillar[0] = i;
//                        
//            		}
//            		else if(gp.obj[16] == null) {
//            			gp.obj[16] = new OBJ_IcePillarOn(gp);
//                	    gp.obj[16].worldX = gp.obj[i].worldX;
//                	    gp.obj[16].worldY = gp.obj[i].worldY;
//                	    gp.obj[i] = null;
//                        gp.ui.showMessage("It's ON!");
//                        pillar[1] = i;
//            		}
//            		else if(gp.obj[17] == null) {
//            			gp.obj[17] = new OBJ_IcePillarOn(gp);
//                	    gp.obj[17].worldX = gp.obj[i].worldX;
//                	    gp.obj[17].worldY = gp.obj[i].worldY;
//                	    gp.obj[i] = null;
//                        gp.ui.showMessage("It's ON!");
//                        pillar[2] = i;
//            		}
//            		else if(gp.obj[18] == null) {
//            			gp.obj[18] = new OBJ_IcePillarOn(gp);
//                	    gp.obj[18].worldX = gp.obj[i].worldX;
//                	    gp.obj[18].worldY = gp.obj[i].worldY;
//                	    gp.obj[i] = null;
//                        gp.ui.showMessage("It's ON!");
//                        pillar[3] = i;
//            		}
//            		
//            		if(((pillar[0] * pillar[1]) / pillar[2]) - pillar[3] == -4) {
//            			gp.obj[1] = new OBJ_WinterKey(gp);
//            			gp.obj[1].worldX = (84) *gp.tileSize;
//            			gp.obj[1].worldY = (47) *gp.tileSize;
//            		}
//            	}
//                break;  
//            }
//            
//        }
        
    }
    
    public void interactNPC(int i) {
        
        // if index is not 999, player is hit the NPC
        // Kalo yg ini harus klik enter sambil di tabrakin baru dialognya muncul
        if(i != 999) {
            gp.ui.showMessage("press ENTER to interact");
            if(gp.keyH.enterPressed == true) {
                gp.gameState = gp.dialogueState;
                gp.npc[i].speak();              
            }
        }
        
        // kalo ini cuma tabrakin aja..., nnt kalo mau next klik enter
//        if(i != 999) {
//            gp.ui.showMessage("press ENTER to interact");
//            gp.gameState = gp.dialogueState;
//            gp.npc[i].speak();              
//        }
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
