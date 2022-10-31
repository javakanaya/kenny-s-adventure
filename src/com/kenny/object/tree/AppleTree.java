package com.kenny.object.tree;

import java.io.IOException;

import javax.imageio.ImageIO;

public class AppleTree extends Tree {
	
	public AppleTree() {
		
		name = "Apple Tree";
		try {
			
			image = ImageIO.read(getClass().getResourceAsStream("/objects/trees/appleTree.png"));
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
