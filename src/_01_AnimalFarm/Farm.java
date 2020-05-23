package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm {

	public static void main(String[] args) {
		ArrayList<Animal> farm = new ArrayList<Animal>();
		Goat goat = new Goat();
		Chicken chicken = new Chicken();
		Cow cow = new Cow();
		Pig pig = new Pig();
		farm.add(goat);
		farm.add(chicken);
		farm.add(cow);
		farm.add(pig);
		for (int i = 0; i < farm.size(); i++) {
			goat.makeNoise();
			chicken.makeNoise();
			cow.makeNoise();
			pig.makeNoise();

			goat.legs();
			chicken.legs();
			cow.legs();
			pig.legs();
		}
	}
}
