package com.kenny.object.s_winter;

import com.kenny.entity.Entity;
import com.kenny.main.GamePanel;

public class OBJ_WinterPillarOn extends Entity {

    GamePanel gp;

    public OBJ_WinterPillarOn(GamePanel gp) {

        super(gp);

        this.gp = gp;

        name = "Winter Pillar";
        type = type_pillarOn;
        down1 = setup("/objects/gates/gatePillar_winterOn");
        setSolidArea(0, 0, 48, 48);
        collision = true;
    }

    public void interact(int i) {

        gp.gameState = gp.dialogueState;
        gp.ui.currentDialogue = "Pillar Activated";
    }

}
