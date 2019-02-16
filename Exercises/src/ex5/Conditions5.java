package ex5;

import java.util.Random;

public class Conditions5 {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int num1 = random.nextInt(10);
		int num2 = random.nextInt(10);
		int num3 = random.nextInt(10);
		
		System.out.println("Number 1 is " + num1);
		System.out.println("Number 2 is " + num2);
		System.out.println("Number 3 is " + num3);
		
		int max = 0;
		
		if (num1 > num2 && num1 > num3) {
			max = num1;
		} else if (num2 > num1 && num2 > num3) {
			max = num2;
		} else {
			max = num3;
		}
		System.out.println("The bigger number is " + max);

	}

}
