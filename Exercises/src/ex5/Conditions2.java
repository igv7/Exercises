package ex5;

import java.util.Random;

public class Conditions2 {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int val = random.nextInt(100);
		System.out.println(val);
		
		if (val > 50) {
			System.out.println("Big !");
		} else if (val < 50) {
			System.out.println("Small !");
		} else {
			System.out.println("Bingo !");
		}

	}

}
