package com.kenny.object.s_summer;

import java.io.IOException;

import javax.imageio.ImageIO;

import com.kenny.entity.Entity;
import com.kenny.main.GamePanel;

public class OBJ_SummerGate extends Entity {

    GamePanel gp;
        
    public OBJ_SummerGate(GamePanel gp) {

        super(gp);

        this.gp = gp;
        
        name = "Summer Gate";
        type = type_gate;
        down1 = setup("/objects/gates/summerGate");
        collision = true;
    }
    
    public void interact() {
        
        gp.gameState = gp.dialogueState;
        gp.ui.currentDialogue = "You need a key to open this";
    }
}
