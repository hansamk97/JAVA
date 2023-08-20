package test_java;

import test_java.Dice;

public class Dice {
	
	private static Dice current;

	public static Dice getInstance() {
		if (current == null) {
			current = new Dice();
		}
		return current;
	}
	
	public void random(int min, int max) {
		int eye1 = (int) ((Math.random() * (max - min + 1)) + min);
		int eye2 = (int) ((Math.random() * (max - min + 1)) + min);
	
	while(true) {
		if( (eye1 + eye2) != 5  ) {
			continue;
		}
		else {
			break;
		}
	}

	}
}
