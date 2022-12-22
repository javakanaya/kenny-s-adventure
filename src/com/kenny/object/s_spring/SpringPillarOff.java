package com.kenny.object.s_spring;

import com.kenny.entity.Entity;
import com.kenny.main.GamePanel;

public class SpringPillarOff extends Entity {

    GamePanel gp;

    public SpringPillarOff(GamePanel gp) {

        super(gp);

        this.gp = gp;

        name = "Spring Pillar";
        type = type_pillarOff;
        down1 = setup("/objects/gates/gatePillar_spring");
        setSolidArea(0, 0, 48, 48);
        collision = true;
    }

    public void interact(int i) {

        gp.gameState = gp.dialogueState;
        gp.ui.currentDialogue = "You need a key to activate this pillar";
    }

}
