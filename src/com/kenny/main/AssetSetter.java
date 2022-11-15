package com.kenny.main;

import com.kenny.object.gatekey.AutumnGate;
import com.kenny.object.gatekey.AutumnKey;
import com.kenny.object.gatekey.Bone;
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

		gp.obj[0] = new WinterKey(gp);
		gp.obj[0].worldX = ((48) - 1) *gp.tileSize;
		gp.obj[0].worldY = ((29) - 1) *gp.tileSize;
		
		gp.obj[2] = new Bone(gp);
		gp.obj[2].worldX = ((24) - 1) *gp.tileSize;
		gp.obj[2].worldY = ((23) - 1) *gp.tileSize;
		
		gp.obj[3] = new SpringKey(gp);
		gp.obj[3].worldX = ((24) - 1) *gp.tileSize;
		gp.obj[3].worldY = ((48) - 1) *gp.tileSize;
		
		gp.obj[4] = new SummerKey(gp);
		gp.obj[4].worldX = ((3) - 1) *gp.tileSize;
		gp.obj[4].worldY = ((28) - 1) *gp.tileSize;
		
		gp.obj[5] = new AutumnKey(gp);
		gp.obj[5].worldX = ((24) - 1) *gp.tileSize;
		gp.obj[5].worldY = ((2) - 1) *gp.tileSize;
		
		gp.obj[1] = new WinterGate(gp);
		gp.obj[1].worldX = ((25) - 1) *gp.tileSize;
		gp.obj[1].worldY = ((27) - 1) *gp.tileSize;
		
		gp.obj[6] = new SpringGate(gp);
		gp.obj[6].worldX = ((23) - 1) *gp.tileSize;
		gp.obj[6].worldY = ((29) - 1) *gp.tileSize;
		
		gp.obj[7] = new SummerGate(gp);
		gp.obj[7].worldX = ((21) - 1) *gp.tileSize;
		gp.obj[7].worldY = ((27) - 1) *gp.tileSize;
		
		gp.obj[8] = new AutumnGate(gp);
		gp.obj[8].worldX = ((23) - 1) *gp.tileSize;
		gp.obj[8].worldY = ((25) - 1) *gp.tileSize;
	}
}
