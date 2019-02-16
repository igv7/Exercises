package ex6;

import java.util.Random;

public class Loops_ex6_5 {

	public static void main(String[] args) {
		
	    Random random = new Random();
		int num = random.nextInt(10000);
		
		System.out.println("The number is "+num);
		
		int numDig = 0;
		int fDig = num;
		int sumDig = 0;
		int oppDig = 0;
		int cnum = num;
		
		
		while (cnum>0) {
			cnum/=10;
			numDig++;
		}
		System.out.println("The number of digits is " +numDig);
		
		
		while (fDig>10) {
			fDig=fDig/10; 
		}
		System.out.println("The first left digit is "+fDig);
		
		cnum=num;
		while (cnum>0) {
			sumDig=sumDig+cnum%10;
			cnum/=10;
		}
		System.out.println("The sum of the namber's digits is "+sumDig);
		
		while (num>10) {
			oppDig=(oppDig+num%10)*10;
			num/=10;
		}
		System.out.println("The opposite order of the number's digits is "+(oppDig+num));
		


	}

}
