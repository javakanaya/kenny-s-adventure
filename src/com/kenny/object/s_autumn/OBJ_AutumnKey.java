package com.kenny.object.s_autumn;

import com.kenny.entity.Entity;
import com.kenny.main.GamePanel;
import com.kenny.object.s_summer.OBJ_SummerGateOff;

public class OBJ_AutumnKey extends Entity {

    GamePanel gp;

    public OBJ_AutumnKey(GamePanel gp) {

        super(gp);

        this.gp = gp;

        type = type_consumable;
        name = "Autumn Key";
        down1 = setup("/objects/keys/autumnKey");
        description = "[" + name + "]\nUnlock associated gate";
    }

    @Override
    public boolean use(Entity entity) {

        gp.gameState = gp.dialogueState;

        int objIndex = getDetected(entity, gp.obj, "Autumn Pillar");

        if (objIndex != 999) {
            gp.ui.currentDialogue = "You use the " + name + "\nand activate the Autumn Gate";
            gp.obj[objIndex] = null;
            gp.obj[objIndex] = new OBJ_AutumnPillarOn(gp);
            gp.obj[objIndex].worldX = ((51) ) * gp.tileSize;
            gp.obj[objIndex].worldY = ((50) ) * gp.tileSize;
            
            gp.obj[8] = null;
            gp.obj[8] = new OBJ_AutumnGateOn(gp);
            gp.obj[8].worldX = ((54) ) * gp.tileSize;
            gp.obj[8].worldY = ((45) ) * gp.tileSize;
            return true;
        } else {
            gp.ui.currentDialogue = "What are you doing?\nYou can only use this key to associated pillar";
            return false;
        }
    }
}
