package com.kenny.object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_Tree extends SuperObject{
	
	
	public OBJ_Tree() {
		
		name = "tree";
		try {
			
			image = ImageIO.read(getClass().getResourceAsStream("/objects/tree_1.png"));
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	

}
