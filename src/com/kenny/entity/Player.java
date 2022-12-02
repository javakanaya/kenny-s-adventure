/*
 *  Class for Player
 */

package com.kenny.entity;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import com.kenny.main.GamePanel;
import com.kenny.main.KeyHandler;
import com.kenny.object.s_winter.OBJ_IcePillarOff;
import com.kenny.object.s_winter.OBJ_IcePillarOn;
import com.kenny.object.s_winter.OBJ_WinterKey;

public class Player extends Entity {

    GamePanel gp;
    KeyHandler keyH;

    // indicate where the player will be drawn
    public final int screenX;
    public final int screenY;

    public int[] pillar = { 1, 1, 1, 1 };
    public ArrayList<Entity> inventory = new ArrayList<>();
    int maxInventorySize = 20;

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
        direction = "down";
    }

    public void setItem() {
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
        if (keyH.upPressed == true ||
                keyH.leftPressed == true ||
                keyH.downPressed == true ||
                keyH.rightPressed == true ||
                keyH.enterPressed == true) {
            if (keyH.upPressed == true) {
                direction = "up";
            } else if (keyH.leftPressed == true) {
                direction = "left";
            } else if (keyH.downPressed == true) {
                direction = "down";
            } else if (keyH.rightPressed == true) {
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
            if (collisionOn == false && keyH.enterPressed == false) {
                switch (direction) {
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
            if (spriteCounter > 10) {
                if (spriteNum >= 4)
                    spriteNum = 1;
                else
                    spriteNum++;
                spriteCounter = 0;
            }
        }
        // if no keys pressed, then sprite stop walking animation
        else {
            // sprite stand still
            if (spriteCounter < 60)
                spriteNum = 2;

            // sprite idle animation
            else {
                // transition
                if (spriteCounter == 60)
                    spriteNum = 5;
                else if (spriteCounter == 70)
                    spriteNum = 6;

                // looping animation for idle
                else if (spriteCounter == 80 || (spriteNum == 8 && spriteCounter % 20 == 0)) {
                    spriteNum = 7;
                } else if (spriteNum == 7 && spriteCounter % 20 == 0) {
                    spriteNum = 8;
                }
            }
        }
    }

    // pickup object method
    public void pickUpObject(int i) {

        if (i != 999) {
            // OBSTACLE
            if (gp.obj[i].type == type_gate) {
                gp.ui.showMessage("press ENTER to interact");
                if (keyH.enterPressed == true) {
                    gp.obj[i].interact(i);

                }
            } else if (gp.obj[i].type == type_pillarOff) {
                gp.ui.showMessage("Interact Ice Pillar");
                if (keyH.enterPressed == true) {
                    int xPosition = gp.obj[i].worldX,
                        yPosition = gp.obj[i].worldY;
                    gp.obj[i].interact(i);
                    spawnPillarOn(i, xPosition, yPosition);

                }
            } else if (gp.obj[i].type == type_pillarOn) {
            } else if (gp.obj[i].type == type_pile) {
                gp.ui.showMessage("Interact Ice Pile");
                if (keyH.enterPressed == true) {
                    gp.obj[i].interact(i);

                }
            }

            else {
                String text;
                if (inventory.size() != maxInventorySize) {
                    inventory.add(gp.obj[i]);
                    text = "Got a " + gp.obj[i].name + "!";
                    gp.obj[i] = null;
                } else {
                    text = "You cannot carry any more!";
                }
                gp.ui.showMessage(text);
            }
        }
    }

    public void interactNPC(int i) {

        // if index is not 999, player is hit the NPC
        if (i != 999) {
            gp.ui.showMessage("press ENTER to interact");
            if (gp.keyH.enterPressed == true) {
                gp.gameState = gp.dialogueState;
                gp.npc[i].speak(i);
            }
        }
    }

    public void selectItem() {

        int itemIndex = gp.ui.getItemIndexOnSlot();

        if (itemIndex < inventory.size()) {
            Entity selectedItem = inventory.get(itemIndex);

            if (selectedItem.type == type_consumable) {
                if (selectedItem.use(this) == true) {
                    inventory.remove(itemIndex);
                }
            }
        }
    }

    // player draw method
    public void draw(Graphics2D g2d) {

        // set buffer image
        BufferedImage image = null;

        // get buffer image for each direction
        switch (direction) {
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

    public void spawnPillarOn(int i, int xPos, int yPos) {
        gp.obj[i] = new OBJ_IcePillarOn(gp);
        gp.obj[i].worldX = xPos;
        gp.obj[i].worldY = yPos;

        int p = 0;
        while (pillar[p] != 1)
            p++;
        pillar[p] = i;
        System.out.println(pillar[p] + " " + p);

        if (((pillar[0] - pillar[1]) + pillar[2]) * pillar[3] == 169) {

            gp.ui.showMessage("Winter Key Has Spawned!");
            spawnWinterKey();
        } else if (pillar[0] != 1 && pillar[1] != 1 && pillar[2] != 1 && pillar[3] != 1) {

            gp.obj[11] = null;
            gp.obj[11] = new OBJ_IcePillarOff(gp);
            gp.obj[11].worldX = (78) * gp.tileSize;
            gp.obj[11].worldY = (44) * gp.tileSize;

            gp.obj[12] = null;
            gp.obj[12] = new OBJ_IcePillarOff(gp);
            gp.obj[12].worldX = (82) * gp.tileSize;
            gp.obj[12].worldY = (40) * gp.tileSize;

            gp.obj[13] = null;
            gp.obj[13] = new OBJ_IcePillarOff(gp);
            gp.obj[13].worldX = (88) * gp.tileSize;
            gp.obj[13].worldY = (45) * gp.tileSize;

            gp.obj[14] = null;
            gp.obj[14] = new OBJ_IcePillarOff(gp);
            gp.obj[14].worldX = (84) * gp.tileSize;
            gp.obj[14].worldY = (50) * gp.tileSize;

            while (p >= 0) {
                pillar[p] = 1;
                p--;
            }

        }
    }

    public void spawnWinterKey() {
        gp.obj[1] = new OBJ_WinterKey(gp);
        gp.obj[1].worldX = 84 * gp.tileSize;
        gp.obj[1].worldY = 47 * gp.tileSize;
    }
}
