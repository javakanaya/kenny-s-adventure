/*
 *  Class for Entities
 */

package com.kenny.entity;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.kenny.main.GamePanel;
import com.kenny.main.UtilityTool;

public class Entity {
    
    GamePanel gp;
    
    // entity location on world
	public int  worldX, 
				worldY;
	public int speed;
	
	// image for entity movement
	BufferedImage right1, 
 				  right2, 
 				  right3, 
 				  right4, 
 				  up1, 
 				  up2, 
 				  up3, 
 				  up4, 
 				  left1, 
 				  left2, 
 				  left3, 
 				  left4, 
 				  down1, 
 				  down2, 
 				  down3, 
 				  down4;
 				  
	// image for entity idle
 	BufferedImage idleFront1,
 				  idleFront2,
 				  idleFront3,
 				  idleFront4,
 				  idleLeft1,
				  idleLeft2,
				  idleLeft3,
				  idleLeft4,
				  idleRight1,
 				  idleRight2,
 				  idleRight3,
 				  idleRight4;
	
	public String direction;
	
	int spriteCounter = 0;
	int spriteNum = 1;
	
	// entity collision setting
	public Rectangle solidArea = new Rectangle(0, 0, 48, 48);
	public int 	solidAreaDefaultX, solidAreaDefaultY;
	public boolean collisionOn = false;
	
	public Entity(GamePanel gp) {
	    this.gp = gp;
	}
	
    public BufferedImage setup(String imageName) {
        
        UtilityTool uTool = new UtilityTool();
        BufferedImage image = null;
        
        try {
            image = ImageIO.read(getClass().getResourceAsStream(imageName + ".png"));
            image = uTool.scaleImage(image, gp.tileSize, gp.tileSize);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return image;
    }
}
