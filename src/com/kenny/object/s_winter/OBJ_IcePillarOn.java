package com.kenny.object.s_winter;

import java.io.IOException;

import javax.imageio.ImageIO;

import com.kenny.entity.Entity;
import com.kenny.main.GamePanel;

public class OBJ_IcePillarOn extends Entity{
    
	public OBJ_IcePillarOn(GamePanel gp) {
	    super(gp);
        
		name = "Ice Pillar On";
        scallingX = 2;
        scallingY = 4;
		setup("/objects/others/icePillar_1");
		collision = true;
	}
}
