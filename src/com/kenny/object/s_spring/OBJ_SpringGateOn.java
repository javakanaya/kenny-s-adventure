package com.kenny.object.s_spring;

import com.kenny.entity.Entity;
import com.kenny.main.GamePanel;

public class OBJ_SpringGateOn extends Entity {

    GamePanel gp;

    public OBJ_SpringGateOn(GamePanel gp) {

        super(gp);

        this.gp = gp;

        name = "Spring Gate";
        type = type_gate;
        scallingY = 4;
        down1 = setup("/objects/gates/springGateOn");
        setSolidArea(0, 30, 48, 150);
        collision = true;
    }

    public void interact(int i) {

        if(i == 1) {
            gp.gameState = gp.dialogueState;
            gp.ui.currentDialogue = "Gate Closed.\nAll Pillar Must Be Activated!";
        }else if(i == 0) {
            gp.gameState = gp.dialogueState;
            gp.ui.currentDialogue = "kelar uhuy";
        }
    }
}
