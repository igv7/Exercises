package ex6;

import java.util.Random;

public class Loops_ex6_7 {

	public static void main(String[] args) {
		
		Random random = new Random();
		int num = random.nextInt(10);
		
		System.out.println("The number is "+ num);
		
		int sum=1;
		
		for (int i = 2; i <=num; i++) {
			sum*=i;
		}
		System.out.println("The factorial value of number "+num+ " is "+sum);

	}

}
