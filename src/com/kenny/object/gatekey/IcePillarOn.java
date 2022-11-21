package com.kenny.object.gatekey;

import java.io.IOException;

import javax.imageio.ImageIO;

import com.kenny.main.GamePanel;

public class IcePillarOn extends SuperObject{
	
    GamePanel gp;
    
	public IcePillarOn(GamePanel gp) {
	    
	    this.gp = gp;
        
		name = "Ice Pillar On";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/others/icePillar_1.png"));
			image = uTool.scaleImage(image, gp.tileSize*2, gp.tileSize*4);
		} catch(IOException e) {
			e.printStackTrace();
		}
		collision = true;
		
        // if want to set specific solid area to each object
        // solidArea.x = 5;
		
	}
}
