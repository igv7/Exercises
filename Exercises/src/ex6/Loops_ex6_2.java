package ex6;

import java.util.Random;

public class Loops_ex6_2 {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int val1 = random.nextInt(20);
		int val2 = random.nextInt(20);
		int min;
		int max;
		
		if (val1<val2) {
			min = val1;
			max = val2;
		} else if (val1==val2) {
			min = random.nextInt(20);
			max = random.nextInt(20);
		} else {
			min = val2;
			max = val1;
		}
		System.out.println("The first number is "+min);
		System.out.println("The second number is "+max);
		
		for (int i = min; i <= max; i++) {
			System.out.print(i + ", ");
		}

	}

}
