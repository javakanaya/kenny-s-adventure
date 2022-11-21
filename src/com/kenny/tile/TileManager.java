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
        
        tile = new Tile[200];

        // map size : maxWorldCol x maxWordRow
        mapTileNum = new int[gp.maxWorldCol][gp.maxWorldRow];
        
        getTileImage();
        loadMap("/maps/world.txt");
    }
    
    public void getTileImage() {
        
        // grass-dirt
        setup(20, "mainWorld/base/020-dirt", false);
        setup(21, "mainWorld/base/021-grass", false); //11
        
        setup(22, "mainWorld/base/022-dirt_corner_leftDown_grass", false);
        setup(23, "mainWorld/base/023-dirt_corner_leftUp_grass", false);
        setup(24, "mainWorld/base/024-dirt_corner_rightDown_grass", false);
        setup(25, "mainWorld/base/025-dirt_corner_rightUp_grass", false);
        
        setup(26, "mainWorld/base/026-grass_corner_leftDown_dirt", false);
        setup(27, "mainWorld/base/027-grass_corner_leftUp_dirt", false);
        setup(28, "mainWorld/base/028-grass_corner_rightDown_dirt", false);
        setup(29, "mainWorld/base/029-grass_corner_rightUp_dirt", false);
        
        setup(30, "mainWorld/base/030-grass_down_dirt", false);
        setup(31, "mainWorld/base/031-grass_left_dirt", false);
        setup(32, "mainWorld/base/032-grass_right_dirt", false);
        setup(33, "mainWorld/base/033-grass_up_dirt", false);
        
        setup(34, "mainWorld/base/034-grass_fence1", true);
        setup(35, "mainWorld/base/035-grass_fence2", true);
        setup(36, "mainWorld/base/036-grass_fence3", true);
        setup(37, "mainWorld/base/037-grass_fence4", true);
        setup(38, "mainWorld/base/038-grass_fence5", true);
        setup(39, "mainWorld/base/039-grass_fence6", true);
        setup(115, "mainWorld/base/115-grass_fence7", true);
      
        // water-grass
        setup(0, "mainWorld/base/000-water", true);
        
        setup(1, "mainWorld/base/001-grass_corner_leftDown_water", true);
        setup(2, "mainWorld/base/002-grass_corner_leftUp_water", true);
        setup(3, "mainWorld/base/003-grass_corner_rightDown_water", true);
        setup(4, "mainWorld/base/004-grass_corner_rightUp_water", true);
        
        setup(5, "mainWorld/base/005-water_corner_leftDown_grass", true);
        setup(6, "mainWorld/base/006-water_corner_leftUp_grass", true);
        setup(7, "mainWorld/base/007-water_corner_rightDown_grass", true);
        setup(8, "mainWorld/base/008-water_corner_rightUp_grass", true);
        
        setup(9, "mainWorld/base/009-water_down_grass", true);
        setup(10, "mainWorld/base/010-water_left_grass", true);
        setup(11, "mainWorld/base/011-water_right_grass", true);
        setup(12, "mainWorld/base/012-water_up_grass", true);
        
        // snow-grass
        setup(80, "winterWorld/base/080-snow", false);
        
        setup(81, "winterWorld/base/081-grass_corner_leftDown_snow", false);
        setup(82, "winterWorld/base/082-grass_corner_leftUp_snow", false);
        setup(83, "winterWorld/base/083-grass_corner_rightDown_snow", false);
        setup(84, "winterWorld/base/084-grass_corner_rightUp_snow", false);
        
        setup(85, "winterWorld/base/085-snow_corner_leftDown_grass", false);
        setup(86, "winterWorld/base/086-snow_corner_leftUp_grass", false);
        setup(87, "winterWorld/base/087-snow_corner_rightDown_grass", false);
        setup(88, "winterWorld/base/088-snow_corner_rightUp_grass", false);
        
        setup(89, "winterWorld/base/089-snow_down_grass", false);
        setup(90, "winterWorld/base/090-snow_left_grass", false);
        setup(91, "winterWorld/base/091-snow_right_grass", false);
        setup(92, "winterWorld/base/092-snow_up_grass", false);
        
        setup(93, "winterWorld/base/093-snowFence_01", true);
        setup(94, "winterWorld/base/094-snowFence_04", true);
        setup(95, "winterWorld/base/095-snowFence_07", true);
        setup(96, "winterWorld/base/096-snowFence_08", true);
        setup(97, "winterWorld/base/097-snowFence_09", true);
        setup(98, "winterWorld/base/098-snowFence_10", true);
        setup(99, "winterWorld/base/099-snow_ph7", false);
        setup(113, "winterWorld/base/113-snowFence_02", true);
        setup(114, "winterWorld/base/114-snowFence_03", true);
        
        
        // snowdark
        setup(100, "winterWorld/level2/100-snowdark", false);
        setup(101, "winterWorld/level2/101-snowdark_top", true);
        setup(102, "winterWorld/level2/102-snowdark_bot", true);
        setup(103, "winterWorld/level2/103-snowdark_left", false);
        setup(104, "winterWorld/level2/104-snowdark_right", false);
        setup(105, "winterWorld/level2/105-snowdark_rightBot", true);
        setup(106, "winterWorld/level2/106-snowdark_leftBot", true);
        setup(107, "winterWorld/level2/107-snowdark_leftTop", true);
        setup(108, "winterWorld/level2/108-snowdark_rightTop", true);
        setup(109, "winterWorld/level2/109-snowdark_rightSmall", true);
        setup(110, "winterWorld/level2/110-snowdark_leftSmall", true);
        setup(111, "winterWorld/level2/111-snowdark_rightSmalt", false);
        setup(112, "winterWorld/level2/112-snowdark_leftSmalt", false);
    
        // lightGrass-grass
        setup(40, "springWorld/base/040-lras", false);
        
        setup(41, "springWorld/base/041-grass_corner_leftDown_lras", false);
        setup(42, "springWorld/base/042-grass_corner_leftUp_lras", false);
        setup(43, "springWorld/base/043-grass_corner_rightDown_lras", false); 
        setup(44, "springWorld/base/044-grass_corner_rightUp_lras", false);
        
        setup(45, "springWorld/base/045-lras_corner_rightUp_grass", false);
        setup(46, "springWorld/base/046-lras_corner_leftDown_grass", false);
        setup(47, "springWorld/base/047-lras_corner_leftUp_grass", false);
        setup(48, "springWorld/base/048-lras_corner_rightDown_grass", false);
        
        setup(49, "springWorld/base/049-iras_right_grass", false);
        setup(50, "springWorld/base/050-lras_down_grass", false);
        setup(51, "springWorld/base/051-lras_left_grass", false);
        setup(52, "springWorld/base/052-lras_up_grass", false);
        
        // brown-grass
        setup(60, "autumnWorld/base/060-brown", false);
        
        setup(61, "autumnWorld/base/061-brown_corner_leftDown_grass", false);
        setup(62, "autumnWorld/base/062-brown_corner_leftUp_grass", false);
        setup(63, "autumnWorld/base/063-brown_corner_rightDown_grass", false);
        setup(64, "autumnWorld/base/064-brown_corner_rightUp__grass", false);
        
        setup(65, "autumnWorld/base/065-brown_down_grass", false);
        setup(66, "autumnWorld/base/066-brown_left_grass", false);
        setup(67, "autumnWorld/base/067-brown_right_grass", false);
        setup(68, "autumnWorld/base/068-brown_up_grass", false);
        
        setup(69, "autumnWorld/base/069-grass_corner_leftDown_brown", false);
        setup(70, "autumnWorld/base/070-grass_corner_leftUp_brown", false);
        setup(71, "autumnWorld/base/071-grass_corner_rightDown_brown", false);
        setup(72, "autumnWorld/base/072-grass_corner_rightUp_brown", false);
        
        
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
