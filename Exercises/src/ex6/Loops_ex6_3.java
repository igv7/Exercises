package ex6;

import java.util.Random;

public class Loops_ex6_3 {

	public static void main(String[] args) {
		
		Random random = new Random();
		int num = random.nextInt(50);
		
		System.out.println("The number is "+num);
		
		for (int i = 0; i <= num; i++) {
			if (i %2 == 0) {
				System.out.print(i+", ");
			}
			
		}

	}

}
