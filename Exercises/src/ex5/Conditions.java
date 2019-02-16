package ex5;

import java.util.Random;

public class Conditions {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int val1 = random.nextInt();
		int val2 = random.nextInt();
		
		System.out.println(val1);
		System.out.println(val2);
		
		int max = 0;
		
		if (val1 > val2) {
			max = val1;
		} else {
			max = val2;
		}
			System.out.println(max);

	}

}
