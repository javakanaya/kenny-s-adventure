package com.kenny.object.s_autumn;

import com.kenny.entity.Entity;
import com.kenny.main.GamePanel;

public class AutumnPillarOn extends Entity {

    GamePanel gp;

    public AutumnPillarOn(GamePanel gp) {

        super(gp);

        this.gp = gp;

        name = "Autumn Pillar";
        type = type_pillarOn;
        down1 = setup("/objects/gates/gatePillar_autumnOn");
        setSolidArea(0, 0, 48, 48);
        collision = true;
    }

    public void interact(int i) {

        gp.gameState = gp.dialogueState;
        gp.ui.currentDialogue = "Pillar Activated";
    }

}
