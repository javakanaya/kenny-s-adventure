package com.kenny.object.s_winter;

import com.kenny.entity.Entity;
import com.kenny.main.GamePanel;

public class OBJ_WinterGate extends Entity {

    GamePanel gp;

    public OBJ_WinterGate(GamePanel gp) {

        super(gp);

        this.gp = gp;

        name = "Winter Gate";
        type = type_gate;
        scallingY = 4;
        down1 = setup("/objects/gates/winterGateOff");
        collision = true;
    }

    public void interact(int i) {

        gp.gameState = gp.dialogueState;
        gp.ui.currentDialogue = "You need a key to open this";
    }

}
