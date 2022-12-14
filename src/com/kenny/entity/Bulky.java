package com.kenny.entity;

import com.kenny.main.GamePanel;

public class Bulky extends Entity {

    public Bulky(GamePanel gp) {
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

        idleLeft1 = setup("/npc/bulky/bulky_0");
        idleLeft2 = setup("/npc/bulky/bulky_1");

        idleRight1 = idleLeft1;
        idleRight2 = idleLeft2;

        idleFront1 = idleLeft1;
        idleFront2 = idleLeft2;

    }

    public void setDialogue() {

        dialogues[0] = "GGRHRHH... little dog!";
    }

    public void setAction() {
        // animate sprite
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
