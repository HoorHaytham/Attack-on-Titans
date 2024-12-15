package game.gui;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;


	public class AudioManager {
	    private static MediaPlayer backgroundMediaPlayer;
	    private static MediaPlayer soundEffectMediaPlayer;

	    public static void playBackgroundMusic(String audioFilePath) {
	        if (backgroundMediaPlayer == null) {
	            Media sound = new Media(AudioManager.class.getResource(audioFilePath).toString());
	            backgroundMediaPlayer = new MediaPlayer(sound);
	            backgroundMediaPlayer.setCycleCount(MediaPlayer.INDEFINITE); // Loop the music
	        }
	        backgroundMediaPlayer.play();
	    }

	    public static void stopBackgroundMusic() {
	        if (backgroundMediaPlayer != null) {
	            backgroundMediaPlayer.stop();
	        }
	    }

	    public static void playSoundEffect(String audioFilePath) {
	        // Stop any currently playing sound effect
	        if (soundEffectMediaPlayer != null) {
	            soundEffectMediaPlayer.stop();
	        }

	        // Initialize and play the new sound effect
	        Media sound = new Media(AudioManager.class.getResource(audioFilePath).toString());
	        soundEffectMediaPlayer = new MediaPlayer(sound);
	        soundEffectMediaPlayer.play();
	    }
	}

	

