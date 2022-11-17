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
		
		// TITLE STATE
		if(gp.gameState == gp.titleState) {
		    if(gp.ui.titleScreenState == 0) {
	            if(code == KeyEvent.VK_W || code == KeyEvent.VK_UP) {
	                gp.ui.commandNum--;
	                if(gp.ui.commandNum < 0)
	                    gp.ui.commandNum = 2;
	            }
	            if(code == KeyEvent.VK_S || code == KeyEvent.VK_DOWN) {
	                gp.ui.commandNum++;
	                if(gp.ui.commandNum > 2)
	                    gp.ui.commandNum = 0;
	            }
	           if(code == KeyEvent.VK_ENTER) {
	                if(gp.ui.commandNum == 0) {
	                    gp.ui.titleScreenState = 1;
	                    gp.playMusic(0);
	                }
	                if(gp.ui.commandNum == 1) {
	                    // add later
	                }
	                if(gp.ui.commandNum == 2) {
	                    System.exit(0);
	                } 
	            }		        
		    }
		    
		    else if (gp.ui.titleScreenState == 1) {
		        if(code == KeyEvent.VK_W || code == KeyEvent.VK_UP) {    
                    gp.ui.commandNum--;
                    if(gp.ui.commandNum < 0)
                        gp.ui.commandNum = 3;
                }
                if(code == KeyEvent.VK_S || code == KeyEvent.VK_DOWN) {
                    gp.ui.commandNum++;
                    if(gp.ui.commandNum > 3)
                        gp.ui.commandNum = 0;
                }
               if(code == KeyEvent.VK_ENTER) {
                    if(gp.ui.commandNum == 0) {
                        System.out.println("Do fighter stuff");
                        gp.gameState = gp.playState;
                    }
                    if(gp.ui.commandNum == 1) {
                        System.out.println("Do thieft stuff");
                        gp.gameState = gp.playState;
                    }
                    if(gp.ui.commandNum == 2) {
                        System.out.println("Do sorcerer stuff");
                        gp.gameState = gp.playState;
                    }
                    if(gp.ui.commandNum == 3) {
                        gp.ui.titleScreenState = 0;
                        gp.stopMusic();
                    } 
                }               		        
		    }

		    
		}
		
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
