/*
  RMIT University Vietnam
  Course: INTE2512 Object-Oriented Programming
  Semester: 2019C
  Assessment: Assignment 2
  Author: Le Quang Hien
  ID: s3695516
  Created  date: 13/12/2019
  Last modified: 16/12/2019
  Acknowledgement:
*/

package controller;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;

//this class is created to control the media of the game
public class MediaController
{
    private static MediaPlayer mediaPlayer = null;

    //this method is to initialize the media of the game
    public static void initializeMedia()
    {
        String path = "src/audio/music.mp3";
        Media media = new Media(new File(path).toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
        mediaPlayer.setAutoPlay(true);
    }

    // this method is to pause the media
    public static void pause()
    {
        mediaPlayer.pause();
    }

    // this method is to stop the media
    public static void stop()
    {
        mediaPlayer.stop();
    }

    // this method is to play the media
    public static void play()
    {
        mediaPlayer.play();
    }

    // this method is to play the new media
    public static void playNewAudio(String path)
    {
        Media media = new Media(new File(path).toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }

    // this method is to check if the media is playing
    public static boolean isPlaying()
    {
        return mediaPlayer.getStatus() == MediaPlayer.Status.PLAYING;
    }
}
