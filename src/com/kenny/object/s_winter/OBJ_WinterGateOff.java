package com.kenny.object.s_winter;

import com.kenny.entity.Entity;
import com.kenny.main.GamePanel;

public class OBJ_WinterGateOff extends Entity {

    GamePanel gp;

    public OBJ_WinterGateOff(GamePanel gp) {

        super(gp);

        this.gp = gp;

        name = "Winter Gate";
        type = type_gate;
        scallingY = 4;
        down1 = setup("/objects/gates/winterGateOff");
        setSolidArea(0, 30, 48, 150);
        collision = true;
    }

    public void interact(int i) {

        gp.gameState = gp.dialogueState;
        gp.ui.currentDialogue = "Gate closed";
    }

}
