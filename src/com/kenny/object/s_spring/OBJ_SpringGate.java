package com.kenny.object.s_spring;

import com.kenny.entity.Entity;
import com.kenny.main.GamePanel;

public class OBJ_SpringGate extends Entity {

    GamePanel gp;
    
    public OBJ_SpringGate(GamePanel gp) {

        super(gp);
        
        this.gp = gp;

        name = "Spring Gate";
        type = type_gate;
        scallingY = 4;
        down1 = setup("/objects/gates/springGateOff");
        collision = true;
    }
    
    public void interact(int i) {
        
        gp.gameState = gp.dialogueState;
        gp.ui.currentDialogue = "You need a key to open this";
    }
}
