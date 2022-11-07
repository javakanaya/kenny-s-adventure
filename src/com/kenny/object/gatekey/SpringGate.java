package com.kenny.object.gatekey;

import java.io.IOException;

import javax.imageio.ImageIO;

public class SpringGate extends GateKey {

	
	public SpringGate() {
		
		name = "Spring Gate";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/gates/springGate.png"));
		}catch(IOException e) {
			e.printStackTrace();
		}
		collision = true;
	}
}
