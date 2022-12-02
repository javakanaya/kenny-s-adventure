package com.kenny.object.s_summer;

import com.kenny.entity.Entity;
import com.kenny.main.GamePanel;

public class OBJ_SummerGate extends Entity {

    GamePanel gp;

    public OBJ_SummerGate(GamePanel gp) {

        super(gp);

        this.gp = gp;

        name = "Summer Gate";
        type = type_gate;
        scallingY = 4;
        down1 = setup("/objects/gates/summerGateOff");
        setSolidArea(0, 30, 48, 150);
        collision = true;
    }

    public void interact(int i) {

        gp.gameState = gp.dialogueState;
        gp.ui.currentDialogue = "You need a key to open this";
    }
}
