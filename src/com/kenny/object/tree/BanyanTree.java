package com.kenny.object.tree;

import java.io.IOException;

import javax.imageio.ImageIO;

public class BanyanTree extends Tree {
	
	public BanyanTree() {
		
		name = "Banyan Tree";
		try {
			
			image = ImageIO.read(getClass().getResourceAsStream("/objects/trees/banyanTree.png"));
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
