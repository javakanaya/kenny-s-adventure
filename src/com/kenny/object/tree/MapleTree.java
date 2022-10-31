package com.kenny.object.tree;

import java.io.IOException;

import javax.imageio.ImageIO;

public class MapleTree extends Tree {
	
	public MapleTree() {
		
		name = "Maple Tree";
		try {
			
			image = ImageIO.read(getClass().getResourceAsStream("/objects/trees/mapleTree.png"));
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
