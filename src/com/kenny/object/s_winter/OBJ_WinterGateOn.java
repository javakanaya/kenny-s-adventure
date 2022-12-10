package com.kenny.object.s_winter;

import com.kenny.entity.Entity;
import com.kenny.main.GamePanel;

public class OBJ_WinterGateOn extends Entity {

    GamePanel gp;

    public OBJ_WinterGateOn(GamePanel gp) {

        super(gp);

        this.gp = gp;

        name = "Winter Gate";
        type = type_gate;
        scallingY = 4;
        down1 = setup("/objects/gates/winterGateOn");
        setSolidArea(0, 30, 48, 150);
        collision = true;
    }

    public void interact(int i) {

        gp.gameState = gp.dialogueState;
        gp.ui.currentDialogue = "Gate Open";
    }

}
