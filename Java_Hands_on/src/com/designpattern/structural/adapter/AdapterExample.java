package com.designpattern.structural.adapter;

public class AdapterExample {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new MediaPlayerAdapter(new AdvancedMediaPlayer());
        mediaPlayer.play("vlc", "song.vlc"); // Output: Playing VLC file: song.vlc
        mediaPlayer.play("mp4", "movie.mp4"); // Output: Playing MP4 file: movie.mp4
    }
}