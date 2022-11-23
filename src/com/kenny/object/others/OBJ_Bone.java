package com.kenny.object.others;

import com.kenny.entity.Entity;
import com.kenny.main.GamePanel;

public class OBJ_Bone extends Entity{
    
	public OBJ_Bone(GamePanel gp) {
	    
	    super(gp);
        
		name = "Bone";
		down1 = setup("/objects/others/bones"); 
	}
}
