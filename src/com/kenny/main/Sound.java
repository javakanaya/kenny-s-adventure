package com.kenny.main;

import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Sound {

	Clip clip;
	URL soundURL[] = new URL[30];
	
	// sound class constructor
	public Sound() {
		
		soundURL[0] = getClass().getResource("/sound/main.wav");
	}
	
	// set file for the sound
	public void setFile(int i) {
		
		try {
			AudioInputStream ais = AudioSystem.getAudioInputStream(soundURL[i]);
			clip = AudioSystem.getClip();
			clip.open(ais);
		}
		catch(Exception e){
			
		}
	}
	
	// play method
	public void play() {
		clip.start();
	}
	
	// loop method
	public void loop() {
		clip.loop(Clip.LOOP_CONTINUOUSLY);
	}
	
	// stop sound method
	public void stop() {
		clip.stop();
	}
}
