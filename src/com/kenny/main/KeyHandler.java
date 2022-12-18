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
        if (gp.gameState == gp.titleState) {
            if (gp.ui.titleScreenState == 0) {
                if (code == KeyEvent.VK_W || code == KeyEvent.VK_UP) {
                    gp.playSfx(1);
                    gp.ui.commandNum--;
                    if (gp.ui.commandNum < 0)
                        gp.ui.commandNum = 2;
                }
                if (code == KeyEvent.VK_S || code == KeyEvent.VK_DOWN) {
                    gp.ui.commandNum++;
                    gp.playSfx(1);
                    if (gp.ui.commandNum > 2)
                        gp.ui.commandNum = 0;
                }
                if (code == KeyEvent.VK_ENTER) {
                    gp.playSfx(2);
                    if (gp.ui.commandNum == 0) {
                        gp.ui.titleScreenState = 1;
                    }
                    if (gp.ui.commandNum == 1) {
                        // add later
                    }
                    if (gp.ui.commandNum == 2) {
                        System.exit(0);
                    }
                }
            }

            else if (gp.ui.titleScreenState == 1) {
                
                if (code == KeyEvent.VK_ENTER) {
                    gp.playSfx(2);
                    gp.gameState = gp.playState;
                    gp.ui.titleScreenState = 0;
                    gp.stopMusic();
                    gp.playMusic(12);
                    
                    // set object for new game
                    gp.aSetter.setObject();
                    gp.aSetter.setNPC();
                    gp.player.pillar = new int[] {1, 1, 1, 1};
                    gp.player.gate = new int[] {1, 1, 1, 1};
                    gp.obj[9] = null;
                }
                if (code == KeyEvent.VK_ESCAPE) {
                    gp.playSfx(2);
                    gp.ui.titleScreenState = 0;
                }
            }

        }

        // PLAY STATE
        else if (gp.gameState == gp.playState) {

            if (code == KeyEvent.VK_W || code == KeyEvent.VK_UP) {
                upPressed = true;
            }

            if (code == KeyEvent.VK_A || code == KeyEvent.VK_LEFT) {
                leftPressed = true;
            }

            if (code == KeyEvent.VK_S || code == KeyEvent.VK_DOWN) {
                downPressed = true;
            }

            if (code == KeyEvent.VK_D || code == KeyEvent.VK_RIGHT) {
                rightPressed = true;
            }

            if (code == KeyEvent.VK_ESCAPE) {
                gp.gameState = gp.pauseState;
            }

            if (code == KeyEvent.VK_I) {
                gp.playSfx(3);
                gp.gameState = gp.inventoryState;
            }

            if (code == KeyEvent.VK_ENTER) {
                enterPressed = true;
            }

        }

        // PAUSE STATE
        else if (gp.gameState == gp.pauseState) {
            if (code == KeyEvent.VK_ESCAPE) {
                gp.gameState = gp.playState;
            }
            if (code == KeyEvent.VK_W || code == KeyEvent.VK_UP) {
                gp.playSfx(1);
                gp.ui.commandNum--;
                if (gp.ui.commandNum < 0)
                    gp.ui.commandNum = 1;
            }
            if (code == KeyEvent.VK_S || code == KeyEvent.VK_DOWN) {
                gp.ui.commandNum++;
                gp.playSfx(1);
                if (gp.ui.commandNum > 1)
                    gp.ui.commandNum = 0;
            }
            if (code == KeyEvent.VK_ENTER) {
                gp.playSfx(2);
                if (gp.ui.commandNum == 0) {
                    gp.gameState = gp.playState;
                }
                if (gp.ui.commandNum == 1) {
                    gp.gameState = gp.titleState;
                    gp.stopMusic();
                    gp.playMusic(0);
                }
            }
        }

        // DIALOGUE STATE
        else if (gp.gameState == gp.dialogueState) {
            if (code == KeyEvent.VK_ENTER)
                gp.gameState = gp.playState;
        }

        // INVENTORY STATE
        else if (gp.gameState == gp.inventoryState) {
            if (code == KeyEvent.VK_I) {
                gp.playSfx(4);
                gp.gameState = gp.playState;
            }

            if (code == KeyEvent.VK_W || code == KeyEvent.VK_UP) {
                gp.playSfx(5);
                if (gp.ui.slotRow > 0) {
                    gp.ui.slotRow--;
                }
            }

            if (code == KeyEvent.VK_A || code == KeyEvent.VK_LEFT) {
                gp.playSfx(5);
                if (gp.ui.slotCol > 0) {
                    gp.ui.slotCol--;
                }
            }

            if (code == KeyEvent.VK_S || code == KeyEvent.VK_DOWN) {
                gp.playSfx(5);
                if (gp.ui.slotRow < 3) {
                    gp.ui.slotRow++;
                }
            }

            if (code == KeyEvent.VK_D || code == KeyEvent.VK_RIGHT) {
                gp.playSfx(5);
                if (gp.ui.slotCol < 4) {
                    gp.ui.slotCol++;
                }
            }

            if (code == KeyEvent.VK_ENTER) {
                gp.player.selectItem();
            }
        }
        
        // FINISH STATE
        else if (gp.gameState == gp.finishState) {
        
            if(code == KeyEvent.VK_ENTER) {
                gp.gameState = gp.titleState;
                gp.stopMusic();
                gp.playMusic(0);
            }
                
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();

        if (code == KeyEvent.VK_W || code == KeyEvent.VK_UP)
            upPressed = false;

        if (code == KeyEvent.VK_A || code == KeyEvent.VK_LEFT)
            leftPressed = false;

        if (code == KeyEvent.VK_S || code == KeyEvent.VK_DOWN)
            downPressed = false;

        if (code == KeyEvent.VK_D || code == KeyEvent.VK_RIGHT)
            rightPressed = false;

    }

}
