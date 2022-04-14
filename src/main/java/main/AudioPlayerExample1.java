package main;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * This is an example program that demonstrates how to play back an audio file
 * using the Clip in Java Sound API.
 *
 * @author www.codejava.net
 *
 */
public class AudioPlayerExample1 implements LineListener {

    /**
     * this flag indicates whether the playback completes or not.
     */
    boolean playCompleted;
    AudioInputStream audioStream;
    Clip audioClip;
    /**
     * Play a given audio file.
     *
     * @param audioFilePath Path of the audio file.
     */
    JLabel j;

    void setLabel(JLabel j1) {
        j = j1;

    }

    void play(String audioFilePath) {
      
       

        File audioFile = new File(audioFilePath);

        try {
            audioStream = AudioSystem.getAudioInputStream(audioFile);

            AudioFormat format = audioStream.getFormat();

            DataLine.Info info = new DataLine.Info(Clip.class, format);

            audioClip = (Clip) AudioSystem.getLine(info);

            audioClip.addLineListener(this);

            audioClip.open(audioStream);

            audioClip.start();

        } catch (UnsupportedAudioFileException ex) {
            System.out.println("The specified audio file is not supported.");
            ex.printStackTrace();
        } catch (LineUnavailableException ex) {
            System.out.println("Audio line for playing back is unavailable.");
            ex.printStackTrace();
        } catch (IOException ex) {
            System.out.println("Error playing the audio file.");
            ex.printStackTrace();
        }

    }
    String img;

    public void setImg(String img) {
        this.img = img;
    }

    /**
     * Listens to the START and STOP events of the audio line.
     */
    @Override
    public void update(LineEvent event) {
        LineEvent.Type type = event.getType();

        if (type == LineEvent.Type.START) {
            j.setIcon(new ImageIcon(img));
        } else if (type == LineEvent.Type.STOP) {
            playCompleted = true;
            audioClip.close();
            audioClip.drain();
            audioClip.flush();
            
        }

    }

}
