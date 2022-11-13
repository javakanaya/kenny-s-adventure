package com.kenny.object.gatekey;

import java.io.IOException;

import javax.imageio.ImageIO;

import com.kenny.main.GamePanel;

public class SummerGate extends GateKey {
    
    GamePanel gp;
    
	public SummerGate(GamePanel gp) {
		
	    this.gp = gp;
	    
		name = "Summer Gate";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/gates/summerGate.png"));
			image = uTool.scaleImage(image, gp.tileSize, gp.tileSize);
		} catch(IOException e) {
			e.printStackTrace();
		}
		collision = true;
	}
}
