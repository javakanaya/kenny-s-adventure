package com.kenny.object.gatekey;

import java.io.IOException;

import javax.imageio.ImageIO;

public class WinterKey extends GateKey{
	
	public WinterKey() {
		
		name = "Winter Key";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/keys/winterKey.png"));
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
