package com.kenny.object.s_spring;

import java.io.IOException;

import javax.imageio.ImageIO;

import com.kenny.entity.Entity;
import com.kenny.main.GamePanel;

public class OBJ_SpringGate extends Entity {
    
	public OBJ_SpringGate(GamePanel gp) {
	    
	    super(gp);
	    
		name = "Spring Gate";
		setup("/objects/gates/springGate");
		collision = true;
	}
}
