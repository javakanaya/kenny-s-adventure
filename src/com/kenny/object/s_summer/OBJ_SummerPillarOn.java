package com.kenny.object.s_summer;

import com.kenny.entity.Entity;
import com.kenny.main.GamePanel;

public class OBJ_SummerPillarOn extends Entity {

    GamePanel gp;

    public OBJ_SummerPillarOn(GamePanel gp) {

        super(gp);

        this.gp = gp;

        name = "Summer Pillar";
        type = type_pillarOn;
        down1 = setup("/objects/gates/gatePillar_summerOn");
        setSolidArea(0, 0, 48, 48);
        collision = true;
    }

    public void interact(int i) {

        gp.gameState = gp.dialogueState;
        gp.ui.currentDialogue = "Pillar Activated";
    }

}
