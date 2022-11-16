/*
 *  subclass of JPanel, with extra function 
 *  Thread implements from Runnable interface
 */

package com.kenny.main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

import com.kenny.entity.Player;
import com.kenny.object.gatekey.SuperObject;
import com.kenny.object.tree.Tree;
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
	public final int maxWorldCol = 50;
	public final int maxWorldRow = 50;
	
	// SYSTEM
	private final int fps = 60;
	// add keyHandler
	KeyHandler keyH = new KeyHandler(this);
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
    // keeps the program running until users stop it
    Thread gameThread;
	
    // ENTITY - OBJECT
	// instantiate player
    public Player player = new Player(this, keyH);
	// instantiate SuperObject Array as Slots for Objects
	public SuperObject obj[] = new SuperObject[10];
	public Tree tree[] = new Tree[6];
	
	// GAME STATE
	public int gameState;
	public final int playState = 1;
	public final int pauseState = 2;
    public final int finishState = 3;

	public GamePanel() {
		// set size of this GamePanel
		this.setPreferredSize(new Dimension(screenWidth, screenHeight));
		
		// add background color
		this.setBackground(Color.black);
		
		// improve game's rendering performance
		// all the drawing from his component will be done in an off-screen painting buffer
		/* 
		 * drawing graphics into an off-screen image buffer and then copying the contents 
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
		
		// play music
		playMusic(0);
		
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
		double drawInterval = 1000/(double)fps;
		double delta = 0;
		long lastTime = System.currentTimeMillis();
		long currentTime;
		long timer = 0;
		int drawCount = 0;
		
		// as long as the gameThread exist
		while(gameThread != null) {
			// to get the suitable FPS, 
			// long currTime = System.nanoTime();
			// System.out.println("Current Time:" + currTime);
			
			// pause the gameThread for a while
			currentTime = System.currentTimeMillis();
			
			delta += (currentTime - lastTime) / drawInterval;
			timer += (currentTime - lastTime);
			lastTime = currentTime;
			
			if(delta >= 1) {
				// 1. UPDATE: update information such as character information
				update();
				// 2. DRAW  : draw the screen with updated information  
				repaint();
				
				delta--;
				drawCount++;
			}
			
			 // display FPS
			if(timer >= 1000) {
				// System.out.println("The game loop is running");
				// System.out.println("FPS: "+ drawCount);
				drawCount = 0;
				timer = 0;
			}

		}
	}
	
	public void update() {
	    if(gameState == playState) {
	        player.update();	        
	    }
	    if(gameState == pauseState) {
	        //nothing, not update player information
	    }
	}
	
	// Standard method to draw on JPanel
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		
		// DEBUG
//		long drawStart = 0;
//		drawStart = System.nanoTime();
		
		// draw background first, and then the player
		// 1. Background/tile
		tileM.draw(g2d);
		
		// 2. Player
		player.draw(g2d);
		
		// 3. Object
		for(int i = 0; i < obj.length; i++) {
			// check slots are empty or not, avoid NullPointer error
			if(obj[i] != null)
				obj[i].draw(g2d, this);
		}
		
		for(int i = 0; i < tree.length; i++) {
			// check slots are empty or not, avoid NullPointer error
			if(tree[i] != null)
				tree[i].draw(g2d, this);
		}
		
		// 4.UI
		ui.draw(g2d);
		
//		long drawEnd = System.nanoTime();
//		long passed = drawEnd - drawStart;
//		g2d.setColor(Color.white);
//		g2d.drawString("Draw Time: " + passed, 10, 400);
//		System.out.println("Draw Time: " + passed);
		
		// dispose (membuang) this graphics context and release any system resources that using it
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
