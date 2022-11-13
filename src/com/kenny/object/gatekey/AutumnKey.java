package com.kenny.object.gatekey;

import java.io.IOException;

import javax.imageio.ImageIO;

import com.kenny.main.GamePanel;

public class AutumnKey extends GateKey{

    GamePanel gp;
    
	public AutumnKey(GamePanel gp) {
		
	    this.gp = gp;
	    
		name = "Autumn Key";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/keys/autumnKey.png"));
			image = uTool.scaleImage(image, gp.tileSize, gp.tileSize);
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		// if want to set specific solid area to each object
		// solidArea.x = 5;
		
	}
}
