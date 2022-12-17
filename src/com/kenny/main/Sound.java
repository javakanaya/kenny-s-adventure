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

        soundURL[0] = getClass().getResource("/sound/music/titleMusic.wav");
        
        soundURL[1] = getClass().getResource("/sound/sfx/switchTab.wav");
        soundURL[2] = getClass().getResource("/sound/sfx/selectTab.wav");
        
        soundURL[3] = getClass().getResource("/sound/sfx/openInventory.wav");
        soundURL[4] = getClass().getResource("/sound/sfx/closeInventory.wav");
        soundURL[5] = getClass().getResource("/sound/sfx/switchTabInventory.wav");
        
        soundURL[6] = getClass().getResource("/sound/sfx/pickupKeys.wav");
        soundURL[7] = getClass().getResource("/sound/sfx/useKeys.wav");
        
        soundURL[8] = getClass().getResource("/sound/sfx/icePillarOn.wav");
        soundURL[9] = getClass().getResource("/sound/sfx/wrongIcePillar.wav");
        
        soundURL[10] = getClass().getResource("/sound/sfx/breakIcePiles.wav");
    
        soundURL[11] = getClass().getResource("/sound/sfx/slime.wav");
    }
    

    // set file for the sound
    public void setFile(int i) {

        try {
            AudioInputStream ais = AudioSystem.getAudioInputStream(soundURL[i]);
            clip = AudioSystem.getClip();
            clip.open(ais);
        } catch (Exception e) {

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
