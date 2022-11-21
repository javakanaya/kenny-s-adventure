package com.kenny.object.gatekey;

import java.io.IOException;

import javax.imageio.ImageIO;

import com.kenny.main.GamePanel;

public class IcePileOpen extends SuperObject{
	
    GamePanel gp;
    
	public IcePileOpen(GamePanel gp) {
	    
	    this.gp = gp;
        
		name = "Ice Pile Open";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/others/icePileOpen.png"));
			image = uTool.scaleImage(image, gp.tileSize, gp.tileSize);
		} catch(IOException e) {
			e.printStackTrace();
		}
		collision = true;
		
        // if want to set specific solid area to each object
        // solidArea.x = 5;
		
	}
}
