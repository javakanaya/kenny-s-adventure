package com.kenny.object.s_spring;

import com.kenny.entity.Entity;
import com.kenny.main.GamePanel;

public class OBJ_SpringKey extends Entity {

    GamePanel gp;

    public OBJ_SpringKey(GamePanel gp) {

        super(gp);

        this.gp = gp;

        type = type_consumable;
        name = "Spring Key";
        down1 = setup("/objects/keys/springKey");
        description = "[" + name + "]\nUnlock associated gate";
    }

    @Override
    public boolean use(Entity entity) {

        gp.gameState = gp.dialogueState;

        int objIndex = getDetected(entity, gp.obj, "Spring Gate");

        if (objIndex != 999) {
            gp.ui.currentDialogue = "You use the " + name + "\nand open the Spring Gate";
            gp.obj[objIndex] = null;
            return true;
        } else {
            gp.ui.currentDialogue = "What are you doing?\nYou can only use this key to associated gate";
            return false;
        }
    }
}
