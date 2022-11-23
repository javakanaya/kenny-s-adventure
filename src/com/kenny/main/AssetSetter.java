package com.kenny.main;

import com.kenny.entity.NPC_Bulky;
import com.kenny.entity.NPC_Drac;
import com.kenny.entity.NPC_MrSnow;
import com.kenny.entity.NPC_PinaKoolada;
import com.kenny.object.others.OBJ_Bone;
import com.kenny.object.s_autumn.OBJ_AutumnGate;
import com.kenny.object.s_autumn.OBJ_AutumnKey;
import com.kenny.object.s_spring.OBJ_SpringGate;
import com.kenny.object.s_spring.OBJ_SpringKey;
import com.kenny.object.s_summer.OBJ_AppleTree;
import com.kenny.object.s_summer.OBJ_BanyanTree;
import com.kenny.object.s_summer.OBJ_BonzaiTree;
import com.kenny.object.s_summer.OBJ_MapleTree;
import com.kenny.object.s_summer.OBJ_PineTree;
import com.kenny.object.s_summer.OBJ_SpruceTree;
import com.kenny.object.s_summer.OBJ_SummerGate;
import com.kenny.object.s_summer.OBJ_SummerKey;
import com.kenny.object.s_winter.OBJ_IcePileClose;
import com.kenny.object.s_winter.OBJ_IcePileOpen;
import com.kenny.object.s_winter.OBJ_IcePillarOff;
import com.kenny.object.s_winter.OBJ_IcePillarOn;
import com.kenny.object.s_winter.OBJ_WinterGate;
import com.kenny.object.s_winter.OBJ_WinterKey;

public class AssetSetter {
    
	GamePanel gp;
	
	public AssetSetter(GamePanel gp) {
	    
		this.gp = gp;
	}
	
	public void setObject() {

	    gp.obj[0] = new OBJ_Bone(gp);
	    gp.obj[0].worldX = ((51)) *gp.tileSize;
	    gp.obj[0].worldY = ((51)) *gp.tileSize;
	    
//		gp.obj[1] = new WinterKey(gp);
//		gp.obj[1].worldX = (84) *gp.tileSize;
//		gp.obj[1].worldY = (47) *gp.tileSize;
		
		gp.obj[2] = new OBJ_SpringKey(gp);
		gp.obj[2].worldX = ((50) - 1) *gp.tileSize;
		gp.obj[2].worldY = ((60) - 1) *gp.tileSize;
		
		gp.obj[3] = new OBJ_SummerKey(gp);
		gp.obj[3].worldX = ((40) - 1) *gp.tileSize;
		gp.obj[3].worldY = ((50) - 1) *gp.tileSize;
		
		gp.obj[4] = new OBJ_AutumnKey(gp);
		gp.obj[4].worldX = ((50) - 1) *gp.tileSize;
		gp.obj[4].worldY = ((40) - 1) *gp.tileSize;
		
		gp.obj[5] = new OBJ_WinterGate(gp);
		gp.obj[5].worldX = ((55) - 1) *gp.tileSize;
		gp.obj[5].worldY = ((50) - 1) *gp.tileSize;
//		
//		gp.obj[6] = new SpringGate(gp);
//		gp.obj[6].worldX = ((50) - 1) *gp.tileSize;
//		gp.obj[6].worldY = ((55) - 1) *gp.tileSize;
//		
//		gp.obj[7] = new SummerGate(gp);
//		gp.obj[7].worldX = ((45) - 1) *gp.tileSize;
//		gp.obj[7].worldY = ((50) - 1) *gp.tileSize;
//		
//		gp.obj[8] = new AutumnGate(gp);
//		gp.obj[8].worldX = ((50) - 1) *gp.tileSize;
//		gp.obj[8].worldY = ((45) - 1) *gp.tileSize;
		
		//ice pile
		
		gp.obj[20] = new OBJ_IcePileClose(gp);
	    gp.obj[20].worldX = (80) *gp.tileSize;
	    gp.obj[20].worldY = (56) *gp.tileSize;
	    
	    gp.obj[21] = new OBJ_IcePileOpen(gp);
	    gp.obj[21].worldX = (90) *gp.tileSize;
	    gp.obj[21].worldY = (53) *gp.tileSize;
	    
	    gp.obj[22] = new OBJ_IcePileClose(gp);
	    gp.obj[22].worldX = (79) *gp.tileSize;
	    gp.obj[22].worldY = (40) *gp.tileSize;
	    
	    gp.obj[23] = new OBJ_IcePileOpen(gp);
	    gp.obj[23].worldX = (93) *gp.tileSize;
	    gp.obj[23].worldY = (45) *gp.tileSize;
	
	    
	    //ice pillar
	    
	    gp.obj[11] = new OBJ_IcePillarOff(gp);
	    gp.obj[11].worldX = (78) *gp.tileSize;
	    gp.obj[11].worldY = (44) *gp.tileSize;
	    
	    gp.obj[12] = new OBJ_IcePillarOff(gp);
	    gp.obj[12].worldX = (82) *gp.tileSize;
	    gp.obj[12].worldY = (40) *gp.tileSize;
	    
	    gp.obj[13] = new OBJ_IcePillarOff(gp);
	    gp.obj[13].worldX = (88) *gp.tileSize;
	    gp.obj[13].worldY = (45) *gp.tileSize;
	    
	    gp.obj[14] = new OBJ_IcePillarOff(gp);
	    gp.obj[14].worldX = (84) *gp.tileSize;
	    gp.obj[14].worldY = (50) *gp.tileSize;
	    
	    //tree
		
		gp.tree[0] = new OBJ_PineTree(gp);
        gp.tree[0].worldX = (72) *gp.tileSize;
        gp.tree[0].worldY = (37) *gp.tileSize;
        
        gp.tree[1] = new OBJ_PineTree(gp);
        gp.tree[1].worldX = (30) *gp.tileSize;
        gp.tree[1].worldY = (30) *gp.tileSize;
        
        gp.tree[2] = new OBJ_PineTree(gp);
        gp.tree[2].worldX = (25) *gp.tileSize;
        gp.tree[2].worldY = (30) *gp.tileSize;
        
        gp.tree[3] = new OBJ_PineTree(gp);
        gp.tree[3].worldX = (30) *gp.tileSize;
        gp.tree[3].worldY = (25) *gp.tileSize;
        
        gp.tree[4] = new OBJ_PineTree(gp);
        gp.tree[4].worldX = (35) *gp.tileSize;
        gp.tree[4].worldY = (30) *gp.tileSize;
        
        gp.tree[5] = new OBJ_PineTree(gp);
        gp.tree[5].worldX = (25) *gp.tileSize;
        gp.tree[5].worldY = (35) *gp.tileSize;
        
        gp.tree[5] = new OBJ_PineTree(gp);
        gp.tree[5].worldX = (35) *gp.tileSize;
        gp.tree[5].worldY = (35) *gp.tileSize;
        

	}
	
	public void setNPC() {
	    
	    gp.npc[0] = new NPC_MrSnow(gp);
	    gp.npc[0].worldX = 69 *gp.tileSize;
        gp.npc[0].worldY = 48 *gp.tileSize;
        
        gp.npc[2] = new NPC_Bulky(gp);
	    gp.npc[2].worldX = ((42) - 1) *gp.tileSize;
        gp.npc[2].worldY = ((50) - 1) *gp.tileSize;
        
        gp.npc[3] = new NPC_PinaKoolada(gp);
	    gp.npc[3].worldX = ((50) - 1) *gp.tileSize;
        gp.npc[3].worldY = ((42) - 1) *gp.tileSize;
	    
        gp.npc[1] = new NPC_Drac(gp);
        gp.npc[1].worldX = ((50) - 1) *gp.tileSize;
        gp.npc[1].worldY = ((57) - 1) *gp.tileSize;
	}
}
