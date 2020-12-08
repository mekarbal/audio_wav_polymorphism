package models;

public class Fliying extends Animal{
	


	private String animalFly;

	public Fliying(String name, String sound, String animalFly) {
		super(name, sound);
		this.animalFly = animalFly;
	}

	public Fliying() {
	}

	public String getAnimalFly() {
		return animalFly;
	}

	public void setAnimalFly(String animalFly) {
		this.animalFly = animalFly;
	}
	

		@Override
	public String toString() {
		return "Fliying [animalFly=" + animalFly + "]";
	}

}
