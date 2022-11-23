package com.kenny.object.s_summer;

import java.io.IOException;

import javax.imageio.ImageIO;

import com.kenny.entity.Entity;
import com.kenny.main.GamePanel;

public class OBJ_SpruceTree extends Entity {
	
	public OBJ_SpruceTree(GamePanel gp) {
	    super(gp);
		
		name = "Spruce Tree";
		scalling = 3;
		down1 = setup("/objects/trees/spruceTree");
	}

}