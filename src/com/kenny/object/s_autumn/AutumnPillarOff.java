package com.kenny.object.s_autumn;

import com.kenny.entity.Entity;
import com.kenny.main.GamePanel;

public class AutumnPillarOff extends Entity {

    GamePanel gp;

    public AutumnPillarOff(GamePanel gp) {

        super(gp);

        this.gp = gp;

        name = "Autumn Pillar";
        type = type_pillarOff;
        down1 = setup("/objects/gates/gatePillar_autumn");
        setSolidArea(0, 0, 48, 48);
        collision = true;
    }

    public void interact(int i) {

        gp.gameState = gp.dialogueState;
        gp.ui.currentDialogue = "You need a key to activate this";
    }

}
