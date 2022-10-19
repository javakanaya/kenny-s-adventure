package com.kenny.main;

import com.kenny.object.OBJ_Testing;

public class AssetSetter {
	
	GamePanel gp;
	
	public AssetSetter(GamePanel gp) {
		this.gp = gp;
	}
	
	public void setObject() {
		
		gp.obj[0] = new OBJ_Testing();
		gp.obj[0].worldX = 25 * gp.tileSize;
		gp.obj[0].worldY = 25 * gp.tileSize;
	}
}
