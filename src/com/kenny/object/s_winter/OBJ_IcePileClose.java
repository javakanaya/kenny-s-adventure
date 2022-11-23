package com.kenny.object.s_winter;

import java.io.IOException;

import javax.imageio.ImageIO;

import com.kenny.entity.Entity;
import com.kenny.main.GamePanel;

public class OBJ_IcePileClose extends Entity{
    
	public OBJ_IcePileClose(GamePanel gp) {
	    
	    super(gp);
	   
		name = "Ice Pile Close";
		down1 = setup("/objects/others/icePileClose");
		collision = true;
	}
}
