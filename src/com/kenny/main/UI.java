package com.kenny.main;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

import com.kenny.entity.Entity;
import com.kenny.object.s_autumn.OBJ_AutumnKey;
import com.kenny.object.s_spring.OBJ_SpringKey;
import com.kenny.object.s_summer.OBJ_SummerKey;
import com.kenny.object.s_winter.OBJ_WinterKey;

public class UI {

    GamePanel gp;
    Graphics2D g2d;
    Font courier, calibri, chaichle, maruMonica;
    BufferedImage[] keyImage = new BufferedImage[4];
    Entity[] keys = new Entity[4];

    public boolean messageOn = false;
    public String message = "";
    int messageCounter = 0;

    public String currentDialogue = "";
    public int commandNum = 0;

    public int titleScreenState = 0; // 0 is menuScreen, 1 is storyScreen

    public int slotCol = 0;
    public int slotRow = 0;

//    game play time
//    double playTime;
//    DecimalFormat dFormat = new DecimalFormat("#0.00");

    public UI(GamePanel gp) {

        this.gp = gp;

        // instantiate before game loop
        try {
            InputStream is = getClass().getResourceAsStream("/font/COUR.TTF");
            courier = Font.createFont(Font.TRUETYPE_FONT, is);
            is = getClass().getResourceAsStream("/font/CALIBRI.TTF");
            calibri = Font.createFont(Font.TRUETYPE_FONT, is);
            is = getClass().getResourceAsStream("/font/ChailceNogginRegular-2OXoW.ttf");
            chaichle = Font.createFont(Font.TRUETYPE_FONT, is);
            is = getClass().getResourceAsStream("/font/x12y16pxMaruMonica.ttf");
            maruMonica = Font.createFont(Font.TRUETYPE_FONT, is);
        } catch (FontFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        keys[0] = new OBJ_WinterKey(gp);
        keys[1] = new OBJ_SpringKey(gp);
        keys[2] = new OBJ_SummerKey(gp);
        keys[3] = new OBJ_AutumnKey(gp);
    }

    public void showMessage(String text) {

        message = text;
        messageOn = true;
    }

    public void draw(Graphics2D g2d) {

        this.g2d = g2d;

        // choose font
        g2d.setFont(maruMonica);
        // adding little bit textured on the text font
        g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        g2d.setColor(Color.white);

        // TITlE STATE
        if (gp.gameState == gp.titleState) {
            drawTitleScreen();
        }

        // PLAY STATE
        if (gp.gameState == gp.playState) {

//            playTime += (double)1 / 60;
//            g2d.drawString("Time: "+ dFormat.format(playTime), gp.tileSize*11, 65);

            if (messageOn == true) {
                g2d.setFont(g2d.getFont().deriveFont(28F));
                g2d.setColor(Color.black);
                g2d.drawString(message, getXforCenteredText(message), gp.tileSize * 11);

                messageCounter++;

                if (messageCounter > 120) {
                    messageCounter = 0;
                    messageOn = false;
                }
            }
        }

        // PAUSE STATE
        else if (gp.gameState == gp.pauseState) {
            drawPauseScreen();
        }

        // DIALOGUE STATE
        else if (gp.gameState == gp.dialogueState) {
            drawDialogueScreen();
            gp.player.spriteNum = 2;
        }

        // INVENTORY STATE
        else if (gp.gameState == gp.inventoryState) {
            drawInventory();
        }

        // FINISH STATE
        else if (gp.gameState == gp.finishState) {
            String text;
            int x, y;

            g2d.setFont(calibri);
            g2d.setFont(g2d.getFont().deriveFont(32F));
            g2d.setColor(Color.white);
            text = "You opened all gates!";
            x = getXforCenteredText(text);
            y = gp.screenHeight / 2 - (gp.tileSize * 3);
            g2d.drawString(text, x, y);

//            text = "Your time is : " + dFormat.format(playTime) + "!";
//            x = getXforCenteredText(text);
//            y = gp.screenHeight / 2 + (gp.tileSize * 4);
//            g2d.drawString(text, x, y);

            g2d.setFont(calibri);
            g2d.setFont(g2d.getFont().deriveFont(80F));
            g2d.setColor(Color.yellow);
            text = "Congratulations!";
            x = getXforCenteredText(text);
            y = gp.screenHeight / 2 + (gp.tileSize * 2);
            g2d.drawString(text, x, y);

            // stop the thread to stop the game
            gp.gameThread = null;
        }
    }

    public void drawTitleScreen() {

        if (titleScreenState == 0) {
            // Background
            g2d.setColor(new Color(235, 131, 52));
            g2d.fillRect(0, 0, gp.screenWidth, gp.screenHeight);

            // Title
            g2d.setFont(chaichle);
            g2d.setFont(g2d.getFont().deriveFont(Font.BOLD, 96F));
            String text = "Kenny.";
            int x = getXforCenteredText(text),
                    y = gp.tileSize * 3;

            // Shadow
            g2d.setColor(Color.BLACK);
            g2d.drawString(text, x + 5, y + 5);

            // Main Color
            g2d.setColor(Color.WHITE);
            g2d.drawString(text, x, y);

            // Kenny Image - bisa dikasih idle
            x = gp.screenWidth / 2 - gp.tileSize;
            y += gp.tileSize * 1;
            g2d.drawImage(gp.player.idleRight3, x, y, gp.tileSize * 2, gp.tileSize * 2, null);

            // Menu
            g2d.setFont(maruMonica);
            g2d.setFont(g2d.getFont().deriveFont(Font.BOLD, 48F));

            text = "NEW GAME";
            x = getXforCenteredText(text);
            y += gp.tileSize * 3.5;
            g2d.drawString(text, x, y);
            if (commandNum == 0) {
                g2d.drawString(">", x - gp.tileSize, y);
            }

            text = "LOAD GAME";
            x = getXforCenteredText(text);
            y += gp.tileSize;
            g2d.drawString(text, x, y);
            if (commandNum == 1) {
                g2d.drawString(">", x - gp.tileSize, y);
            }

            text = "EXIT";
            x = getXforCenteredText(text);
            y += gp.tileSize;
            g2d.drawString(text, x, y);
            if (commandNum == 2) {
                g2d.drawString(">", x - gp.tileSize, y);
            }
        } else if (titleScreenState == 1) {

            g2d.setColor(Color.WHITE);
            g2d.setFont(g2d.getFont().deriveFont(42F));

            String text = "Select your class!";
            int x = getXforCenteredText(text),
                    y = gp.tileSize * 3;
            g2d.drawString(text, x, y);

            text = "Fighter";
            x = getXforCenteredText(text);
            y += gp.tileSize * 3;
            g2d.drawString(text, x, y);
            if (commandNum == 0) {
                g2d.drawString(">", x - gp.tileSize, y);
            }

            text = "Thieft";
            x = getXforCenteredText(text);
            y += gp.tileSize;
            g2d.drawString(text, x, y);
            if (commandNum == 1) {
                g2d.drawString(">", x - gp.tileSize, y);
            }

            text = "Sorcerer";
            x = getXforCenteredText(text);
            y += gp.tileSize;
            g2d.drawString(text, x, y);
            if (commandNum == 2) {
                g2d.drawString(">", x - gp.tileSize, y);
            }

            text = "back";
            x = getXforCenteredText(text);
            y += gp.tileSize * 2;
            g2d.drawString(text, x, y);
            if (commandNum == 3) {
                g2d.drawString(">", x - gp.tileSize, y);
            }
        }

    }

    public void drawPauseScreen() {

        String text = "PAUSED";
        int x = getXforCenteredText(text),
                y = gp.screenHeight / 2;

        g2d.drawString(text, x, y);
    }

    public void drawDialogueScreen() {

        // WINDOW
        int x = gp.tileSize * 2,
                y = gp.tileSize * 7 + gp.tileSize / 2,
                width = gp.screenWidth - (gp.tileSize * 4),
                height = gp.tileSize * 4;

        drawSubWindow(x, y, width, height);

        x += gp.tileSize;
        y += gp.tileSize;
        g2d.setFont(g2d.getFont().deriveFont(Font.PLAIN, 32F));

        for (String line : currentDialogue.split("\n")) {
            g2d.drawString(line, x, y);
            y += 40;
        }
    }

    public void drawInventory() {

        // FRAME
        int frameX = gp.tileSize * 9,
                frameY = gp.tileSize,
                frameWidth = gp.tileSize * 6,
                frameHeight = gp.tileSize * 5;
        drawSubWindow(frameX, frameY, frameWidth, frameHeight);

        // SLOT
        final int slotXStart = frameX + 20,
                slotYStart = frameY + 20;
        int slotX = slotXStart,
                slotY = slotYStart,
                slotSize = gp.tileSize + 3;

        // DRAW PLAYER'S INVENTORY
        for (int i = 0; i < gp.player.inventory.size(); i++) {

            g2d.drawImage(gp.player.inventory.get(i).down1, slotX, slotY, null);
            slotX += slotSize;

            if (i == 4 || i == 9 || i == 14) {
                slotX = slotXStart;
                slotY += slotSize;
            }
        }

        // CURSOR
        int cursorX = slotXStart + (slotSize * slotCol),
                cursorY = slotYStart + (slotSize * slotRow),
                cursorWidth = gp.tileSize,
                cursorHeight = gp.tileSize;

        // DRAW CURSOR
        g2d.setColor(Color.WHITE);
        g2d.setStroke(new BasicStroke(3));
        g2d.drawRoundRect(cursorX, cursorY, cursorWidth, cursorHeight, 10, 10);

        // DESCRIPTION FRAME
        int dFrameX = frameX,
                dFrameY = frameY + frameHeight,
                dFrameWidth = frameWidth,
                dFrameHeight = gp.tileSize * 3;

        // DRAW DESC. TEXT
        int textX = dFrameX + 20,
            textY = dFrameY + gp.tileSize;
        
        g2d.setFont(g2d.getFont().deriveFont(28F));
        
        int itemIndex = getItemIndexOnSlot();
        
        if(itemIndex < gp.player.inventory.size()) {
            drawSubWindow(dFrameX, dFrameY, dFrameWidth, dFrameHeight);
            for(String line: gp.player.inventory.get(itemIndex).description.split("\n")) {
                g2d.drawString(line, textX, textY);
                textY += 32;
            }  
        }
    }
    
    public int getItemIndexOnSlot() {
        int itemIndex = slotCol + (slotRow * 5);
        return itemIndex;
    }

    private void drawSubWindow(int x, int y, int width, int height) {

        Color c = new Color(0, 0, 0, 210); // R, G, B, alphaValues (Opacity)
        g2d.setColor(c);
        g2d.fillRoundRect(x, y, width, height, 35, 35);

        c = new Color(255, 255, 255);
        g2d.setColor(c);
        g2d.setStroke(new BasicStroke(5));
        g2d.drawRoundRect(x + 5, y + 5, width - 10, height - 10, 25, 25);

    }

    // get textLength for centered position

    private int getXforCenteredText(String text) {

        int textLength = (int) g2d.getFontMetrics().getStringBounds(text, g2d).getWidth();
        return gp.screenWidth / 2 - textLength / 2;
    }
}
