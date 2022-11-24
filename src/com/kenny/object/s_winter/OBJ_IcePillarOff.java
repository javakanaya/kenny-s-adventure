package com.kenny.object.s_winter;

import java.io.IOException;

import javax.imageio.ImageIO;

import com.kenny.entity.Entity;
import com.kenny.entity.NPC_MrSnow;
import com.kenny.main.GamePanel;

public class OBJ_IcePillarOff extends Entity{
    
	 GamePanel gp;
	
	public OBJ_IcePillarOff(GamePanel gp) {
	    
	    super(gp);
	    
	    this.gp = gp;
        
	    
		name = "Ice Pillar Off";
		type = type_pillarOff;
        scallingX = 2;
        scallingY = 4;
		down1 = setup("/objects/others/icePillar_2");		
		collision = true;
	}
	
	public void interact(int i) {
		
		gp.obj[i] = null;
		gp.ui.showMessage("Pillar On!");
		
	    gp.npc[0] = new NPC_MrSnow(gp);
	    gp.npc[0].worldX = 69 *gp.tileSize;
	    gp.npc[0].worldY = 48 *gp.tileSize;
	}
}
