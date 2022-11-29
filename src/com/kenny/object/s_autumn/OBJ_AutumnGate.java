package com.kenny.object.s_autumn;

import com.kenny.entity.Entity;
import com.kenny.main.GamePanel;

public class OBJ_AutumnGate extends Entity {

    GamePanel gp;

    public OBJ_AutumnGate(GamePanel gp) {

        super(gp);

        this.gp = gp;

        name = "Autumn Gate";
        type = type_gate;
        scallingY = 4;
        down1 = setup("/objects/gates/autumnGateOff");
        collision = true;
    }

    public void interact(int i) {

        gp.gameState = gp.dialogueState;
        gp.ui.currentDialogue = "You need a key to open this";
    }

}
