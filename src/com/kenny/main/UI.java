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

import javax.imageio.ImageIO;

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
    int counter = 0, tImage = 1;
    public BufferedImage tutorial1, tutorial2,
            tutorial3, tutorial4,
            kennyTS, TS1, TS2;

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

        getImage();
    }

    public BufferedImage setup(String imagePath) {

        UtilityTool uTool = new UtilityTool();
        BufferedImage image = null;

        try {
            image = ImageIO.read(getClass().getResourceAsStream(imagePath + ".png"));
            image = uTool.scaleImage(image, gp.tileSize * 16, gp.tileSize * 12);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return image;
    }

    public void getImage() {
        tutorial1 = setup("/tutorial/t1");
        tutorial2 = setup("/tutorial/t2");
        tutorial3 = setup("/tutorial/t3");
        tutorial4 = setup("/tutorial/t4");
        kennyTS = setup("/title/kenny_ts");
        TS1 = setup("/title/TS1");
        TS2 = setup("/title/TS2");
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

        counter++;

        if (titleScreenState == 0) {
            // Background
            g2d.setColor(new Color(250, 237, 205));
            g2d.fillRect(0, 0, gp.screenWidth, gp.screenHeight);

            // TITLE
            if (tImage == 1)
                g2d.drawImage(TS1, 0, 0, null);
            else if (tImage == 2)
                g2d.drawImage(TS2, 0, 0, null);
            if (counter > 50) {
                if (tImage >= 2)
                    tImage = 1;
                else
                    tImage++;
                counter = 0;
            }

            // MENU
            g2d.setColor(Color.BLACK);
            g2d.setFont(maruMonica);
            g2d.setFont(g2d.getFont().deriveFont(Font.PLAIN, 48F));

            String text = "NEW GAME";
            int x = getXforCenteredText(text),
                    y = gp.tileSize * 8;
            x = getXforCenteredText(text);
            g2d.drawString(text, x, y);
            if (commandNum == 0) {
                g2d.drawString(">", x - gp.tileSize, y);
            }

            text = "HIGH SCORE";
            x = getXforCenteredText(text);
            y += gp.tileSize * 1.2;
            g2d.drawString(text, x, y);
            if (commandNum == 1) {
                g2d.drawString(">", x - gp.tileSize, y);
            }

            text = "EXIT";
            x = getXforCenteredText(text);
            y += gp.tileSize * 1.2;
            g2d.drawString(text, x, y);
            if (commandNum == 2) {
                g2d.drawString(">", x - gp.tileSize, y);
            }

        } else if (titleScreenState == 1) {

            if (tImage == 1)
                g2d.drawImage(tutorial1, 0, 0, null);
            else if (tImage == 2)
                g2d.drawImage(tutorial2, 0, 0, null);
            else if (tImage == 3)
                g2d.drawImage(tutorial3, 0, 0, null);
            else if (tImage == 4)
                g2d.drawImage(tutorial4, 0, 0, null);

            if (counter > 25) {
                if (tImage >= 4)
                    tImage = 1;
                else
                    tImage++;
                counter = 0;
            }
        }
    }

    public void drawPauseScreen() {

        Color c = new Color(0, 0, 0, 210); // R, G, B, alphaValues (Opacity)
        g2d.setColor(c);
        g2d.fillRect(0, 0, gp.screenWidth, gp.screenWidth);
        
        g2d.setColor(Color.WHITE);
        g2d.setFont(maruMonica);
        g2d.setFont(g2d.getFont().deriveFont(Font.PLAIN, 64));
        String text = "GAME PAUSED";
        int x = getXforCenteredText(text),
                y = gp.screenHeight / 2;
        g2d.drawString(text, x, y);

        g2d.setFont(g2d.getFont().deriveFont(Font.PLAIN, 48));
        text = "RESUME";
        x = getXforCenteredText(text);
        y += gp.tileSize * 1.2;
        g2d.drawString(text, x, y);
        if (commandNum == 0) {
            g2d.drawString(">", x - gp.tileSize, y);
        }

        text = "EXIT TO MAIN MENU";
        x = getXforCenteredText(text);
        y += gp.tileSize * 1.2;
        g2d.drawString(text, x, y);
        if (commandNum == 1) {
            g2d.drawString(">", x - gp.tileSize, y);
        }
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

        if (itemIndex < gp.player.inventory.size()) {
            drawSubWindow(dFrameX, dFrameY, dFrameWidth, dFrameHeight);
            for (String line : gp.player.inventory.get(itemIndex).description.split("\n")) {
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
