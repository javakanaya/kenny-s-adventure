package com.kenny.object.gatekey;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import com.kenny.main.GamePanel;
import com.kenny.main.UtilityTool;

public class SuperObject {
	
	public BufferedImage image;	
	public String name;
	public boolean collision = false;
	public int worldX, worldY;
	public Rectangle solidArea = new Rectangle(0, 0, 48, 48);
	public int solidDefaultAreaX = 0;
	public int solidDefaultAreaY = 0;
	UtilityTool uTool = new UtilityTool();
	
	//draw method
	public void draw(Graphics2D g2d, GamePanel gp) {
		
	    // object position on the screen
        int screenX = worldX - gp.player.worldX + gp.player.screenX;
        int screenY = worldY - gp.player.worldY + gp.player.screenY;
            
        // Improve render, draw only the tiles that seen on the screen
        if(worldX + 3 * gp.tileSize > gp.player.worldX - gp.player.screenX &&
                worldX - 3 * gp.tileSize < gp.player.worldX + gp.player.screenX &&
                worldY + 3 * gp.tileSize > gp.player.worldY - gp.player.screenY &&
                worldY - 3 * gp.tileSize < gp.player.worldY + gp.player.screenY) {
            
            g2d.drawImage(image, screenX, screenY, gp.tileSize, gp.tileSize, null);
            // System.out.println("sX : " + screenX + " sY :" + screenX);
        }
	}
}

