package com.kenny.entity;

import java.awt.Rectangle;

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
        setSolidArea(24, 24, 96, 96);
        
        getImage();
        setDialogue();
    }
    
    public void getImage() {
        
        idleLeft1 = setup("/npc/bulky/bulky_0");
        idleLeft2 = setup("/npc/bulky/bulky_1");
   
    }
    
    public void setDialogue() {
        
        dialogues[0] = "helo, njing!";
        dialogues[1] = "kamu ngapain disini njingg?";
        dialogues[2] = "wah wih wuh weh\na..a.anjing bisa ngomong";
        dialogues[3] = "sana njingg cari kuncinya";
    }
    
    public void setAction() {
        // animate sprite 
		actionLockCounter++;
    	
		if(actionLockCounter % 50 == 0) {
			
			if(spriteNum == 6)
				spriteNum = 5;
			else spriteNum = 6;
			
			actionLockCounter = 0;
		}
    }
    
 
}
