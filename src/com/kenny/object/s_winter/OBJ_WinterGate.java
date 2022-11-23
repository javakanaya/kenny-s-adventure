package com.kenny.object.s_winter;

import java.io.IOException;

import javax.imageio.ImageIO;

import com.kenny.entity.Entity;
import com.kenny.main.GamePanel;

public class OBJ_WinterGate extends Entity{
    
	public OBJ_WinterGate(GamePanel gp) {
		
	    super(gp);
	    
		name = "Winter Gate";
		down1 = setup("/objects/gates/winterGate");
		collision = true;
	}

}
