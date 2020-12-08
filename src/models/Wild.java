package models;

import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Wild extends Animal {

	private String animalWild;

	public String getAnimalWild() {
		return animalWild;
	}

	public void setAnimalWild(String animalWild) {
		this.animalWild = animalWild;
	}

	public Wild(String name, String sound, String animalWild) {
		super(name, sound);
		this.animalWild = animalWild;
	}

	public Wild() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Wild(String name, String sound) {
	
	}

	@Override
	public String toString() {
		return "Wild [animalWild=" + animalWild + "]";
	}

}
