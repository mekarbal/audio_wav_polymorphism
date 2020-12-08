package models;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Animal {

	private String name;
	private String sound;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	public Animal(String name, String sound) {
		super();
		this.name = name;
		this.sound = sound;
	}

	public Animal() {
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", sound=" + sound + "]";
	}

	public void ReadSound(String effectSource)
			throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		AudioInputStream audioIn = AudioSystem.getAudioInputStream(new File(effectSource));
		Clip clip = AudioSystem.getClip();
		clip.open(audioIn);
		clip.start();
		System.out.println(effectSource + " sound is start ! ");
		System.out.println("s : " + clip.isActive());
		while (clip.isActive()) {
			 //System.out.println("hola "+effectSource);
		}
		clip.close();
		System.out.println(effectSource + " sound is end ! ");
	}

}
