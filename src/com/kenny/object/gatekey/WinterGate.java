package com.kenny.object.gatekey;

import java.io.IOException;

import javax.imageio.ImageIO;

public class WinterGate extends GateKey{
	
	public WinterGate() {
		
		name = "Winter Gate";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/gates/winterGate.png"));
		}catch(IOException e) {
			e.printStackTrace();
		}
		collision = true;
	}

}
