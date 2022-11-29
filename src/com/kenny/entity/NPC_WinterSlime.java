package com.kenny.entity;

import java.util.Random;

import com.kenny.main.GamePanel;

public class NPC_WinterSlime extends Entity {

    public NPC_WinterSlime(GamePanel gp) {
        super(gp);

        worldX = gp.tileSize * 26;
        worldY = gp.tileSize * 21;

        scallingX = 1;
        scallingY = 1;
        direction = "down";
        spriteNum = 1;
        speed = 1;
        type = type_npc;
        setSolidArea(0, 0, 48, 48);

        getImage();
        setDialogue();
    }

    public void getImage() {

        down1 = setup("/npc/winterSlime/winSlime_4");
        down2 = setup("/npc/winterSlime/winSlime_5");

        up1 = setup("/npc/winterSlime/winSlime_6");
        up2 = setup("/npc/winterSlime/winSlime_7");

        left1 = setup("/npc/winterSlime/winSlime_2");
        left2 = setup("/npc/winterSlime/winSlime_3");

        right1 = setup("/npc/winterSlime/winSlime_0");
        right2 = setup("/npc/winterSlime/winSlime_1");

    }

    public void setDialogue() {

        dialogues[0] = "#1\nThere's nothing here";
        dialogues[1] = "#2\nI am the Start of Every Direction";
        dialogues[2] = "#3\nThey faced me 5 atleast times a day";
        dialogues[3] = "#4\nCome forth the destruction";

    }

    public void speak(int i) {
        if (i == 4)
            dialogueIndex = 0;
        else if (i == 5)
            dialogueIndex = 3;
        else if (i == 6)
            dialogueIndex = 1;
        else if (i == 7)
            dialogueIndex = 2;

        gp.ui.currentDialogue = dialogues[dialogueIndex];

        switch (gp.player.direction) {
            case "up":
                direction = "down";
                break;
            case "down":
                direction = "up";
                break;
            case "left":
                direction = "right";
                break;
            case "right":
                direction = "left";
                break;
        }
    }

    public void setAction() {

        actionLockCounter++;
        spriteCounter++;
//		if(actionLockCounter%50 == 0) {
//			
//			if(spriteNum == 6)
//				spriteNum = 5;
//			else spriteNum = 6;
//			
//			actionLockCounter = 0;
//		}

        if (actionLockCounter == 120) {
            Random random = new Random();
            int i = random.nextInt(100) + 1; // pick up a number from 1 to 100;

            if (i <= 25) {
                direction = "left";
            }
            if (i > 25 && i <= 50) {
                direction = "down";
            }
            if (i > 55 && i <= 75) {
                direction = "up";
            }
            if (i > 75 && i <= 100) {
                direction = "right";
            }

            actionLockCounter = 0;
        }

    }
}
