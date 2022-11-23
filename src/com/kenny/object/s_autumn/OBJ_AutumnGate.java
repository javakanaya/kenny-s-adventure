package com.kenny.object.s_autumn;

import com.kenny.entity.Entity;
import com.kenny.main.GamePanel;

public class OBJ_AutumnGate extends Entity{
    
	public OBJ_AutumnGate(GamePanel gp) {

	    super(gp);
	    
		name = "Autumn Gate";
		down1 = setup("/objects/gates/autumnGate");
		collision = true;
	}

}
