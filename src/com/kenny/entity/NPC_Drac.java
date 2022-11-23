package com.kenny.entity;

import com.kenny.main.GamePanel;

public class NPC_Drac extends Entity{

	public NPC_Drac(GamePanel gp) {
        super(gp);
        
        worldX = gp.tileSize * 26;
		worldY = gp.tileSize * 21;
		
        scalling = 1;
        direction = "left";
        spriteNum = 5;
        speed = 0;
        
        solidArea.x = 96;
        solidArea.y = 0;
        solidArea.width = 96;
        solidArea.height = 96;
        
        getImage();
        setDialogue();
    }
    
    public void getImage() {
        
        idleLeft1 = setup("/npc/drac/drac_0");
        idleLeft2 = setup("/npc/drac/drac_1");
   
    }
    
    public void setDialogue() {
        
        dialogues[0] = "Ho Ho Helo, njing";
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
