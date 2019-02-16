package ex6;

import java.util.Random;

public class Loops_ex6_8 {

	public static void main(String[] args) {
		
		Random random = new Random();
		int index = random.nextInt(51);
		//int index=3;
		System.out.println("The index of Fibonacci is "+index);
		
		int f1 = 1;
		int f2 = 1;
		
		for (int i = 2; i <=index; i++) {
			f2=f2+f1;
			f1=f2-f1;
		}
		System.out.println("The number of index is "+f2);

	}

}
