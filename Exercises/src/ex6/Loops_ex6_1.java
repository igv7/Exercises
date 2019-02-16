package ex6;

import java.util.Random;

public class Loops_ex6_1 {

	public static void main(String[] args) {
		
		Random random = new Random();
		int num = random.nextInt(10);
		System.out.println("The number is "+num);
		
		for (int i = 1; i <= num; i++) {
			System.out.print(i + ", ");
		} 

	}

}
