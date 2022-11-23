package com.kenny.object.s_summer;

import java.io.IOException;

import javax.imageio.ImageIO;

import com.kenny.entity.Entity;
import com.kenny.main.GamePanel;

public class OBJ_SummerGate extends Entity {
    
	public OBJ_SummerGate(GamePanel gp) {
		
	   super(gp);
	    
		name = "Summer Gate";
		down1 = setup("/objects/gates/summerGate");
		collision = true;
	}
}
