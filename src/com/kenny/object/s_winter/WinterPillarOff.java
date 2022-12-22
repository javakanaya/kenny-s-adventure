package com.kenny.object.s_winter;

import com.kenny.entity.Entity;
import com.kenny.main.GamePanel;

public class WinterPillarOff extends Entity {

    GamePanel gp;

    public WinterPillarOff(GamePanel gp) {

        super(gp);

        this.gp = gp;

        name = "Winter Pillar";
        type = type_pillarOff;
        down1 = setup("/objects/gates/gatePillar_winter");
        setSolidArea(0, 0, 48, 48);
        collision = true;
    }

    public void interact(int i) {

        gp.gameState = gp.dialogueState;
        gp.ui.currentDialogue = "You need a key to activate this pillar";
    }

}
