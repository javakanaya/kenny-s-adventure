package com.kenny.object.tree;

import java.io.IOException;

import javax.imageio.ImageIO;

public class PineTree extends Tree {
	
	public PineTree() {
		
		name = "Pine Tree";
		try {
			
			image = ImageIO.read(getClass().getResourceAsStream("/objects/trees/pineTree.png"));
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
