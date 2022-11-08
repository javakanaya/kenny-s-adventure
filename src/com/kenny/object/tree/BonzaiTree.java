package com.kenny.object.tree;

import java.io.IOException;

import javax.imageio.ImageIO;

public class BonzaiTree extends Tree{
	
	public BonzaiTree() {
		
		name = "Bonzai Tree";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/trees/bonzaiTree.png"));
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	

}
