package com.kenny.entity;

import com.kenny.main.GamePanel;

public class NPC_Bulky extends Entity {
	
	public NPC_Bulky(GamePanel gp) {
        super(gp);
        
        worldX = gp.tileSize * 26;
		worldY = gp.tileSize * 21;
		
        scalling = 2;
        direction = "left";
        spriteNum = 5;
        speed = 0;
        
        getImage();
    }
    
    public void getImage() {
        
        idleLeft1 = setup("/npc/bulky/bulky_0");
        idleLeft2 = setup("/npc/bulky/bulky_1");
   
    }
    
    public void setAction() {
        
		actionLockCounter++;
    	
		if(actionLockCounter%50 == 0) {
			
			if(spriteNum == 6)
				spriteNum = 5;
			else spriteNum = 6;
			
			actionLockCounter = 0;
		}
    }

}
