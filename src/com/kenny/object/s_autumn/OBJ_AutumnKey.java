package com.kenny.object.s_autumn;

import com.kenny.entity.Entity;
import com.kenny.main.GamePanel;

public class OBJ_AutumnKey extends Entity{
    
	public OBJ_AutumnKey(GamePanel gp) {
		
	    super(gp);
	    
		name = "Autumn Key";
		down1 = setup("/objects/keys/autumnKey");
        description = "[" + name + "]\nUnlock associated gate";
	}
}
