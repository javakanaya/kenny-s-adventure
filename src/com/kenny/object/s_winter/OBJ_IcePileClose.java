package com.kenny.object.s_winter;

import java.io.IOException;

import javax.imageio.ImageIO;

import com.kenny.entity.Entity;
import com.kenny.main.GamePanel;

public class OBJ_IcePileClose extends Entity{
    
	GamePanel gp;
	
	public OBJ_IcePileClose(GamePanel gp) {
	    
	    super(gp);
	    
	    this.gp = gp;
	   
		name = "Ice Pile Close";
		type = type_pile;
		down1 = setup("/objects/others/icePileClose");
		collision = true;
	}
	
public void interact(int i) {
		
		gp.obj[i] = null;
		gp.ui.showMessage("Ice Pile Destroyed!");
	}
}
