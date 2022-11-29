package com.kenny.object.s_winter;

import com.kenny.entity.Entity;
import com.kenny.entity.NPC_WinterSlime;
import com.kenny.main.GamePanel;

public class OBJ_IcePileClose extends Entity {

    GamePanel gp;

    public OBJ_IcePileClose(GamePanel gp) {

        super(gp);

        this.gp = gp;

        name = "Ice Pile Close";
        type = type_pile;
        down1 = setup("/objects/others/icePileClose");
        collision = true;
    }

    public void interact(int i) {

        gp.obj[i] = null;
        gp.ui.showMessage("Ice Pile Destroyed!");

        if (i == 24) {
            gp.npc[4] = new NPC_WinterSlime(gp);
            gp.npc[4].worldX = 93 * gp.tileSize;
            gp.npc[4].worldY = 54 * gp.tileSize;
        } else if (i == 26) {
            gp.npc[6] = new NPC_WinterSlime(gp);
            gp.npc[6].worldX = 95 * gp.tileSize;
            gp.npc[6].worldY = 40 * gp.tileSize;
        }
    }
}
