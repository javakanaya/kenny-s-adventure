package com.kenny.object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_Testing extends SuperObject{
	
	
	public OBJ_Testing() {
		
		name = "heart";
		try {
			
			image = ImageIO.read(getClass().getResourceAsStream("/objects/Testing.png"));
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	

}
