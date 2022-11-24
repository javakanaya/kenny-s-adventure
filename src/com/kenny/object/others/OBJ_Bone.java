package com.kenny.object.others;

import com.kenny.entity.Entity;
import com.kenny.main.GamePanel;

public class OBJ_Bone extends Entity{
    
    GamePanel gp;
    
	public OBJ_Bone(GamePanel gp) {
	    
	    super(gp);
	    
	    this.gp = gp;
        
	    type = type_consumable;
		name = "Bone";
		down1 = setup("/objects/others/bones"); 
		description = "[" + name + "]\nIncrease speed!";
		
	}
	
	@Override
	public boolean use(Entity entity) {
	    gp.gameState = gp.dialogueState;
	    gp.ui.currentDialogue = "You eat the " + name + "!\nYou now move faster.";
	    entity.speed += 2;
	    return true;
	}
}
