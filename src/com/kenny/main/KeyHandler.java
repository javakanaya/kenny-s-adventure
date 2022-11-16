/*
 *  Keyboard input
 */

package com.kenny.main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {
    
    // declare attributes
	public boolean upPressed, downPressed, leftPressed, rightPressed;
	GamePanel gp;
		
	public KeyHandler(GamePanel gp) {
	    this.gp = gp;
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		int code = e.getKeyCode();
		
		if(code == KeyEvent.VK_W || code == KeyEvent.VK_UP) {
            upPressed = true;
            leftPressed = false;
            downPressed = false;
            rightPressed = false;		}

		if(code == KeyEvent.VK_A || code == KeyEvent.VK_LEFT) {
            upPressed = false;
            leftPressed = true;
            downPressed = false;
            rightPressed = false;   
		}

		if(code == KeyEvent.VK_S || code == KeyEvent.VK_DOWN) {
            upPressed = false;
            leftPressed = false;
            downPressed = true;
            rightPressed = false; 
		}

		if(code == KeyEvent.VK_D || code == KeyEvent.VK_RIGHT) {
            upPressed = false;
            leftPressed = false;
            downPressed = false;
		    rightPressed = true;
		}
		
		if(code == KeyEvent.VK_P) {
		    if (gp.gameState == gp.playState)
		        gp.gameState = gp.pauseState;
		    else if (gp.gameState == gp.pauseState)
		        gp.gameState = gp.playState;
		}

		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		int code = e.getKeyCode();
		
		if(code == KeyEvent.VK_W || code == KeyEvent.VK_UP)
			upPressed = false;

		if(code == KeyEvent.VK_A || code == KeyEvent.VK_LEFT)
		    leftPressed = false;

		if(code == KeyEvent.VK_S || code == KeyEvent.VK_DOWN)
		    downPressed = false;

		if(code == KeyEvent.VK_D || code == KeyEvent.VK_RIGHT)
			rightPressed = false;


	}

}
