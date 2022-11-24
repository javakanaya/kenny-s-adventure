package com.kenny.object.s_summer;

import java.io.IOException;

import javax.imageio.ImageIO;

import com.kenny.entity.Entity;
import com.kenny.main.GamePanel;

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

        int objIndex = getDetected(entity, gp.obj, "Summer Gate");

        if (objIndex != 999) {
            gp.ui.currentDialogue = "You use the " + name + "\nand open the Summer Gate";
            gp.obj[objIndex] = null;
            return true;
        } else {
            gp.ui.currentDialogue = "What are you doing?\nYou can only use this key to associated gate";
            return false;
        }
    }
}
