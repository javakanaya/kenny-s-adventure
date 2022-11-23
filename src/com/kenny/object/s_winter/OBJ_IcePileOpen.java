package com.kenny.object.s_winter;

import com.kenny.entity.Entity;
import com.kenny.main.GamePanel;

public class OBJ_IcePileOpen extends Entity{
    
	public OBJ_IcePileOpen(GamePanel gp) {
	    super(gp);
        
		name = "Ice Pile Open";
		down1 = setup("/objects/others/icePileOpen");
		collision = true;
	}
}
