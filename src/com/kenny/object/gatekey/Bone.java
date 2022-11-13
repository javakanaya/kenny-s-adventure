package com.kenny.object.gatekey;

import java.io.IOException;

import javax.imageio.ImageIO;

import com.kenny.main.GamePanel;

public class Bone extends GateKey{
	
    GamePanel gp;
    
	public Bone(GamePanel gp) {
	    
	    this.gp = gp;
        
		name = "Bone";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/others/bones.png"));
			image = uTool.scaleImage(image, gp.tileSize, gp.tileSize);
		} catch(IOException e) {
			e.printStackTrace();
		}
		
        // if want to set specific solid area to each object
        // solidArea.x = 5;
		
	}
}
