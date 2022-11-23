package com.kenny.object.s_summer;

import java.io.IOException;

import javax.imageio.ImageIO;

import com.kenny.entity.Entity;
import com.kenny.main.GamePanel;

public class OBJ_AppleTree extends Entity {
	
	public OBJ_AppleTree(GamePanel gp) {
	    super(gp);
		
		name = "Apple Tree";
        scallingX = 3;
        scallingY = 3;
		down1 = setup("/objects/trees/appleTree");
	}

}
