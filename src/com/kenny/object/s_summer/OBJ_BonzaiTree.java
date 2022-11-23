package com.kenny.object.s_summer;

import java.io.IOException;

import javax.imageio.ImageIO;

import com.kenny.entity.Entity;
import com.kenny.main.GamePanel;

public class OBJ_BonzaiTree extends Entity{
	
	public OBJ_BonzaiTree(GamePanel gp) {
	    super(gp);
		
		name = "Bonzai Tree";
		scalling = 3;
		down1 = setup("/objects/trees/bonzaiTree");
	}
	

}
