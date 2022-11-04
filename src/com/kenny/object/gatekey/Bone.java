package com.kenny.object.gatekey;

import java.io.IOException;

import javax.imageio.ImageIO;

public class Bone extends GateKey{
	public Bone() {
		
		name = "Bone";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/others/bones.png"));
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		// if want to set specific solid area to each object
//		solidArea.x = 5;
		
	}
}
