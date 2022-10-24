package com.kenny.object.tree;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import com.kenny.main.GamePanel;

public class Tree {
	
	public BufferedImage image;	
	public String name;
	public boolean collision = false;
	public int worldX, worldY;
	
	//draw method
	public void draw(Graphics2D g2d, GamePanel gp) {
		
		 //
        int screenX = worldX - gp.player.worldX + gp.player.screenX;
        int screenY = worldY - gp.player.worldY + gp.player.screenY;
            
        // Improve render, draw only the tiles that seen on the screen
        if(worldX + 3 * gp.tileSize > gp.player.worldX - gp.player.screenX &&
                worldX - 3 * gp.tileSize < gp.player.worldX + gp.player.screenX &&
                worldY + 3 * gp.tileSize > gp.player.worldY - gp.player.screenY &&
                worldY - 3 * gp.tileSize < gp.player.worldY + gp.player.screenY) {
            
            g2d.drawImage(image, screenX, screenY, gp.tileSize*3, gp.tileSize*3, null);
            // System.out.println("sX : " + screenX + " sY :" + screenX);
        }
	}
}
