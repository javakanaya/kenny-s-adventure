package com.kenny.object.s_winter;

import java.io.IOException;

import javax.imageio.ImageIO;

import com.kenny.entity.Entity;
import com.kenny.main.GamePanel;

public class OBJ_IcePillarOff extends Entity{
    
	public OBJ_IcePillarOff(GamePanel gp) {
	    
	    super(gp);
        
		name = "Ice Pillar Off";
		scalling = 2;
		down1 = setup("/objects/others/icePillar_2");		
		collision = true;
	}
}
