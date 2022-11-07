package com.kenny.object.gatekey;

import java.io.IOException;

import javax.imageio.ImageIO;

public class AutumnKey extends GateKey{

	public AutumnKey() {
		
		name = "Autumn Key";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/keys/autumnKey.png"));
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		// if want to set specific solid area to each object
//		solidArea.x = 5;
		
	}
}