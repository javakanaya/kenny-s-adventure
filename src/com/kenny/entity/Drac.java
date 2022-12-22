package com.kenny.entity;

import com.kenny.main.GamePanel;

public class NPC_Drac extends Entity {

    public NPC_Drac(GamePanel gp) {
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

        idleLeft1 = setup("/npc/drac/drac_0");
        idleLeft2 = setup("/npc/drac/drac_1");

        idleRight1 = idleLeft1;
        idleRight2 = idleLeft2;

        idleFront1 = idleLeft1;
        idleFront2 = idleLeft2;

    }

    public void setDialogue() {

        dialogues[0] = "Rawrr..\nHi little one\nWhat brings you here?";
        dialogues[1] = "You need a Spring Key?\nwell well well.. Of Course i know where it is\nIt's located at the farside of this maze";
        dialogues[2] = "But becareful,\nsome flower makes you go into SUGAR RUSH\nAnd some makes you normal again";
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
    }
}
