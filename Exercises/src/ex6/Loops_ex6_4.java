package ex6;

import java.util.Random;

public class Loops_ex6_4 {

	public static void main(String[] args) {
		
		Random random = new Random();
				int tmp=0;
				int max=0;
				int den=0;
		boolean status= false;
		while(status!=true) {
		 max = random.nextInt(100);
		 den = random.nextInt(100);
		if(den != 0 && max !=0)
			status=true;
		}
		if (den>max) {
			tmp=den;
			den=max;
			max=tmp;
		}
		
		System.out.println(max);
		System.out.println(den);
		
		if (den==0) {
			System.out.println("Can't divide by zero!");
			max=random.nextInt(10);
			den=random.nextInt(10);
		}
		
		for (int i = 1; i <= max; i++) {
			if (i%den==0) {
				System.out.print(i + ", ");
			}
		}

	}

}
