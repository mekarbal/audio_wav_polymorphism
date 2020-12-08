package app;

import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import models.Giraffe;

public class Test {

	public static void main(String[] args) {
		Giraffe g = new Giraffe();
		
		try {
			g.ReadSound("D:\\Animals\\src\\lemur4.wav");
		} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
			e.printStackTrace();
		}

	}

}