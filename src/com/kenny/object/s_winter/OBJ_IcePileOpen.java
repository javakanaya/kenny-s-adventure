package com.kenny.object.s_winter;

import com.kenny.entity.Entity;
import com.kenny.entity.NPC_WinterSlime;
import com.kenny.main.GamePanel;

public class OBJ_IcePileOpen extends Entity {

    GamePanel gp;

    public OBJ_IcePileOpen(GamePanel gp) {
        super(gp);

        this.gp = gp;

        name = "Ice Pile Open";
        type = type_pile;
        down1 = setup("/objects/others/icePileOpen");
        collision = true;
    }

    public void interact(int i) {

        gp.obj[i] = null;
        gp.ui.showMessage("Ice Pile Destroyed!");

        if (i == 25) {
            gp.npc[5] = new NPC_WinterSlime(gp);
            gp.npc[5].worldX = 76 * gp.tileSize;
            gp.npc[5].worldY = 55 * gp.tileSize;
        } else if (i == 27) {
            gp.npc[7] = new NPC_WinterSlime(gp);
            gp.npc[7].worldX = 76 * gp.tileSize;
            gp.npc[7].worldY = 38 * gp.tileSize;
        }
    }
}
