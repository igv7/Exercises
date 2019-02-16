package ex5;

import java.util.Random;

public class Conditions3 {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int val = random.nextInt(100);
		System.out.println(val);
		
		if (val <= 50) {
			System.out.println("Small !");
		} else {
			System.out.println("Big !");
		}
			
			
		if (val % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
			
		

	}

}
