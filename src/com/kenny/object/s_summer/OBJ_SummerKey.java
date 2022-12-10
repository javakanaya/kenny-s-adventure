package com.kenny.object.s_summer;

import com.kenny.entity.Entity;
import com.kenny.main.GamePanel;
import com.kenny.object.s_spring.OBJ_SpringGateOn;
import com.kenny.object.s_spring.OBJ_SpringPillarOn;

public class OBJ_SummerKey extends Entity {

    GamePanel gp;

    public OBJ_SummerKey(GamePanel gp) {

        super(gp);

        this.gp = gp;

        type = type_consumable;
        name = "Summer Key";
        down1 = setup("/objects/keys/summerKey");
        description = "[" + name + "]\nUnlock associated gate";
    }

    @Override
    public boolean use(Entity entity) {

        gp.gameState = gp.dialogueState;

        int objIndex = getDetected(entity, gp.obj, "Summer Pillar");

        if (objIndex != 999) {
            gp.ui.currentDialogue = "You use the " + name + "\nand open the Summer Gate";
            gp.obj[objIndex] = null;
            
            gp.obj[objIndex] = null;
            gp.obj[objIndex] = new OBJ_SummerPillarOn(gp);
            gp.obj[objIndex].worldX = ((58) ) * gp.tileSize;
            gp.obj[objIndex].worldY = ((50) ) * gp.tileSize;
            
            gp.obj[7] = null;
            gp.obj[7] = new OBJ_SummerGateOn(gp);
            gp.obj[7].worldX = ((55) ) * gp.tileSize;
            gp.obj[7].worldY = ((45) ) * gp.tileSize;
            return true;
        } else {
            gp.ui.currentDialogue = "What are you doing?\nYou can only use this key to associated gate";
            return false;
        }
    }
}
