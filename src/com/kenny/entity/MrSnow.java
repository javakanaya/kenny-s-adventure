package com.kenny.entity;

import com.kenny.main.GamePanel;

public class NPC_MrSnow extends Entity {

    public NPC_MrSnow(GamePanel gp) {
        super(gp);

        worldX = gp.tileSize * 26;
        worldY = gp.tileSize * 21;

        scallingX = 2;
        scallingY = 2;
        direction = "left";
        spriteNum = 5;
        speed = 0;
        type = type_npc;
        setSolidArea(24, 0, 72, 96);

        getImage();
        setDialogue();
    }

    public void getImage() {

        idleLeft1 = setup("/npc/mrSnow/mrSnow_0");
        idleLeft2 = setup("/npc/mrSnow/mrSnow_1");

        idleRight1 = idleLeft1;
        idleRight2 = idleLeft2;

        idleFront1 = idleLeft1;
        idleFront2 = idleLeft2;

    }

    public void setDialogue() {

        dialogues[0] = "HO HO HO, Hello There!\nI'm your friendly winterhood Mr.Snowman";
        dialogues[1] = "You need a winter Key eey?\nI happen to know it's location Ho Ho\nIt's at the top of The Mountain";
        dialogues[2] = "My advice to get there? HO HO HO\nThere'something underneath those ice";
    }

    public void setAction() {

        actionLockCounter++;

        if (actionLockCounter % 50 == 0) {

            if (spriteNum == 6)
                spriteNum = 5;
            else
                spriteNum = 6;

            actionLockCounter = 0;
        }

//        if(actionLockCounter == 120) {
//            Random random = new Random();
//            int i = random.nextInt(100) + 1; // pick up a number from 1 to 100;
//            
//            if(i <= 25) {
//                direction = "left";
//            }
//            if(i > 25 && i <= 50) {
//                direction = "down";
//            }
//            if(i > 55 && i <= 75) {
//                direction = "up";
//            }
//            if(i > 75 && i <= 100) {
//                direction = "right";
//            } 
//            
//            actionLockCounter = 0;
//        }

    }
}
