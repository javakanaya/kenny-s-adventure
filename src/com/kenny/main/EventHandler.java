package com.kenny.main;

public class EventHandler {

    GamePanel gp;
    EventRect eventRect[][];

    // Attributes for disable event until player moves away by 1 tile distance
    int previousEventX, previousEventY;
    boolean canTouchEvent = true;

    public EventHandler(GamePanel gp) {

        this.gp = gp;

        // event for each tiles on worldMap
        eventRect = new EventRect[gp.maxWorldCol][gp.maxWorldRow];

        int col = 0;
        int row = 0;
        while (col < gp.maxWorldCol && row < gp.maxWorldRow) {
            eventRect[col][row] = new EventRect();
            eventRect[col][row].x = 20;
            eventRect[col][row].y = 20;
            eventRect[col][row].width = 8;
            eventRect[col][row].height = 8;
            eventRect[col][row].eventRectDefaultX = eventRect[col][row].x;
            eventRect[col][row].eventRectDefaultY = eventRect[col][row].y;

            col++;
            if (col == gp.maxWorldCol) {
                col = 0;
                row++;
            }

        }
    }

    public void checkEvent() {

        // Check if the player is more than 1 tile away from the last event
        int xDistance = Math.abs(gp.player.worldX - previousEventX);
        int yDistance = Math.abs(gp.player.worldY - previousEventY);
        int distance = Math.max(xDistance, yDistance);
        if (distance > gp.tileSize) {
            canTouchEvent = true;
        }

        if (canTouchEvent == true) {
//            if (hit(51, 51, "any") == true) {
//                damagePit(gp.dialogueState, 51, 51);
//            }
//            if (hit(51, 60, "any") == true) {
//                healingPool(gp.dialogueState);
//            }
        	
        	//winter
        	
            // pillar1
            if (hit(90, 53, "any") == true) {
                teleport(gp.dialogueState, 78, 48);
            } else if (hit(78, 48, "any") == true) {
                teleport(gp.dialogueState, 90, 53);
            }

            // pillar2
            if (hit(80, 56, "any") == true) {
                teleport(gp.dialogueState, 86, 43);
            } else if (hit(86, 43, "any") == true) {
                teleport(gp.dialogueState, 80, 56);
            }

            // pillar3
            if (hit(79, 40, "any") == true) {
                teleport(gp.dialogueState, 88, 49);
            } else if (hit(88, 49, "any") == true) {
                teleport(gp.dialogueState, 79, 40);
            }

            // pillar4
            if (hit(93, 45, "any") == true) {
                teleport(gp.dialogueState, 82, 51);
            } else if (hit(82, 51, "any") == true) {
                teleport(gp.dialogueState, 93, 45);
            }

            // key
            if (hit(74, 45, "any") == true) {
                teleport(gp.dialogueState, 82, 45);
            } else if (hit(82, 45, "any") == true) {
                teleport(gp.dialogueState, 74, 45);
            }
            
            // spring
            if (hit(56, 64, "down") == true) {
                gp.fps = 1000;
            }else if (hit(56, 64, "up") == true) {
                gp.fps = 60;
            }
        }
    }

    // check event collision
    public boolean hit(int col, int row, String reqDirection) {

        boolean hit = false;

        // get player current solidArea position
        gp.player.solidArea.x = gp.player.worldX + gp.player.solidArea.x;
        gp.player.solidArea.y = gp.player.worldY + gp.player.solidArea.y;

        eventRect[col][row].x = (col * gp.tileSize) + eventRect[col][row].x;
        eventRect[col][row].y = (row * gp.tileSize) + eventRect[col][row].y;

        // checking if player's solidArea is colliding with eventRect's solidArea
        if (gp.player.solidArea.intersects(eventRect[col][row]) && eventRect[col][row].eventDone == false) {
            // check player direction so event only happened when player facing some
            // direction
            if (gp.player.direction.contentEquals(reqDirection) || reqDirection.contentEquals("any")) {
                // if collision happening return true
                hit = true;

                previousEventX = gp.player.worldX;
                previousEventY = gp.player.worldY;
            }
        }

        // after checking the collision reset the solidArea x and y
        gp.player.solidArea.x = gp.player.solidAreaDefaultX;
        gp.player.solidArea.y = gp.player.solidAreaDefaultY;
        eventRect[col][row].x = eventRect[col][row].eventRectDefaultX;
        eventRect[col][row].y = eventRect[col][row].eventRectDefaultY;

        return hit;
    }

    public void teleport(int gameState, int destinationCol, int destinationRow) {

        if (gp.keyH.enterPressed == true) {
            gp.gameState = gameState;
            gp.ui.currentDialogue = "Teleport!";

            gp.player.worldX = destinationCol * gp.tileSize;
            gp.player.worldY = destinationRow * gp.tileSize;

            canTouchEvent = false;
        }
    }

    public void damagePit(int gameState, int col, int row) {
        gp.gameState = gameState;
        gp.ui.currentDialogue = "you fall into a pit";

        // set one time event
        eventRect[col][row].eventDone = true;

        // player harus minggir dulu 1 tiles baru bisa interact event lagi
        canTouchEvent = false;
    }

//    public void healingPool(int gameState) {
//
//        if (gp.keyH.enterPressed == true) {
//            gp.gameState = gameState;
//            gp.ui.currentDialogue = "Your drink the water.\nYour life has been recovered";
//
//            canTouchEvent = false;
//        }
//    }

}
