package com.kenny.entity;

import java.util.Random;

import com.kenny.main.GamePanel;

public class NPC_SnowMan extends Entity{

    public NPC_SnowMan(GamePanel gp) {
        super(gp);
        
        direction = "down";
        speed = 1;
        
        getImage();
    }
    
    public void getImage() {
        
        down1 = setup("/npc/Kerbau");
        up1 = down1;
        left1 = down1;
        right1 = down1;
    }
    
    public void setAction() {
        
        actionLockCounter++;
        
        if(actionLockCounter == 120) {
            Random random = new Random();
            int i = random.nextInt(100) + 1; // pick up a number from 1 to 100;
            
            if(i <= 25) {
                direction = "left";
            }
            if(i > 25 && i <= 50) {
                direction = "down";
            }
            if(i > 55 && i <= 75) {
                direction = "up";
            }
            if(i > 75 && i <= 100) {
                direction = "right";
            } 
            
            actionLockCounter = 0;
        }
    }
}
