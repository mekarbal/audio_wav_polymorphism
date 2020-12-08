package models;

import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Giraffe extends Wild{

	private String giraffeSound;

	public Giraffe(String name, String sound, String animalWild, String giraffeSound) {
		super(name, sound, animalWild);
		this.giraffeSound = giraffeSound;
	}

	public Giraffe() {
	}

	public String getGiraffeSound() {
		return giraffeSound;
	}

	public void setGiraffeSound(String giraffeSound) {
		this.giraffeSound = giraffeSound;
	}

	@Override
	public String toString() {
		return "Giraffe [giraffeSound=" + giraffeSound + "]";
	}
	
	
	@Override
	public void ReadSound(String giraffeSound)
			throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		super.ReadSound(giraffeSound);
		
	}
	
}
