package com.kenny.object.s_spring;

import com.kenny.entity.Entity;
import com.kenny.main.GamePanel;
import com.kenny.object.s_autumn.AutumnGateOff;
import com.kenny.object.s_autumn.AutumnGateOn;
import com.kenny.object.s_autumn.AutumnPillarOn;

public class SpringKey extends Entity {

    GamePanel gp;

    public SpringKey(GamePanel gp) {

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
        
        

        int objIndex = getDetected(entity, gp.obj, "Spring Pillar");

        if (objIndex != 999) {
            gp.playSfx(7);
            gp.ui.currentDialogue = "You use the " + name + "\nand open the Spring Gate";
            gp.obj[objIndex] = null;

            gp.obj[objIndex] = null;
            gp.obj[objIndex] = new SpringPillarOn(gp);
            gp.obj[objIndex].worldX = ((49)) * gp.tileSize;
            gp.obj[objIndex].worldY = ((52)) * gp.tileSize;

            gp.obj[6] = null;
            gp.obj[6] = new SpringGateOn(gp);
            gp.obj[6].worldX = ((53)) * gp.tileSize;
            gp.obj[6].worldY = ((45)) * gp.tileSize;
            
            gp.player.gate[2] = 0;
            gp.player.finish();

            return true;
        } else {
            gp.ui.currentDialogue = "What are you doing?\nYou can only use this key to associated gate";
            return false;
        }
    }
}
