package com.kenny.main;

import com.kenny.entity.Entity;

public class CollisionChecker {
    GamePanel gp;
    
    public CollisionChecker(GamePanel gp) {
        this.gp = gp;
    }
    
    // check if the player solidArea, hit the  tile or not
    public void checkTile(Entity entity) {
        
        // leftX
        int entityLeftWorldX = entity.worldX + entity.solidArea.x;
        // rightX
        int entityRightWorldX = entity.worldX + entity.solidArea.x + entity.solidArea.width;
        // topY
        int entityTopWorldY = entity.worldY + entity.solidArea.y;
        // bottomY
        int entityBottomWorldY = entity.worldY + entity.solidArea.y + entity.solidArea.height;
        
        int entityLeftCol = entityLeftWorldX / gp.tileSize;
        int entityRightCol = entityRightWorldX / gp.tileSize;
        int entityTopRow = entityTopWorldY / gp.tileSize;
        int entityBottomRow = entityBottomWorldY / gp.tileSize;
        
        
        // for the tile location that hit the player solidArea
        int tileNum1, tileNum2;
        
        switch(entity.direction) {
            case "up":
                entityTopRow = (entityTopWorldY - entity.speed) / gp.tileSize;
                tileNum1 = gp.tileM.mapTileNum[entityLeftCol][entityTopRow];
                tileNum2 = gp.tileM.mapTileNum[entityRightCol][entityTopRow];
                if(gp.tileM.tile[tileNum1].collision == true || gp.tileM.tile[tileNum2].collision == true) {
                    entity.collisionOn = true;
                }
                break;
            case "left":
                entityLeftCol = (entityLeftWorldX - entity.speed) / gp.tileSize;
                tileNum1 = gp.tileM.mapTileNum[entityLeftCol][entityTopRow];
                tileNum2 = gp.tileM.mapTileNum[entityLeftCol][entityBottomRow];
                if(gp.tileM.tile[tileNum1].collision == true || gp.tileM.tile[tileNum2].collision == true) {
                    entity.collisionOn = true;
                }
                break;
            case "down":
                entityBottomRow = (entityBottomWorldY + entity.speed) / gp.tileSize;
                tileNum1 = gp.tileM.mapTileNum[entityLeftCol][entityBottomRow];
                tileNum2 = gp.tileM.mapTileNum[entityRightCol][entityBottomRow];
                if(gp.tileM.tile[tileNum1].collision == true || gp.tileM.tile[tileNum2].collision == true) {
                    entity.collisionOn = true;
                }
                break;
            case "right":
                entityRightCol = (entityRightWorldX + entity.speed) / gp.tileSize;
                tileNum1 = gp.tileM.mapTileNum[entityRightCol][entityTopRow];
                tileNum2 = gp.tileM.mapTileNum[entityRightCol][entityBottomRow];
                if(gp.tileM.tile[tileNum1].collision == true || gp.tileM.tile[tileNum2].collision == true) {
                    entity.collisionOn = true;
                }
                break; 
        }
    }
    
    public int checkObject(Entity entity, boolean player) {
    	
    	int index = 999;
    	
    	for(int i = 0; i < gp.key.length; i++) {
    		
    		if(gp.key[i] != null) {
    			
    			
    			// Get entity's solid area position
    			entity.solidArea.x = entity.worldX + entity.solidArea.x;
    			entity.solidArea.y = entity.worldY + entity.solidArea.y;
    			
    			// Get Object's solid area position
    			gp.key[i].solidArea.x = gp.key[i].worldX + gp.key[i].solidArea.x;
    			gp.key[i].solidArea.y = gp.key[i].worldY + gp.key[i].solidArea.y;
    			
    			switch(entity.direction) {
    			case "up" :
    				entity.solidArea.y -= entity.speed;
    				if(entity.solidArea.intersects(gp.key[i].solidArea)) {
    					if(gp.key[i].collision == true) {
    						entity.collisionOn = true;
    					}
    					if(player == true) {
    						index = i;
    					}
    				}
    				break;
    			case "down" :
    				entity.solidArea.y += entity.speed;
    				if(entity.solidArea.intersects(gp.key[i].solidArea)) {
    					if(gp.key[i].collision == true) {
    						entity.collisionOn = true;
    					}
    					if(player == true) {
    						index = i;
    					}
    				}
    				break;
    			case "left" :
    				entity.solidArea.x -= entity.speed;
    				if(entity.solidArea.intersects(gp.key[i].solidArea)) {
    					if(gp.key[i].collision == true) {
    						entity.collisionOn = true;
    					}
    					if(player == true) {
    						index = i;
    					}
    				}
    				break;
    			case "right" :
    				entity.solidArea.x += entity.speed;
    				if(entity.solidArea.intersects(gp.key[i].solidArea)) {
    					if(gp.key[i].collision == true) {
    						entity.collisionOn = true;
    					}
    					if(player == true) {
    						index = i;
    					}
    				}
    				break;
    			}
    			entity.solidArea.x = entity.solidAreaDefaultX;
    			entity.solidArea.y = entity.solidAreaDefaultY;
    			gp.key[i].solidArea.x = gp.key[i].solidDefaultAreaX;
    			gp.key[i].solidArea.y = gp.key[i].solidDefaultAreaY;
    		}
    		
    	}
    	
    	//check if player hitting any object, if it is, then return the index of object
    	return index;
    	
    }
}
