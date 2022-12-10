package com.kenny.object.s_winter;

import com.kenny.entity.Entity;
import com.kenny.main.GamePanel;
import com.kenny.object.s_summer.OBJ_SummerGateOn;
import com.kenny.object.s_summer.OBJ_SummerPillarOn;

public class OBJ_WinterKey extends Entity {

    GamePanel gp;

    public OBJ_WinterKey(GamePanel gp) {

        super(gp);

        this.gp = gp;
        type = type_consumable;
        name = "Winter Key";
        down1 = setup("/objects/keys/winterKey");
        description = "[" + name + "]\nUnlock associated gate";
    }

    @Override
    public boolean use(Entity entity) {

        gp.gameState = gp.dialogueState;

        int objIndex = getDetected(entity, gp.obj, "Winter Pillar");

        if (objIndex != 999) {
            gp.ui.currentDialogue = "You use the " + name + "\nand open the Winter Gate";
            gp.obj[objIndex] = null;
            
            gp.obj[objIndex] = null;
            gp.obj[objIndex] = new OBJ_WinterPillarOn(gp);
            gp.obj[objIndex].worldX = ((60) ) * gp.tileSize;
            gp.obj[objIndex].worldY = ((52) ) * gp.tileSize;
            
            gp.obj[7] = null;
            gp.obj[7] = new OBJ_WinterGateOn(gp);
            gp.obj[7].worldX = ((56) ) * gp.tileSize;
            gp.obj[7].worldY = ((45) ) * gp.tileSize;
            return true;
        } else {
            gp.ui.currentDialogue = "What are you doing?\nYou can only use this key to associated gate";
            return false;
        }
    }

}
