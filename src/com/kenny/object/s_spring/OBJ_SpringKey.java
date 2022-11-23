package com.kenny.object.s_spring;

import java.io.IOException;

import javax.imageio.ImageIO;

import com.kenny.entity.Entity;
import com.kenny.main.GamePanel;

public class OBJ_SpringKey extends Entity {
    
	public OBJ_SpringKey(GamePanel gp) {
		
	    super(gp);
	    
		name = "Spring Key";
		down1 = setup("/objects/keys/springKey");
	}

}
