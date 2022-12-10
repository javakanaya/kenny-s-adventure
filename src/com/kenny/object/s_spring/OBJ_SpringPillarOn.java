package com.kenny.object.s_spring;

import com.kenny.entity.Entity;
import com.kenny.main.GamePanel;

public class OBJ_SpringPillarOn extends Entity {

    GamePanel gp;

    public OBJ_SpringPillarOn(GamePanel gp) {

        super(gp);

        this.gp = gp;

        name = "Spring Pillar";
        type = type_pillarOn;
        down1 = setup("/objects/gates/gatePillar_springOn");
        setSolidArea(0, 0, 48, 48);
        collision = true;
    }

    public void interact(int i) {

        gp.gameState = gp.dialogueState;
        gp.ui.currentDialogue = "Pillar Activated";
    }

}
