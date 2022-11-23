package com.kenny.object.s_summer;

import java.io.IOException;

import javax.imageio.ImageIO;

import com.kenny.entity.Entity;
import com.kenny.main.GamePanel;

public class OBJ_MapleTree extends Entity {
	
	public OBJ_MapleTree(GamePanel gp) {
		super(gp);
	    
		name = "Maple Tree";
        scallingX = 3;
        scallingY = 3;
		down1 = setup("/objects/trees/mapleTree");
	}

}
