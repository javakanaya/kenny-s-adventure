/*
 *  Class for Entities
 */

package com.kenny.entity;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public class Entity {
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
	
	public Rectangle solidArea;
	public boolean collisionOn = false;
}
