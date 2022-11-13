package com.kenny.object.gatekey;

import java.io.IOException;

import javax.imageio.ImageIO;

import com.kenny.main.GamePanel;

public class WinterGate extends GateKey{
	
    GamePanel gp;
    
	public WinterGate(GamePanel gp) {
		
	    this.gp = gp;
	    
		name = "Winter Gate";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/gates/winterGate.png"));
			image = uTool.scaleImage(image, gp.tileSize, gp.tileSize);
		} catch(IOException e) {
			e.printStackTrace();
		}
		collision = true;
	}

}
