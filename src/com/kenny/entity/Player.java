/*
 *  Class for Player
 */

package com.kenny.entity;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

import com.kenny.main.GamePanel;
import com.kenny.main.KeyHandler;

public class Player extends Entity {
	
	GamePanel gp;
	KeyHandler keyH;
	
	// player constructor
	public Player(GamePanel gp, KeyHandler keyH) {
		this.gp = gp;
		this.keyH = keyH;
		
		setDefaultValues();
		getPlayerImage();
	}
	
	// default values for the player
	public void setDefaultValues() {
		x = 100;
		y = 100;
		speed = 4;
		direction ="down";
	}
	
	public void getPlayerImage() {
		
		try {
			down1 = ImageIO.read(getClass().getResourceAsStream("/player/kenny_down_1.png"));
			down2 = ImageIO.read(getClass().getResourceAsStream("/player/kenny_down_2.png"));
			down3 = ImageIO.read(getClass().getResourceAsStream("/player/kenny_down_3.png"));
			down4 = ImageIO.read(getClass().getResourceAsStream("/player/kenny_down_4.png"));
			
			left1 = ImageIO.read(getClass().getResourceAsStream("/player/kenny_left_1.png"));
			left2 = ImageIO.read(getClass().getResourceAsStream("/player/kenny_left_2.png"));
			left3 = ImageIO.read(getClass().getResourceAsStream("/player/kenny_left_3.png"));
			left4 = ImageIO.read(getClass().getResourceAsStream("/player/kenny_left_4.png"));

			right1 = ImageIO.read(getClass().getResourceAsStream("/player/kenny_right_1.png"));
			right2 = ImageIO.read(getClass().getResourceAsStream("/player/kenny_right_2.png"));
			right3 = ImageIO.read(getClass().getResourceAsStream("/player/kenny_right_3.png"));
			right4 = ImageIO.read(getClass().getResourceAsStream("/player/kenny_right_4.png"));

			up1 = ImageIO.read(getClass().getResourceAsStream("/player/kenny_up_1.png"));
			up2 = ImageIO.read(getClass().getResourceAsStream("/player/kenny_up_2.png"));
			up3 = ImageIO.read(getClass().getResourceAsStream("/player/kenny_up_3.png"));
			up4 = ImageIO.read(getClass().getResourceAsStream("/player/kenny_up_4.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// key handler for the player
	public void update() {
		if(keyH.upPressed == true) {
			direction = "up";
			y -= speed;
		}
		
		else if(keyH.leftPressed == true) {
			direction = "left";
			x -= speed;
			
		}
		
		else if(keyH.downPressed == true) {
			direction = "down";
			y += speed;
			
		}
		
		else if(keyH.rightPressed == true) {
			direction = "right";
			x += speed;
			
		}
	}
	
	// player draw method
	public void draw(Graphics2D g2d) {
		 // white rectangle  player
		 // g2d.setColor(Color.white);
		 // g2d.fillRect(x, y, gp.tileSize, gp.tileSize);
		
		BufferedImage image = left1;
		
		switch(direction) {
		case "down":
			image = down1;
			break;
		case "left":
			image = left1;
			break;
		case "right":
			image = right1;
			break;
		case "up":
			image = up1;
			break;
		}
		
		g2d.drawImage(image, x, y, gp.tileSize, gp.tileSize, null);
		
	}
}
