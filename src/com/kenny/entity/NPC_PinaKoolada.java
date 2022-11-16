package com.kenny.entity;

import com.kenny.main.GamePanel;

public class NPC_PinaKoolada extends Entity {

	
	public NPC_PinaKoolada(GamePanel gp) {
        super(gp);
        
        worldX = gp.tileSize * 26;
		worldY = gp.tileSize * 21;
		
        scalling = 2;
        direction = "left";
        spriteNum = 5;
        speed = 0;
        solidArea.width *= scalling;
        solidArea.height *= scalling;
        
        getImage();
        setDialogue();
    }
    
    public void getImage() {
        
        idleLeft1 = setup("/npc/pinaKoolada/pinaKoolada_0");
        idleLeft2 = setup("/npc/pinaKoolada/pinaKoolada_1");
   
    }
    
    public void setDialogue() {
        
        dialogues[0] = "yo wasapp njing!";
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
