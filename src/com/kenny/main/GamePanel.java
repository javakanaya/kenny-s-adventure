/*
 *  subclass of JPanel, with extra function 
 *  Thread implements from Runnable interface
 */

package com.kenny.main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.JPanel;

import com.kenny.entity.Entity;
import com.kenny.entity.Player;
import com.kenny.tile.TileManager;

public class GamePanel extends JPanel implements Runnable {

    // Screen Settings
    private final int originalTileSize = 16; // 16x16 Tile
    public final int scale = 3;
    public final int tileSize = originalTileSize * scale; // 48x48 Tile

    // 4 : 3 screen
    public final int maxScreenCol = 16;
    public final int maxScreenRow = 12;
    public final int screenWidth = tileSize * maxScreenCol; // 768 pixels
    public final int screenHeight = tileSize * maxScreenRow; // 576 pixels

    // World Map Settings
    public final int maxWorldCol = 100;
    public final int maxWorldRow = 100;

    // SYSTEM
    private final int fps = 60;
    // add keyHandler
    public KeyHandler keyH = new KeyHandler(this);
    // instantiate tile manager
    TileManager tileM = new TileManager(this);
    // Instantiate collision checker
    public CollisionChecker cCheker = new CollisionChecker(this);
    // instantiate AssetSetter
    public AssetSetter aSetter = new AssetSetter(this);
    // instantiate sound (music and sound sfx)
    Sound music = new Sound();
    Sound sfx = new Sound();
    // instantiate UI
    public UI ui = new UI(this);
    // instantiate event Handler
    public EventHandler eHandler = new EventHandler(this);
    // keeps the program running until users stop it
    Thread gameThread;

    // ENTITY - OBJECT
    // instantiate player
    public Player player = new Player(this, keyH);
    // instantiate SuperObject Array as Slots for Objects
    public Entity tree[] = new Entity[25];
    public Entity obj[] = new Entity[100];
    public Entity npc[] = new Entity[10];

    // ArrayList of Entity
    ArrayList<Entity> entityList = new ArrayList<>();

    // GAME STATE
    public int gameState;
    public final int titleState = 0;
    public final int playState = 1;
    public final int pauseState = 2;
    public final int dialogueState = 3;
    public final int inventoryState = 4;
    public final int finishState = 5;

    public GamePanel() {
        // set size of this GamePanel
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));

        // add background color
        this.setBackground(Color.black);

        // improve game's rendering performance
        // all the drawing from his component will be done in an off-screen painting
        // buffer
        /*
         * drawing graphics into an off-screen image buffer and then copying the
         * contents
         * of the buffer to the screen all at once
         */
        this.setDoubleBuffered(true);

        // add keyHandler to GamePanel
        this.addKeyListener(keyH);

        // the GamePanel can be "focused" to receive key input.
        this.setFocusable(true);
    }

    // setup for Game
    public void setupGame() {
        // set object
        aSetter.setObject();
        aSetter.setNPC();

        // play music
        // playMusic(0);

        // initiate gameState
        gameState = playState;
    }

    public void startGameThread() {
        // gamePanel class is passing to Thread constructor
        gameThread = new Thread(this);

        // lets start this thread
        gameThread.start();
    }

    // when we start the gameThread, its calls this run() method
    @Override
    public void run() {
        // GAME LOOP

        // loop interval, so it doesn't loop too fast
        double drawInterval = 1000 / (double) fps;
        double delta = 0;
        long lastTime = System.currentTimeMillis();
        long currentTime;
        long timer = 0;
        int drawCount = 0;

        // as long as the gameThread exist
        while (gameThread != null) {
            // to get the suitable FPS,
            // long currTime = System.nanoTime();
            // System.out.println("Current Time:" + currTime);

            // pause the gameThread for a while
            currentTime = System.currentTimeMillis();

            delta += (currentTime - lastTime) / drawInterval;
            timer += (currentTime - lastTime);
            lastTime = currentTime;

            if (delta >= 1) {
                // 1. UPDATE: update information such as character information
                update();
                // 2. DRAW : draw the screen with updated information
                repaint();

                delta--;
                drawCount++;
            }

            // display FPS
            if (timer >= 1000) {
                // System.out.println("The game loop is running");
                // System.out.println("FPS: "+ drawCount);
                drawCount = 0;
                timer = 0;
            }

        }
    }

    public void update() {
        if (gameState == playState) {
            // PLAYER
            player.update();
            // NPC
            for (int i = 0; i < npc.length; i++) {
                // check slots are empty or not, avoid NullPointer error
                if (npc[i] != null)
                    npc[i].update();
            }

        }
        if (gameState == pauseState) {
            // nothing, not update player information
        }
    }

    // Standard method to draw on JPanel
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // DEBUG
//		long drawStart = 0;
//		drawStart = System.nanoTime();

        // TITLE SCREEN
        if (gameState == titleState) {
            ui.draw(g2d);
        }

        // GAME SCREEN
        else {
            // draw background first, and then the player
            // TILE
            tileM.draw(g2d);

            // ADD ENTITIES TO THE LIST
            entityList.add(player);

            for (int i = 0; i < npc.length; i++) {
                if (npc[i] != null) {
                    entityList.add(npc[i]);
                }
            }

            for (int i = 0; i < obj.length; i++) {
                if (obj[i] != null) {
                    entityList.add(obj[i]);
                }
            }

            for (int i = 0; i < tree.length; i++) {
                if (tree[i] != null) {
                    entityList.add(tree[i]);
                }
            }

            // SORT entityList (By WordlY)
            Collections.sort(entityList, new Comparator<Entity>() {

                @Override
                public int compare(Entity e1, Entity e2) {
                    return Integer.compare(e1.worldY, e2.worldY);
                }
            });
            
            // DRAW ENTITIES
            for (int i = 0; i < entityList.size(); i++) {
                entityList.get(i).draw(g2d);
            }
            
            // EMPTY ENTITYLIST
            entityList.clear();

            // UI
            ui.draw(g2d);
        }

//		long drawEnd = System.nanoTime();
//		long passed = drawEnd - drawStart;
//		g2d.setColor(Color.white);
//		g2d.drawString("Draw Time: " + passed, 10, 400);
//		System.out.println("Draw Time: " + passed);

        // dispose (membuang) this graphics context and release any system resources
        // that using it
        // to save memory
        g2d.dispose();
    }

    public void playMusic(int i) {

        music.setFile(i);
        music.play();
        music.loop();
    }

    public void stopMusic() {
        music.stop();
    }

    public void playSfx(int i) {
        sfx.setFile(i);
        sfx.play();
    }
}
