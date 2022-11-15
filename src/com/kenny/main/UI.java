package com.kenny.main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.text.DecimalFormat;

import com.kenny.object.gatekey.AutumnKey;
import com.kenny.object.gatekey.SuperObject;
import com.kenny.object.gatekey.SpringKey;
import com.kenny.object.gatekey.SummerKey;
import com.kenny.object.gatekey.WinterKey;


public class UI {
    GamePanel gp;
    Graphics2D g2d;
    Font arial_40, consolas_40, arial_80B;
    BufferedImage[] keyImage = new BufferedImage[4];
    SuperObject[] keys = new SuperObject[4];
    
    // variables for message
    public boolean messageOn = false;
    public String message = "";
    int messageCounter = 0;
    
    // game play time
    double playTime;
    DecimalFormat dFormat = new DecimalFormat("#0.00");
    
    public UI(GamePanel gp) {
        
        this.gp = gp;
        
        // instantiate before game loop
        arial_40 = new Font("Arial", Font.PLAIN, 40);
        consolas_40 = new Font("Consolas", Font.PLAIN, 40);
        arial_80B = new Font("Arial", Font.PLAIN, 80);
        keys[0] = new WinterKey(gp);  
        keys[1] = new SpringKey(gp); 
        keys[2] = new SummerKey(gp);
        keys[3] = new AutumnKey(gp);
    }
    
    public void showMessage(String text) {
        
        message = text;
        messageOn = true;
    }
    
    public void draw(Graphics2D g2d) {
        
        this.g2d = g2d;
        
        // choose font
        g2d.setFont(arial_40);
        g2d.setColor(Color.white);
        
        // UI for playState
        if(gp.gameState == gp.playState) {
            
            // draw keys on x, y location
            if(gp.player.hasKey[0] == 1)
                g2d.drawImage(keys[0].image, gp.tileSize / 2, gp.tileSize / 2, gp.tileSize, gp.tileSize, null);
            if(gp.player.hasKey[1] == 1)
                g2d.drawImage(keys[1].image, (gp.tileSize / 2) * 2, gp.tileSize / 2, gp.tileSize, gp.tileSize, null);
            if(gp.player.hasKey[2] == 1)
                g2d.drawImage(keys[2].image, (gp.tileSize / 2) * 3, gp.tileSize / 2, gp.tileSize, gp.tileSize, null);
            if(gp.player.hasKey[3] == 1)
                g2d.drawImage(keys[3].image, (gp.tileSize / 2) * 4, gp.tileSize / 2, gp.tileSize, gp.tileSize, null);
            
            playTime += (double)1 / 60;
            g2d.drawString("Time: "+ dFormat.format(playTime), gp.tileSize*11, 65);
            
            if(messageOn == true) {
                g2d.setFont(g2d.getFont().deriveFont(30F));
                g2d.drawString(message, gp.tileSize * 4, gp.tileSize * 11);
                
                messageCounter++;
                
                if(messageCounter > 120) {
                    messageCounter = 0;
                    messageOn = false;
                }
            }
        }
        // UI for pauseState
        else if(gp.gameState == gp.pauseState) {
            drawPauseScreen();
        } 
        else if(gp.gameState == gp.finishState) {
            String text;
            int x, y;
            
            g2d.setFont(arial_40);
            g2d.setColor(Color.white);
            text = "You opened all gates!";
            x = getXforCenteredText(text);
            y = gp.screenHeight / 2 - (gp.tileSize * 3);
            g2d.drawString(text, x, y);
            
            text = "Your time is : " + dFormat.format(playTime) + "!";
            x = getXforCenteredText(text);
            y = gp.screenHeight / 2 + (gp.tileSize * 4);
            g2d.drawString(text, x, y);
            
            
            g2d.setFont(arial_80B);
            g2d.setColor(Color.yellow);
            text = "Congratulations!";
            x = getXforCenteredText(text);
            y = gp.screenHeight / 2 + (gp.tileSize * 2);
            g2d.drawString(text, x, y);
            
            // stop the thread to stop the game
            gp.gameThread = null;
        }
    }
    
    public void drawPauseScreen() {
        
        String text = "PAUSED";
        int x = getXforCenteredText(text);
        int y = gp.screenHeight / 2;
        
        g2d.drawString(text, x, y);
    }
    
    // get textLength for centered position
    public int getXforCenteredText(String text) {
        
        int textLength = (int)g2d.getFontMetrics().getStringBounds(text, g2d).getWidth();
        return gp.screenWidth / 2 - textLength / 2;
    }
}
