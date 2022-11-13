package com.kenny.object.gatekey;

import java.io.IOException;

import javax.imageio.ImageIO;

import com.kenny.main.GamePanel;

public class AutumnGate extends GateKey{
	
    GamePanel gp;
    
	public AutumnGate(GamePanel gp) {
		
	    this.gp = gp;
	    
		name = "Autumn Gate";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/gates/autumnGate.png"));
			image = uTool.scaleImage(image, gp.tileSize, gp.tileSize);
		} catch(IOException e) {
			e.printStackTrace();
		}
		collision = true;
	}

}
