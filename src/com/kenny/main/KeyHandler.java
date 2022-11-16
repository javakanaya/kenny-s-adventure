/*
 *  Keyboard input
 */

package com.kenny.main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {
    
    // declare attributes
	public boolean upPressed, downPressed, leftPressed, rightPressed, enterPressed;
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
		
		// PLAY STATE
		if(gp.gameState == gp.playState) {
		    
		    if(code == KeyEvent.VK_W || code == KeyEvent.VK_UP) {
	            upPressed = true;
	        }

	        if(code == KeyEvent.VK_A || code == KeyEvent.VK_LEFT) {
	            leftPressed = true; 
	        }

	        if(code == KeyEvent.VK_S || code == KeyEvent.VK_DOWN) {
	            downPressed = true;
	        }

	        if(code == KeyEvent.VK_D || code == KeyEvent.VK_RIGHT) {
	            rightPressed = true;
	        }
	        
	        if(code == KeyEvent.VK_P) {
	            gp.gameState = gp.pauseState;              
	        }
	        
           if(code == KeyEvent.VK_ENTER) {
                enterPressed = true;
            }
		}
		
		// PAUSE STATE
		else if(gp.gameState == gp.pauseState) {
	          if(code == KeyEvent.VK_P) {
	                gp.gameState = gp.playState;  
	          }
		}
		
		// DIALOGUE STATE
		else if(gp.gameState == gp.dialogueState) {
		    if(code == KeyEvent.VK_ENTER)
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
