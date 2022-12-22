package com.kenny.object.s_spring;

import com.kenny.entity.Entity;
import com.kenny.main.GamePanel;

public class SpringGateOff extends Entity {

    GamePanel gp;

    public SpringGateOff(GamePanel gp) {

        super(gp);

        this.gp = gp;

        name = "Spring Gate";
        type = type_gate;
        scallingY = 4;
        down1 = setup("/objects/gates/springGateOff");
        setSolidArea(0, 30, 48, 150);
        collision = true;
    }

    public void interact(int i) {

        gp.gameState = gp.dialogueState;
        gp.ui.currentDialogue = "Gate closed";
    }
}
