package com.kenny.main;

import java.awt.Rectangle;

public class EventHandler {

    GamePanel gp;
    Rectangle eventRect;
    int eventRectDefaultX, eventRectDefaultY;

    public EventHandler(GamePanel gp) {
        this.gp = gp;

        eventRect = new Rectangle();
        eventRect.x = 20;
        eventRect.y = 20;
        eventRect.width = 8;
        eventRect.height = 8;
        eventRectDefaultX = eventRect.x;
        eventRectDefaultY = eventRect.y;
    }

    public void checkEvent() {

//        if(hit(51, 51, "any") == true) {
//            damagePit(gp.dialogueState);
//        }
//        if(hit(51, 60, "any") == true) {
//            healingPool(gp.dialogueState);
//        }
    	
    	// pillar1
        if (hit(90, 53, "left") == true) {
            teleport(gp.dialogueState, 78, 48);
        }
        if (hit(78, 48, "right") == true) {
        	teleport(gp.dialogueState, 90, 53);
        }
        
     // pillar2
        if (hit(80, 56, "left") == true) {
            teleport(gp.dialogueState, 86, 43);
        }
        if (hit(86, 43, "right") == true) {
        	teleport(gp.dialogueState, 80, 56);
        }
        
     // pillar3
        if (hit(79, 40, "left") == true) {
            teleport(gp.dialogueState, 88, 49);
        }
        if (hit(88, 49, "right") == true) {
        	teleport(gp.dialogueState, 79, 40);
        }
        
     // pillar4
        if (hit(93, 45, "left") == true) {
            teleport(gp.dialogueState, 82, 51);
        }
        if (hit(82, 51, "right") == true) {
        	teleport(gp.dialogueState, 93, 45);
        }
        
     // key
        if (hit(74, 45, "left") == true) {
            teleport(gp.dialogueState, 83, 46);
        }
        if (hit(83, 46, "right") == true) {
        	teleport(gp.dialogueState, 74, 45);
        }
        
    }

    // check event collision
    public boolean hit(int eventCol, int eventRow, String reqDirection) {

        boolean hit = false;

        // get player current solidArea position
        gp.player.solidArea.x = gp.player.worldX + gp.player.solidArea.x;
        gp.player.solidArea.y = gp.player.worldY + gp.player.solidArea.y;

        eventRect.x = (eventCol * gp.tileSize) + eventRect.x;
        eventRect.y = (eventRow * gp.tileSize) + eventRect.y;

        // checking if player's solidArea is colliding with eventRect's solidArea
        if (gp.player.solidArea.intersects(eventRect)) {
            // check player direction so event only happened when player facing some
            // direction
            if (gp.player.direction.contentEquals(reqDirection) || reqDirection.contentEquals("any")) {
                // if collision happening return true
                hit = true;
            }
        }

        // after checking the collision reset the solidArea x and y
        gp.player.solidArea.x = gp.player.solidAreaDefaultX;
        gp.player.solidArea.y = gp.player.solidAreaDefaultY;
        eventRect.x = eventRectDefaultX;
        eventRect.y = eventRectDefaultY;

        return hit;
    }

    public void teleport(int gameState, int destinationX, int destinationY) {
            gp.gameState = gameState;
            gp.ui.currentDialogue = "Teleport!";
            
            gp.player.worldX = destinationX * gp.tileSize;
            gp.player.worldY = destinationY * gp.tileSize;
    }

    public void damagePit(int gameState) {
            gp.gameState = gameState;
            gp.ui.currentDialogue = "you fall into a pit";

    }
//    
//    public void healingPool(int gameState) {
//        
//        if(gp.keyH.enterPressed == true) {
//            gp.gameState = gameState;
//            gp.ui.currentDialogue = "Your drink the water.\nYour life has been recovered";
//        }
//    }

}
