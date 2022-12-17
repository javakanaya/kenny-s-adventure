package com.kenny.object.others;

import com.kenny.entity.Entity;
import com.kenny.main.GamePanel;

public class OBJ_OpenedGate extends Entity {

    GamePanel gp;

    public OBJ_OpenedGate(GamePanel gp) {

        super(gp);

        this.gp = gp;

        name = "Opened Gate";
        type = type_gate;
        scallingX = 4;
        scallingY = 4;
        down1 = setup("/objects/gates/gateOpened");
        setSolidArea(0, 30, 48, 150);
        collision = true;
    }

    public void interact(int i) {
        gp.gameState = gp.finishState;
    }

}
