package com.kenny.object.s_winter;

import java.io.IOException;

import javax.imageio.ImageIO;

import com.kenny.entity.Entity;
import com.kenny.main.GamePanel;

public class OBJ_WinterPineTree extends Entity {
	
	public OBJ_WinterPineTree(GamePanel gp) {
		super(gp);
	    
		name = "Pine Tree";
        scallingX = 4;
        scallingY = 4;
		down1 = setup("/objects/trees/winterPine");
	}

}
