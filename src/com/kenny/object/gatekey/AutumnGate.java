package com.kenny.object.gatekey;

import java.io.IOException;

import javax.imageio.ImageIO;

public class AutumnGate extends GateKey{
	
	public AutumnGate() {
		
		name = "Autumn Gate";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/gates/autumnGate.png"));
		}catch(IOException e) {
			e.printStackTrace();
		}
		collision = true;
	}

}
