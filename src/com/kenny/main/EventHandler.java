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

        if(hit(51, 51, "any") == true) {
            damagePit(gp.dialogueState);
        }
//        if(hit(51, 60, "any") == true) {
//            healingPool(gp.dialogueState);
//        }
        if (hit(74, 49, "any") == true) {
            teleport(gp.dialogueState);
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

    public void teleport(int gameState) {
            gp.gameState = gameState;
            gp.ui.currentDialogue = "Teleport!";
            gp.player.worldX = 79 * gp.tileSize;
            gp.player.worldY = 47 * gp.tileSize;
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
