package com.kenny.object.s_summer;

import com.kenny.entity.Entity;
import com.kenny.main.GamePanel;

public class SummerGateOn extends Entity {

    GamePanel gp;

    public SummerGateOn(GamePanel gp) {

        super(gp);

        this.gp = gp;

        name = "Summer Gate";
        type = type_gate;
        scallingY = 4;
        down1 = setup("/objects/gates/summerGateOn");
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
