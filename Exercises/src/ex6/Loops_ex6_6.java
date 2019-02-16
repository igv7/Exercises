package ex6;

import java.util.Random;

public class Loops_ex6_6 {

	public static void main(String[] args) {

		Random random = new Random();
		int num = random.nextInt(100000);

		System.out.println(num);

		int newNum = 0;
		int num1 = num;
		
		
		for (int i = 0; i <= num; i++) {
			while (num1 > 10) {
				newNum = (newNum+num1 % 10) * 10;
				num1 /= 10;
				
					
				
			}
			
		}
		

	}

}
