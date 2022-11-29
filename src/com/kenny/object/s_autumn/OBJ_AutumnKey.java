package com.kenny.object.s_autumn;

import com.kenny.entity.Entity;
import com.kenny.main.GamePanel;

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

        int objIndex = getDetected(entity, gp.obj, "Autumn Gate");

        if (objIndex != 999) {
            gp.ui.currentDialogue = "You use the " + name + "\nand open the Autumn Gate";
            gp.obj[objIndex] = null;
            return true;
        } else {
            gp.ui.currentDialogue = "What are you doing?\nYou can only use this key to associated gate";
            return false;
        }
    }
}
