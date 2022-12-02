package com.kenny.main;

import com.kenny.entity.*;
import com.kenny.object.s_autumn.*;
import com.kenny.object.others.*;
import com.kenny.object.s_spring.*;
import com.kenny.object.s_summer.*;
import com.kenny.object.s_winter.*;

public class AssetSetter {

    GamePanel gp;

    public AssetSetter(GamePanel gp) {

        this.gp = gp;
    }

    public void setObject() {

        gp.obj[0] = new OBJ_Bone(gp);
        gp.obj[0].worldX = ((51)) * gp.tileSize;
        gp.obj[0].worldY = ((51)) * gp.tileSize;

		gp.obj[2] = new OBJ_SpringKey(gp);
		gp.obj[2].worldX = (56) *gp.tileSize;
		gp.obj[2].worldY = (94) *gp.tileSize;
		
		gp.obj[3] = new OBJ_SummerKey(gp);
		gp.obj[3].worldX = (36) *gp.tileSize;
		gp.obj[3].worldY = (43) *gp.tileSize;
		
		gp.obj[4] = new OBJ_AutumnKey(gp);
		gp.obj[4].worldX = (57) *gp.tileSize;
		gp.obj[4].worldY = (32) *gp.tileSize;

        gp.obj[5] = new OBJ_WinterGate(gp);
        gp.obj[5].worldX = ((56) - 1) * gp.tileSize;
        gp.obj[5].worldY = ((45) - 1) * gp.tileSize;

        gp.obj[6] = new OBJ_SpringGate(gp);
        gp.obj[6].worldX = ((53) - 1) * gp.tileSize;
        gp.obj[6].worldY = ((45) - 1) * gp.tileSize;

        gp.obj[7] = new OBJ_SummerGate(gp);
        gp.obj[7].worldX = ((55) - 1) * gp.tileSize;
        gp.obj[7].worldY = ((45) - 1) * gp.tileSize;

        gp.obj[8] = new OBJ_AutumnGate(gp);
        gp.obj[8].worldX = ((54) - 1) * gp.tileSize;
        gp.obj[8].worldY = ((45) - 1) * gp.tileSize;

        // ice pile port

        gp.obj[20] = new OBJ_IcePileClose(gp);
        gp.obj[20].worldX = (80) * gp.tileSize;
        gp.obj[20].worldY = (56) * gp.tileSize;

        gp.obj[21] = new OBJ_IcePileOpen(gp);
        gp.obj[21].worldX = (90) * gp.tileSize;
        gp.obj[21].worldY = (53) * gp.tileSize;

        gp.obj[22] = new OBJ_IcePileClose(gp);
        gp.obj[22].worldX = (79) * gp.tileSize;
        gp.obj[22].worldY = (40) * gp.tileSize;

        gp.obj[23] = new OBJ_IcePileOpen(gp);
        gp.obj[23].worldX = (93) * gp.tileSize;
        gp.obj[23].worldY = (45) * gp.tileSize;

        // ice pile slime

        gp.obj[24] = new OBJ_IcePileClose(gp);
        gp.obj[24].worldX = (93) * gp.tileSize;
        gp.obj[24].worldY = (54) * gp.tileSize;

        gp.obj[25] = new OBJ_IcePileOpen(gp);
        gp.obj[25].worldX = (76) * gp.tileSize;
        gp.obj[25].worldY = (55) * gp.tileSize;

        gp.obj[26] = new OBJ_IcePileClose(gp);
        gp.obj[26].worldX = (95) * gp.tileSize;
        gp.obj[26].worldY = (40) * gp.tileSize;

        gp.obj[27] = new OBJ_IcePileOpen(gp);
        gp.obj[27].worldX = (76) * gp.tileSize;
        gp.obj[27].worldY = (38) * gp.tileSize;

        // empty ice pile

        gp.obj[28] = new OBJ_IcePileClose(gp);
        gp.obj[28].worldX = (81) * gp.tileSize;
        gp.obj[28].worldY = (38) * gp.tileSize;

        gp.obj[29] = new OBJ_IcePileOpen(gp);
        gp.obj[29].worldX = (77) * gp.tileSize;
        gp.obj[29].worldY = (42) * gp.tileSize;

        gp.obj[30] = new OBJ_IcePileClose(gp);
        gp.obj[30].worldX = (75) * gp.tileSize;
        gp.obj[30].worldY = (48) * gp.tileSize;

        gp.obj[31] = new OBJ_IcePileOpen(gp);
        gp.obj[31].worldX = (73) * gp.tileSize;
        gp.obj[31].worldY = (50) * gp.tileSize;

        gp.obj[32] = new OBJ_IcePileClose(gp);
        gp.obj[32].worldX = (77) * gp.tileSize;
        gp.obj[32].worldY = (52) * gp.tileSize;

        gp.obj[33] = new OBJ_IcePileOpen(gp);
        gp.obj[33].worldX = (78) * gp.tileSize;
        gp.obj[33].worldY = (57) * gp.tileSize;

        gp.obj[34] = new OBJ_IcePileClose(gp);
        gp.obj[34].worldX = (88) * gp.tileSize;
        gp.obj[34].worldY = (65) * gp.tileSize;

        gp.obj[35] = new OBJ_IcePileOpen(gp);
        gp.obj[35].worldX = (93) * gp.tileSize;
        gp.obj[35].worldY = (50) * gp.tileSize;

        gp.obj[36] = new OBJ_IcePileClose(gp);
        gp.obj[36].worldX = (95) * gp.tileSize;
        gp.obj[36].worldY = (48) * gp.tileSize;

        gp.obj[37] = new OBJ_IcePileOpen(gp);
        gp.obj[37].worldX = (94) * gp.tileSize;
        gp.obj[37].worldY = (42) * gp.tileSize;

        gp.obj[38] = new OBJ_IcePileClose(gp);
        gp.obj[38].worldX = (90) * gp.tileSize;
        gp.obj[38].worldY = (41) * gp.tileSize;

        gp.obj[39] = new OBJ_IcePileOpen(gp);
        gp.obj[39].worldX = (87) * gp.tileSize;
        gp.obj[39].worldY = (38) * gp.tileSize;

        // ice pillar

        gp.obj[11] = new OBJ_IcePillarOff(gp);
        gp.obj[11].worldX = (78) * gp.tileSize;
        gp.obj[11].worldY = (44) * gp.tileSize;

        gp.obj[12] = new OBJ_IcePillarOff(gp);
        gp.obj[12].worldX = (82) * gp.tileSize;
        gp.obj[12].worldY = (40) * gp.tileSize;

        gp.obj[13] = new OBJ_IcePillarOff(gp);
        gp.obj[13].worldX = (88) * gp.tileSize;
        gp.obj[13].worldY = (45) * gp.tileSize;

        gp.obj[14] = new OBJ_IcePillarOff(gp);
        gp.obj[14].worldX = (84) * gp.tileSize;
        gp.obj[14].worldY = (50) * gp.tileSize;

        // tree

        gp.tree[0] = new OBJ_WinterPineTree(gp);
        gp.tree[0].worldX = (72) * gp.tileSize;
        gp.tree[0].worldY = (37) * gp.tileSize;

        gp.tree[1] = new OBJ_WinterSpruce(gp);
        gp.tree[1].worldX = (70) * gp.tileSize;
        gp.tree[1].worldY = (34) * gp.tileSize;

        gp.tree[2] = new OBJ_WinterPineTree(gp);
        gp.tree[2].worldX = (74) * gp.tileSize;
        gp.tree[2].worldY = (30) * gp.tileSize;

        gp.tree[3] = new OBJ_WinterSpruce(gp);
        gp.tree[3].worldX = (77) * gp.tileSize;
        gp.tree[3].worldY = (32) * gp.tileSize;

        gp.tree[4] = new OBJ_WinterPineTree(gp);
        gp.tree[4].worldX = (80) * gp.tileSize;
        gp.tree[4].worldY = (30) * gp.tileSize;

        gp.tree[5] = new OBJ_WinterSpruce(gp);
        gp.tree[5].worldX = (84) * gp.tileSize;
        gp.tree[5].worldY = (32) * gp.tileSize;

        gp.tree[6] = new OBJ_WinterPineTree(gp);
        gp.tree[6].worldX = (87) * gp.tileSize;
        gp.tree[6].worldY = (31) * gp.tileSize;

        gp.tree[7] = new OBJ_WinterSpruce(gp);
        gp.tree[7].worldX = (88) * gp.tileSize;
        gp.tree[7].worldY = (33) * gp.tileSize;

        gp.tree[8] = new OBJ_WinterPineTree(gp);
        gp.tree[8].worldX = (92) * gp.tileSize;
        gp.tree[8].worldY = (32) * gp.tileSize;

        gp.tree[9] = new OBJ_WinterSpruce(gp);
        gp.tree[9].worldX = (97) * gp.tileSize;
        gp.tree[9].worldY = (31) * gp.tileSize;

        gp.tree[10] = new OBJ_WinterPineTree(gp);
        gp.tree[10].worldX = (96) * gp.tileSize;
        gp.tree[10].worldY = (35) * gp.tileSize;

        gp.tree[11] = new OBJ_WinterSpruce(gp);
        gp.tree[11].worldX = (97) * gp.tileSize;
        gp.tree[11].worldY = (39) * gp.tileSize;

        gp.tree[12] = new OBJ_WinterPineTree(gp);
        gp.tree[12].worldX = (98) * gp.tileSize;
        gp.tree[12].worldY = (43) * gp.tileSize;

        gp.tree[13] = new OBJ_WinterSpruce(gp);
        gp.tree[13].worldX = (96) * gp.tileSize;
        gp.tree[13].worldY = (50) * gp.tileSize;

        gp.tree[14] = new OBJ_WinterPineTree(gp);
        gp.tree[14].worldX = (97) * gp.tileSize;
        gp.tree[14].worldY = (53) * gp.tileSize;

        gp.tree[15] = new OBJ_WinterSpruce(gp);
        gp.tree[15].worldX = (95) * gp.tileSize;
        gp.tree[15].worldY = (55) * gp.tileSize;

        gp.tree[16] = new OBJ_WinterPineTree(gp);
        gp.tree[16].worldX = (92) * gp.tileSize;
        gp.tree[16].worldY = (57) * gp.tileSize;

        gp.tree[17] = new OBJ_WinterSpruce(gp);
        gp.tree[17].worldX = (88) * gp.tileSize;
        gp.tree[17].worldY = (57) * gp.tileSize;

        gp.tree[18] = new OBJ_WinterPineTree(gp);
        gp.tree[18].worldX = (83) * gp.tileSize;
        gp.tree[18].worldY = (58) * gp.tileSize;

        gp.tree[19] = new OBJ_WinterSpruce(gp);
        gp.tree[19].worldX = (79) * gp.tileSize;
        gp.tree[19].worldY = (57) * gp.tileSize;

        gp.tree[20] = new OBJ_WinterPineTree(gp);
        gp.tree[20].worldX = (74) * gp.tileSize;
        gp.tree[20].worldY = (57) * gp.tileSize;

        gp.tree[21] = new OBJ_WinterSpruce(gp);
        gp.tree[21].worldX = (72) * gp.tileSize;
        gp.tree[21].worldY = (55) * gp.tileSize;

        gp.tree[22] = new OBJ_WinterSpruce(gp);
        gp.tree[22].worldX = (70) * gp.tileSize;
        gp.tree[22].worldY = (51) * gp.tileSize;

    }

    public void setNPC() {

        gp.npc[0] = new NPC_MrSnow(gp);
        gp.npc[0].worldX = 69 * gp.tileSize;
        gp.npc[0].worldY = 48 * gp.tileSize;

        gp.npc[1] = new NPC_Drac(gp);
        gp.npc[1].worldX = 58 * gp.tileSize;
        gp.npc[1].worldY = 62 * gp.tileSize;

        gp.npc[2] = new NPC_Bulky(gp);
        gp.npc[2].worldX = 56 * gp.tileSize;
        gp.npc[2].worldY = 34 * gp.tileSize;

        gp.npc[3] = new NPC_PinaKoolada(gp);
        gp.npc[3].worldX = 38 * gp.tileSize;
        gp.npc[3].worldY = 43 * gp.tileSize;
    }
}
