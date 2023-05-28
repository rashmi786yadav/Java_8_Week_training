package com.designpattern.structural.adapter;

import com.week5.streamapi.SecondMinimum;

import java.util.logging.Level;
import java.util.logging.Logger;

// Target interface
interface MediaPlayer {
    void play(String audioType, String fileName);
}

// Adaptee class
class AdvancedMediaPlayer {
    Logger logger = Logger.getLogger(AdvancedMediaPlayer.class.getName());
    public void playVlc(String fileName) {
        logger.log(Level.INFO,"Playing VLC file: " + fileName);
    }

    public void playMp4(String fileName) {
       logger.log(Level.INFO,"Playing MP4 file: " + fileName);
    }
}

// Adapter class
class MediaPlayerAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaPlayerAdapter(AdvancedMediaPlayer advancedMediaPlayer) {
        this.advancedMediaPlayer = advancedMediaPlayer;
    }

    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}

