package com.kenny.object.gatekey;

import java.io.IOException;

import javax.imageio.ImageIO;

import com.kenny.main.GamePanel;

public class WinterKey extends SuperObject{
	
    GamePanel gp;
    
	public WinterKey(GamePanel gp) {
		
	    this.gp = gp;
	    
		name = "Winter Key";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/keys/winterKey.png"));
			image = uTool.scaleImage(image, gp.tileSize, gp.tileSize);
		} catch(IOException e) {
			e.printStackTrace();
		}
		
        // if want to set specific solid area to each object
        // solidArea.x = 5;
	}

}
