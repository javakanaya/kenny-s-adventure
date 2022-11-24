package com.kenny.object.s_winter;

import com.kenny.entity.Entity;
import com.kenny.main.GamePanel;

public class OBJ_IcePileOpen extends Entity{
	
	GamePanel gp;
    
	public OBJ_IcePileOpen(GamePanel gp) {
	    super(gp);
	    
	    this.gp = gp;
        
		name = "Ice Pile Open";
		type = type_pile;
		down1 = setup("/objects/others/icePileOpen");
		collision = true;
	}
	
public void interact(int i) {
		
		gp.obj[i] = null;
		gp.ui.showMessage("Ice Pile Destroyed!");
	}
}
