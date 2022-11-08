package com.kenny.object.tree;

import java.io.IOException;

import javax.imageio.ImageIO;

public class SpruceTree extends Tree {
	
	public SpruceTree() {
		
		name = "Spruce Tree";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/trees/spruceTree.png"));
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
