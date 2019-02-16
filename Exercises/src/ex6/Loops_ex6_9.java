package ex6;

import java.util.Random;

public class Loops_ex6_9 {

	public static void main(String[] args) {
		
		Random random = new Random();
		int index = random.nextInt(51);
		System.out.println("The index of Fibonacci is "+index);
		System.out.println("Fibonacci set to index "+index+" is:");
		
		int f1 = 1;
		int f2 = 1;
		System.out.print(f1+" ");
		System.out.print(f2+" ");
		
		for (int i = 2; i <=index; i++) {
			f2=f2+f1;
			f1=f2-f1;
			System.out.print(f2+" ");
		}
		//System.out.println(f2);

	}

}
