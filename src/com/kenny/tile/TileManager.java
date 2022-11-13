package com.kenny.tile;

import java.awt.Graphics2D;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.imageio.ImageIO;
import com.kenny.main.GamePanel;
import com.kenny.main.UtilityTool;

public class TileManager {
    GamePanel gp;
    public Tile[] tile;
    public int mapTileNum[][];
    
    public TileManager(GamePanel gp) {
        this.gp = gp;
        
        tile = new Tile[100];

        // map size : maxWorldCol x maxWordRow
        mapTileNum = new int[gp.maxWorldCol][gp.maxWorldRow];
        
        getTileImage();
        loadMap("/maps/mainWorld.txt");
    }
    
    public void getTileImage() {
        
        // grass-dirt
        setup(10, "mainWorld/base/grass", true);
        setup(42, "mainWorld/base/grass", false);
        
        setup(12, "mainWorld/base/grass_corner_rightDown_dirt", false);
        setup(13, "mainWorld/base/grass_corner_leftUp_dirt", false);
        setup(14, "mainWorld/base/grass_corner_rightUp_dirt", false);
        setup(15, "mainWorld/base/grass_corner_leftDown_dirt", false);
        
        setup(20, "mainWorld/base/grass_up_dirt", false);
        setup(21, "mainWorld/base/grass_down_dirt", false);
        setup(22, "mainWorld/base/grass_right_dirt", false);
        setup(23, "mainWorld/base/grass_left_dirt", false);
        
        // dirt-grass
        setup(11, "mainWorld/base/dirt", false);
        
        setup(16, "mainWorld/base/dirt_corner_rightDown_grass", false);
        setup(17, "mainWorld/base/dirt_corner_leftDown_grass", false);
        setup(18, "mainWorld/base/dirt_corner_rightUp_grass", false);
        setup(19, "mainWorld/base/dirt_corner_leftUp_grass", false);
      
        // water-grass
        setup(24, "mainWorld/base/water", true);
        
        setup(26, "mainWorld/base/grass_corner_leftDown_water", true);
        setup(27, "mainWorld/base/grass_corner_rightDown_water", true);
        setup(28, "mainWorld/base/water_corner_rightUp_grass", true);
        
        setup(25, "mainWorld/base/water_up_grass", true);
        setup(29, "mainWorld/base/water_right_grass", true);
        setup(41, "mainWorld/base/water_left_grass", true);
        
        // snow-grass
        setup(30, "winterWorld/base/snow", false);
        
        setup(31, "winterWorld/base/grass_corner_leftUp_snow", false);
        setup(32, "winterWorld/base/grass_corner_rightDown_snow", false);
        setup(33, "winterWorld/base/grass_corner_rightUp_snow", false);
        
        setup(40, "winterWorld/base/snow_corner_leftDown_grass", false);
        setup(34, "winterWorld/base/snow_corner_leftUp_grass", false);
        setup(35, "winterWorld/base/snow_corner_rightDown_grass", false);
        setup(36, "winterWorld/base/snow_corner_rightUp_grass", false);
        
        setup(37, "winterWorld/base/snow_down_grass", false);
        setup(38, "winterWorld/base/snow_left_grass", false);
        setup(39, "winterWorld/base/snow_up_grass", false);
    
        // lightGrass-grass
        setup(50, "springWorld/base/lras", false);
        
        setup(51, "springWorld/base/grass_corner_leftDown_lras", false);
        setup(52, "springWorld/base/grass_corner_leftUp_lras", false);
        setup(53, "springWorld/base/grass_corner_rightDown_lras", false); 
        setup(54, "springWorld/base/grass_corner_rightUp_lras", false);
        
        setup(55, "springWorld/base/lras_corner_leftDown_grass", false);
        setup(56, "springWorld/base/lras_corner_leftUp_grass", false);
        setup(57, "springWorld/base/lras_corner_rightDown_grass", false);
        setup(58, "springWorld/base/lras_corner_rightUp_grass", false);
        
        setup(59, "springWorld/base/lras_down_grass", false);
        setup(60, "springWorld/base/lras_left_grass", false);
        setup(61, "springWorld/base/lras_up_grass", false);
        setup(62, "springWorld/base/lras_right_grass", false);
        
        // brown-grass
        setup(70, "autumnWorld/base/brown", false);
        
        setup(71, "autumnWorld/base/brown_corner_leftDown_grass", false);
        setup(72, "autumnWorld/base/brown_corner_leftUp_grass", false);
        setup(73, "autumnWorld/base/brown_corner_rightDown_grass", false);
        setup(74, "autumnWorld/base/brown_corner_rightUp_grass", false);
        
        setup(75, "autumnWorld/base/brown_down_grass", false);
        setup(76, "autumnWorld/base/brown_left_grass", false);
        setup(77, "autumnWorld/base/brown_right_grass", false);
        setup(78, "autumnWorld/base/brown_up_grass", false);
        
        setup(79, "autumnWorld/base/grass_corner_leftDown_brown", false);
        setup(80, "autumnWorld/base/grass_corner_leftUp_brown", false);
        setup(81, "autumnWorld/base/grass_corner_rightDown_brown", false);
        setup(82, "autumnWorld/base/grass_corner_rightUp_brown", false);
    }
    
    public void setup(int index, String imageName, boolean collision) {
        
        UtilityTool uTool = new UtilityTool();
        
        try {
            tile[index] = new Tile();
            tile[index].image = ImageIO.read(getClass().getResourceAsStream("/tiles/" + imageName + ".png"));
            tile[index].image = uTool.scaleImage(tile[index].image, gp.tileSize, gp.tileSize);
            tile[index].collision = collision;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void loadMap(String filePath) {
        String line;
        try {
            // get the text file
            InputStream is = getClass().getResourceAsStream(filePath);
            // read the content of the text file
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
        
            int col = 0;
            int row = 0;
            
            while(col < gp.maxWorldCol && row < gp.maxWorldRow) {
    
                    line = br.readLine();
    
                while(col < gp.maxWorldCol) {
                    String numbers[] = line.split(" ");
                    
                    int num = Integer.parseInt(numbers[col]);
                    
                    mapTileNum[col][row] = num;
                    col++;
                }
                
                if(col == gp.maxWorldCol) {
                    col = 0;
                    row++;
                }
            }
            
            br.close();
        } catch (IOException e) {
            
        }
    }
    public void draw(Graphics2D g2d) {
        int worldCol = 0;
        int worldRow = 0;

       
        while(worldCol < gp.maxWorldCol && worldRow < gp.maxWorldRow) {
            int tileNum = mapTileNum[worldCol][worldRow];
            
            // tiles position on entire world
            int worldX = worldCol * gp.tileSize; // 0 * 48
            int worldY = worldRow * gp.tileSize; // 0 * 48
                
            // where on the screen the tiles will be draw
            // the player screen is for the offset
            int screenX = worldX - gp.player.worldX + gp.player.screenX;
            int screenY = worldY - gp.player.worldY + gp.player.screenY;
                
            // Improve render, draw only the tiles that seen on the screen
            if(worldX + 2 * gp.tileSize > gp.player.worldX - gp.player.screenX &&
                    worldX - 2 * gp.tileSize < gp.player.worldX + gp.player.screenX &&
                    worldY + 2 * gp.tileSize > gp.player.worldY - gp.player.screenY &&
                    worldY - 2 * gp.tileSize < gp.player.worldY + gp.player.screenY) {
                
                g2d.drawImage(tile[tileNum].image, screenX, screenY, null);
                // System.out.println("sX : " + screenX + " sY :" + screenX);
            }
            // to draw the next tile;
            worldCol++;
            
            if(worldCol == gp.maxWorldCol) {
                worldCol = 0;
                worldRow++;
            }
        }
    }   
}
