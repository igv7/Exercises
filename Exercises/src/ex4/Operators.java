package ex4;

import java.util.Random;

public class Operators {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int a = random.nextInt(100);
		int b = random.nextInt(100);
		
		System.out.println("a is " + a);
		System.out.println("b is " + b);
		System.out.println("sum is " + (a+b));
		
		float c = (a+b)/2f;
		System.out.println("avg is " + c);
		
		System.out.println("remainder of a is " + a%10);
		System.out.println("remainder of b is " + b%10);
		System.out.println("area of rectangle is " + a*b);
		System.out.println("perimeter of rectangle is " + (a+b)*2);
		

	}

}
