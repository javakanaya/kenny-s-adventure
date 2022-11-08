package com.kenny.object.gatekey;

import java.io.IOException;

import javax.imageio.ImageIO;

public class SummerGate extends GateKey{

	public SummerGate() {
		
		name = "Summer Gate";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/gates/summerGate.png"));
		} catch(IOException e) {
			e.printStackTrace();
		}
		collision = true;
	}
}
