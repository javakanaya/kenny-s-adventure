package com.kenny.main;

import com.kenny.object.OBJ_Tree;

public class AssetSetter {
	
	GamePanel gp;
	
	public AssetSetter(GamePanel gp) {
		this.gp = gp;
	}
	
	public void setObject() {
		
		gp.obj[3] = new OBJ_Tree();
		gp.obj[3].worldX = 42 * gp.tileSize;
		gp.obj[3].worldY = 24 * gp.tileSize;
		
		gp.obj[2] = new OBJ_Tree();
		gp.obj[2].worldX = 41 * gp.tileSize;
		gp.obj[2].worldY = 23 * gp.tileSize;
		
		gp.obj[0] = new OBJ_Tree();
		gp.obj[0].worldX = 42 * gp.tileSize;
		gp.obj[0].worldY = 22 * gp.tileSize;
		
		gp.obj[1] = new OBJ_Tree();
		gp.obj[1].worldX = 43 * gp.tileSize;
		gp.obj[1].worldY = 23 * gp.tileSize;
	}
}
