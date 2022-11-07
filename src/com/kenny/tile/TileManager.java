package com.kenny.tile;

import java.awt.Graphics2D;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.imageio.ImageIO;
import com.kenny.main.GamePanel;

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
        try {
            tile[10] = new Tile();
            tile[10].image = ImageIO.read(getClass().getResourceAsStream("/tiles/mainWorld/base/grass.png"));
            tile[10].collision = true;
            
            tile[11] = new Tile();
            tile[11].image = ImageIO.read(getClass().getResourceAsStream("/tiles/mainWorld/base/dirt.png"));
            
            tile[12] = new Tile();
            tile[12].image = ImageIO.read(getClass().getResourceAsStream("/tiles/mainWorld/base/grass_corner_rightDown_dirt.png"));
            
            tile[13] = new Tile();
            tile[13].image = ImageIO.read(getClass().getResourceAsStream("/tiles/mainWorld/base/grass_corner_leftUp_dirt.png"));
            
            tile[14] = new Tile();
            tile[14].image = ImageIO.read(getClass().getResourceAsStream("/tiles/mainWorld/base/grass_corner_rightUp_dirt.png"));
            
            tile[15] = new Tile();
            tile[15].image = ImageIO.read(getClass().getResourceAsStream("/tiles/mainWorld/base/grass_corner_leftDown_dirt.png"));
            
            tile[16] = new Tile();
            tile[16].image = ImageIO.read(getClass().getResourceAsStream("/tiles/mainWorld/base/dirt_corner_rightDown_grass.png"));
            
            tile[17] = new Tile();
            tile[17].image = ImageIO.read(getClass().getResourceAsStream("/tiles/mainWorld/base/dirt_corner_leftDown_grass.png"));
            
            tile[18] = new Tile();
            tile[18].image = ImageIO.read(getClass().getResourceAsStream("/tiles/mainWorld/base/dirt_corner_rightUp_grass.png"));
            
            tile[19] = new Tile();
            tile[19].image = ImageIO.read(getClass().getResourceAsStream("/tiles/mainWorld/base/dirt_corner_leftUp_grass.png"));
            
            tile[20] = new Tile();
            tile[20].image = ImageIO.read(getClass().getResourceAsStream("/tiles/mainWorld/base/grass_up_dirt.png"));
            
            tile[21] = new Tile();
            tile[21].image = ImageIO.read(getClass().getResourceAsStream("/tiles/mainWorld/base/grass_down_dirt.png"));
            
            tile[22] = new Tile();
            tile[22].image = ImageIO.read(getClass().getResourceAsStream("/tiles/mainWorld/base/grass_right_dirt.png"));
            
            tile[23] = new Tile();
            tile[23].image = ImageIO.read(getClass().getResourceAsStream("/tiles/mainWorld/base/grass_left_dirt.png"));
            
            tile[24] = new Tile();
            tile[24].image = ImageIO.read(getClass().getResourceAsStream("/tiles/mainWorld/base/water.png"));
            
            tile[25] = new Tile();
            tile[25].image = ImageIO.read(getClass().getResourceAsStream("/tiles/mainWorld/base/water_up_grass.png"));
            tile[25].collision = true;
            
            tile[26] = new Tile();
            tile[26].image = ImageIO.read(getClass().getResourceAsStream("/tiles/mainWorld/base/grass_corner_leftDown_water.png"));
            tile[26].collision = true;
            
            tile[27] = new Tile();
            tile[27].image = ImageIO.read(getClass().getResourceAsStream("/tiles/mainWorld/base/grass_corner_rightDown_water.png"));
            tile[27].collision = true;
            
            tile[28] = new Tile();
            tile[28].image = ImageIO.read(getClass().getResourceAsStream("/tiles/mainWorld/base/water_corner_rightUp_grass.png"));
            tile[28].collision = true;
            
            tile[29] = new Tile();
            tile[29].image = ImageIO.read(getClass().getResourceAsStream("/tiles/mainWorld/base/water_right_grass.png"));
            tile[29].collision = true;
            
            tile[41] = new Tile();
            tile[41].image = ImageIO.read(getClass().getResourceAsStream("/tiles/mainWorld/base/water_left_grass.png"));
            tile[41].collision = true;
            
            tile[42] = new Tile();
            tile[42].image = ImageIO.read(getClass().getResourceAsStream("/tiles/mainWorld/base/grass.png"));
        
            
            tile[30] = new Tile();
            tile[30].image = ImageIO.read(getClass().getResourceAsStream("/tiles/winterWorld/base/snow.png"));
            
            tile[31] = new Tile();
            tile[31].image = ImageIO.read(getClass().getResourceAsStream("/tiles/winterWorld/base/grass_corner_leftUp_snow.png"));
            
            tile[32] = new Tile();
            tile[32].image = ImageIO.read(getClass().getResourceAsStream("/tiles/winterWorld/base/grass_corner_rightDown_snow.png"));
            
            tile[33] = new Tile();
            tile[33].image = ImageIO.read(getClass().getResourceAsStream("/tiles/winterWorld/base/grass_corner_rightUp_snow.png"));
            
            tile[40] = new Tile();
            tile[40].image = ImageIO.read(getClass().getResourceAsStream("/tiles/winterWorld/base/snow_corner_leftDown_grass.png"));
            
            tile[34] = new Tile();
            tile[34].image = ImageIO.read(getClass().getResourceAsStream("/tiles/winterWorld/base/snow_corner_leftUp_grass.png"));
            
            tile[35] = new Tile();
            tile[35].image = ImageIO.read(getClass().getResourceAsStream("/tiles/winterWorld/base/snow_corner_rightDown_grass.png"));
            
            tile[36] = new Tile();
            tile[36].image = ImageIO.read(getClass().getResourceAsStream("/tiles/winterWorld/base/snow_corner_rightUp_grass.png"));
            
            tile[37] = new Tile();
            tile[37].image = ImageIO.read(getClass().getResourceAsStream("/tiles/winterWorld/base/snow_down_grass.png"));
            
            tile[38] = new Tile();
            tile[38].image = ImageIO.read(getClass().getResourceAsStream("/tiles/winterWorld/base/snow_left_grass.png"));
            
            tile[39] = new Tile();
            tile[39].image = ImageIO.read(getClass().getResourceAsStream("/tiles/winterWorld/base/snow_up_grass.png"));
            
            tile[50] = new Tile();
            tile[50].image = ImageIO.read(getClass().getResourceAsStream("/tiles/springWorld/base/lras.png"));
            
            tile[51] = new Tile();
            tile[51].image = ImageIO.read(getClass().getResourceAsStream("/tiles/springWorld/base/grass_corner_leftDown_lras.png"));
            
            tile[52] = new Tile();
            tile[52].image = ImageIO.read(getClass().getResourceAsStream("/tiles/springWorld/base/grass_corner_leftUp_lras.png"));
            
            tile[53] = new Tile();
            tile[53].image = ImageIO.read(getClass().getResourceAsStream("/tiles/springWorld/base/grass_corner_rightDown_lras.png"));
            
            tile[54] = new Tile();
            tile[54].image = ImageIO.read(getClass().getResourceAsStream("/tiles/springWorld/base/grass_corner_rightUp_lras.png"));
            
            tile[55] = new Tile();
            tile[55].image = ImageIO.read(getClass().getResourceAsStream("/tiles/springWorld/base/lras_corner_leftDown_grass.png"));
            
            tile[56] = new Tile();
            tile[56].image = ImageIO.read(getClass().getResourceAsStream("/tiles/springWorld/base/lras_corner_leftUp_grass.png"));
            
            tile[57] = new Tile();
            tile[57].image = ImageIO.read(getClass().getResourceAsStream("/tiles/springWorld/base/lras_corner_rightDown_grass.png"));
            
            tile[58] = new Tile();
            tile[58].image = ImageIO.read(getClass().getResourceAsStream("/tiles/springWorld/base/lras_corner_rightUp_grass.png"));
            
            tile[59] = new Tile();
            tile[59].image = ImageIO.read(getClass().getResourceAsStream("/tiles/springWorld/base/lras_down_grass.png"));
            
            tile[60] = new Tile();
            tile[60].image = ImageIO.read(getClass().getResourceAsStream("/tiles/springWorld/base/lras_left_grass.png"));
            
            tile[61] = new Tile();
            tile[61].image = ImageIO.read(getClass().getResourceAsStream("/tiles/springWorld/base/lras_up_grass.png"));
            
            tile[62] = new Tile();
            tile[62].image = ImageIO.read(getClass().getResourceAsStream("/tiles/springWorld/base/iras_right_grass.png"));
            
            tile[70] = new Tile();
            tile[70].image = ImageIO.read(getClass().getResourceAsStream("/tiles/autumnWorld/base/brown.png"));
            
            tile[71] = new Tile();
            tile[71].image = ImageIO.read(getClass().getResourceAsStream("/tiles/autumnWorld/base/brown_corner_leftDown_grass.png"));
            
            tile[72] = new Tile();
            tile[72].image = ImageIO.read(getClass().getResourceAsStream("/tiles/autumnWorld/base/brown_corner_leftUp_grass.png"));
            
            tile[73] = new Tile();
            tile[73].image = ImageIO.read(getClass().getResourceAsStream("/tiles/autumnWorld/base/brown_corner_rightDown_grass.png"));

            tile[74] = new Tile();
            tile[74].image = ImageIO.read(getClass().getResourceAsStream("/tiles/autumnWorld/base/brown_corner_rightUp__grass.png"));
            
            tile[75] = new Tile();
            tile[75].image = ImageIO.read(getClass().getResourceAsStream("/tiles/autumnWorld/base/brown_down_grass.png"));
            
            tile[76] = new Tile();
            tile[76].image = ImageIO.read(getClass().getResourceAsStream("/tiles/autumnWorld/base/brown_left_grass.png"));
            
            tile[77] = new Tile();
            tile[77].image = ImageIO.read(getClass().getResourceAsStream("/tiles/autumnWorld/base/brown_right_grass.png"));
            
            tile[78] = new Tile();
            tile[78].image = ImageIO.read(getClass().getResourceAsStream("/tiles/autumnWorld/base/brown_up_grass.png"));
            
            tile[79] = new Tile();
            tile[79].image = ImageIO.read(getClass().getResourceAsStream("/tiles/autumnWorld/base/grass_corner_leftDown_brown.png"));
            
            tile[80] = new Tile();
            tile[80].image = ImageIO.read(getClass().getResourceAsStream("/tiles/autumnWorld/base/grass_corner_leftUp_brown.png"));
            
            tile[81] = new Tile();
            tile[81].image = ImageIO.read(getClass().getResourceAsStream("/tiles/autumnWorld/base/grass_corner_rightDown_brown.png"));
            
            tile[82] = new Tile();
            tile[82].image = ImageIO.read(getClass().getResourceAsStream("/tiles/autumnWorld/base/grass_corner_rightUp_brown.png"));
            
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
            
            // Center position
            int worldX = worldCol * gp.tileSize; // 0 * 48
            int worldY = worldRow * gp.tileSize; // 0 * 48
                
            //
            int screenX = worldX - gp.player.worldX + gp.player.screenX;
            int screenY = worldY - gp.player.worldY + gp.player.screenY;
                
            // Improve render, draw only the tiles that seen on the screen
            if(worldX + 2 * gp.tileSize > gp.player.worldX - gp.player.screenX &&
                    worldX - 2 * gp.tileSize < gp.player.worldX + gp.player.screenX &&
                    worldY + 2 * gp.tileSize > gp.player.worldY - gp.player.screenY &&
                    worldY - 2 * gp.tileSize < gp.player.worldY + gp.player.screenY) {
                
                g2d.drawImage(tile[tileNum].image, screenX, screenY, gp.tileSize, gp.tileSize, null);
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
