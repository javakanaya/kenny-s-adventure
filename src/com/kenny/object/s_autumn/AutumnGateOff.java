package com.kenny.object.s_autumn;

import com.kenny.entity.Entity;
import com.kenny.main.GamePanel;

public class AutumnGateOff extends Entity {

    GamePanel gp;

    public AutumnGateOff(GamePanel gp) {

        super(gp);

        this.gp = gp;

        name = "Autumn Gate";
        type = type_gate;
        scallingY = 4;
        down1 = setup("/objects/gates/autumnGateOff");
        setSolidArea(0, 30, 48, 150);
        collision = true;
    }

    public void interact(int i) {

        gp.gameState = gp.dialogueState;
        gp.ui.currentDialogue = "Gate closed";
    }

}
