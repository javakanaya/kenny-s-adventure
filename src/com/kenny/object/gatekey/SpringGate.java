package com.kenny.object.gatekey;

import java.io.IOException;

import javax.imageio.ImageIO;

import com.kenny.main.GamePanel;

public class SpringGate extends GateKey {

    GamePanel gp;
    
	public SpringGate(GamePanel gp) {
		
	    this.gp = gp;
	    
		name = "Spring Gate";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/gates/springGate.png"));
			image = uTool.scaleImage(image, gp.tileSize, gp.tileSize);
		} catch(IOException e) {
			e.printStackTrace();
		}
		collision = true;
	}
}
