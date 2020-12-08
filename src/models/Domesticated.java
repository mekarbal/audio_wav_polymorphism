package models;

public class Domesticated extends Animal{

	private String animalDom;

	public Domesticated(String name, String sound, String animalDom) {
		super(name, sound);
		this.animalDom = animalDom;
	}

	public String getAnimalDom() {
		return animalDom;
	}

	public void setAnimalDom(String animalDom) {
		this.animalDom = animalDom;
	}

	@Override
	public String toString() {
		return "Domesticated [animalDom=" + animalDom + "]";
	}

	public Domesticated() {
	}

	
	
}
