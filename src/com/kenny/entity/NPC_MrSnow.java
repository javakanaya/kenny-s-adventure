package com.kenny.entity;

import java.awt.image.BufferedImage;
import java.util.Random;

import com.kenny.main.GamePanel;
import com.kenny.main.UtilityTool;

public class NPC_MrSnow extends Entity{

    public NPC_MrSnow(GamePanel gp) {
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
        
        idleLeft1 = setup("/npc/mrSnow/mrSnow_0");
        idleLeft2 = setup("/npc/mrSnow/mrSnow_1");
   
    }
    
    public void setAction() {
        
		actionLockCounter++;
    	
		if(actionLockCounter%50 == 0) {
			
			if(spriteNum == 6)
				spriteNum = 5;
			else spriteNum = 6;
			
			actionLockCounter = 0;
		}
        
//        if(actionLockCounter == 120) {
//            Random random = new Random();
//            int i = random.nextInt(100) + 1; // pick up a number from 1 to 100;
//            
//            if(i <= 25) {
//                direction = "left";
//            }
//            if(i > 25 && i <= 50) {
//                direction = "down";
//            }
//            if(i > 55 && i <= 75) {
//                direction = "up";
//            }
//            if(i > 75 && i <= 100) {
//                direction = "right";
//            } 
//            
//            actionLockCounter = 0;
//        }
    }
}
