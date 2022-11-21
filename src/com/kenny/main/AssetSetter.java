package com.kenny.main;

import com.kenny.entity.NPC_Bulky;
import com.kenny.entity.NPC_Drac;
import com.kenny.entity.NPC_MrSnow;
import com.kenny.entity.NPC_PinaKoolada;
import com.kenny.object.gatekey.AutumnGate;
import com.kenny.object.gatekey.AutumnKey;
import com.kenny.object.gatekey.Bone;
import com.kenny.object.gatekey.IcePillarOn;
import com.kenny.object.gatekey.IcePileClose;
import com.kenny.object.gatekey.IcePileOpen;
import com.kenny.object.gatekey.IcePillarOff;
import com.kenny.object.gatekey.SpringGate;
import com.kenny.object.gatekey.SpringKey;
import com.kenny.object.gatekey.SummerGate;
import com.kenny.object.gatekey.SummerKey;
import com.kenny.object.gatekey.WinterGate;
import com.kenny.object.gatekey.WinterKey;
import com.kenny.object.tree.AppleTree;
import com.kenny.object.tree.BanyanTree;
import com.kenny.object.tree.BonzaiTree;
import com.kenny.object.tree.MapleTree;
import com.kenny.object.tree.PineTree;
import com.kenny.object.tree.SpruceTree;

public class AssetSetter {
    
	GamePanel gp;
	
	public AssetSetter(GamePanel gp) {
	    
		this.gp = gp;
	}
	
	public void setObject() {

	    gp.obj[0] = new Bone(gp);
	    gp.obj[0].worldX = ((51)) *gp.tileSize;
	    gp.obj[0].worldY = ((51)) *gp.tileSize;
	    
		gp.obj[1] = new WinterKey(gp);
		gp.obj[1].worldX = (84) *gp.tileSize;
		gp.obj[1].worldY = (47) *gp.tileSize;
		
		gp.obj[2] = new SpringKey(gp);
		gp.obj[2].worldX = ((50) - 1) *gp.tileSize;
		gp.obj[2].worldY = ((60) - 1) *gp.tileSize;
		
		gp.obj[3] = new SummerKey(gp);
		gp.obj[3].worldX = ((40) - 1) *gp.tileSize;
		gp.obj[3].worldY = ((50) - 1) *gp.tileSize;
		
		gp.obj[4] = new AutumnKey(gp);
		gp.obj[4].worldX = ((50) - 1) *gp.tileSize;
		gp.obj[4].worldY = ((40) - 1) *gp.tileSize;
		
		gp.obj[5] = new WinterGate(gp);
		gp.obj[5].worldX = ((55) - 1) *gp.tileSize;
		gp.obj[5].worldY = ((50) - 1) *gp.tileSize;
		
		gp.obj[6] = new SpringGate(gp);
		gp.obj[6].worldX = ((50) - 1) *gp.tileSize;
		gp.obj[6].worldY = ((55) - 1) *gp.tileSize;
		
		gp.obj[7] = new SummerGate(gp);
		gp.obj[7].worldX = ((45) - 1) *gp.tileSize;
		gp.obj[7].worldY = ((50) - 1) *gp.tileSize;
		
		gp.obj[8] = new AutumnGate(gp);
		gp.obj[8].worldX = ((50) - 1) *gp.tileSize;
		gp.obj[8].worldY = ((45) - 1) *gp.tileSize;
		
		//ice pile
		
		gp.obj[20] = new IcePileClose(gp);
	    gp.obj[20].worldX = (75) *gp.tileSize;
	    gp.obj[20].worldY = (50) *gp.tileSize;
	    
	    gp.obj[21] = new IcePileOpen(gp);
	    gp.obj[21].worldX = (75) *gp.tileSize;
	    gp.obj[21].worldY = (45) *gp.tileSize;
	    
	    //ice pillar
	    
	    gp.obj[11] = new IcePillarOff(gp);
	    gp.obj[11].worldX = (81) *gp.tileSize;
	    gp.obj[11].worldY = (42) *gp.tileSize;
	    
	    gp.obj[12] = new IcePillarOff(gp);
	    gp.obj[12].worldX = (86) *gp.tileSize;
	    gp.obj[12].worldY = (42) *gp.tileSize;
	    
	    gp.obj[13] = new IcePillarOff(gp);
	    gp.obj[13].worldX = (81) *gp.tileSize;
	    gp.obj[13].worldY = (48) *gp.tileSize;
	    
	    gp.obj[14] = new IcePillarOff(gp);
	    gp.obj[14].worldX = (86) *gp.tileSize;
	    gp.obj[14].worldY = (48) *gp.tileSize;
	    
	    //tree
		
		gp.tree[0] = new AppleTree();
        gp.tree[0].worldX = (20) *gp.tileSize;
        gp.tree[0].worldY = (15) *gp.tileSize;
        
        gp.tree[1] = new BanyanTree();
        gp.tree[1].worldX = (30) *gp.tileSize;
        gp.tree[1].worldY = (30) *gp.tileSize;
        
        gp.tree[2] = new BonzaiTree();
        gp.tree[2].worldX = (25) *gp.tileSize;
        gp.tree[2].worldY = (30) *gp.tileSize;
        
        gp.tree[3] = new MapleTree();
        gp.tree[3].worldX = (30) *gp.tileSize;
        gp.tree[3].worldY = (25) *gp.tileSize;
        
        gp.tree[4] = new PineTree();
        gp.tree[4].worldX = (35) *gp.tileSize;
        gp.tree[4].worldY = (30) *gp.tileSize;
        
        gp.tree[5] = new SpruceTree();
        gp.tree[5].worldX = (25) *gp.tileSize;
        gp.tree[5].worldY = (35) *gp.tileSize;
        
        gp.tree[5] = new MapleTree();
        gp.tree[5].worldX = (35) *gp.tileSize;
        gp.tree[5].worldY = (35) *gp.tileSize;
        

	}
	
	public void setNPC() {
	    
	    gp.npc[0] = new NPC_MrSnow(gp);
	    gp.npc[0].worldX = ((70) - 1) *gp.tileSize;
        gp.npc[0].worldY = ((48) - 1) *gp.tileSize;
        
        gp.npc[1] = new NPC_Drac(gp);
	    gp.npc[1].worldX = ((50) - 1) *gp.tileSize;
        gp.npc[1].worldY = ((57) - 1) *gp.tileSize;
        
        gp.npc[2] = new NPC_Bulky(gp);
	    gp.npc[2].worldX = ((42) - 1) *gp.tileSize;
        gp.npc[2].worldY = ((50) - 1) *gp.tileSize;
        
        gp.npc[3] = new NPC_PinaKoolada(gp);
	    gp.npc[3].worldX = ((50) - 1) *gp.tileSize;
        gp.npc[3].worldY = ((42) - 1) *gp.tileSize;
	    
	}
}
