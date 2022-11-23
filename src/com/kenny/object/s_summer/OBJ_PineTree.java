package com.kenny.object.s_summer;

import java.io.IOException;

import javax.imageio.ImageIO;

import com.kenny.entity.Entity;
import com.kenny.main.GamePanel;

public class OBJ_PineTree extends Entity {
	
	public OBJ_PineTree(GamePanel gp) {
		super(gp);
	    
		name = "Pine Tree";
		scalling = 3;
		down1 = setup("/objects/trees/pineTree");
	}

}
