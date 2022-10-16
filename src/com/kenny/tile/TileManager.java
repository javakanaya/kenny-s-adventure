package com.kenny.tile;

import java.awt.Graphics2D;
import java.io.IOException;
import javax.imageio.ImageIO;
import com.kenny.main.GamePanel;

public class TileManager {
    GamePanel gp;
    Tile[] tile;
    
    public TileManager(GamePanel gp) {
        this.gp = gp;
        
        tile = new Tile[10];
        
        getTileImage();
    }
    
    public void getTileImage() {
        try {
            tile[0] = new Tile();
            tile[0].image = ImageIO.read(getClass().getResourceAsStream("/tiles/dirt.png"));
            
            tile[1] = new Tile();
            tile[1].image = ImageIO.read(getClass().getResourceAsStream("/tiles/grass.png"));
            
            tile[2] = new Tile();
            tile[2].image = ImageIO.read(getClass().getResourceAsStream("/tiles/yellow_road.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void draw(Graphics2D g2d) {
        g2d.drawImage(tile[0].image, 0, 0, gp.tileSize, gp.tileSize, null);
        g2d.drawImage(tile[0].image, 1 * 48, 0, gp.tileSize, gp.tileSize, null);
        g2d.drawImage(tile[0].image, 2 * 48, 0, gp.tileSize, gp.tileSize, null);
        g2d.drawImage(tile[0].image, 3 * 48, 0, gp.tileSize, gp.tileSize, null);
        
        g2d.drawImage(tile[1].image, 4 * 48, 0, gp.tileSize, gp.tileSize, null);
        g2d.drawImage(tile[1].image, 5 * 48, 0, gp.tileSize, gp.tileSize, null);
        g2d.drawImage(tile[1].image, 6 * 48, 0, gp.tileSize, gp.tileSize, null);
        g2d.drawImage(tile[1].image, 7 * 48, 0, gp.tileSize, gp.tileSize, null);
        
        g2d.drawImage(tile[2].image, 8 * 48, 0, gp.tileSize, gp.tileSize, null);
        g2d.drawImage(tile[2].image, 9 * 48, 0, gp.tileSize, gp.tileSize, null);
        g2d.drawImage(tile[2].image, 10 * 48, 0, gp.tileSize, gp.tileSize, null);
        g2d.drawImage(tile[2].image, 11 * 48, 0, gp.tileSize, gp.tileSize, null);
    }
}
