package com.kenny.object.gatekey;

import java.io.IOException;

import javax.imageio.ImageIO;

public class SpringKey extends GateKey {
	
	public SpringKey() {
		
		name = "Spring Key";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/keys/springKey.png"));
		}catch(IOException e) {
			e.printStackTrace();
		}
		
        // if want to set specific solid area to each object
        // solidArea.x = 5;
	}

}
