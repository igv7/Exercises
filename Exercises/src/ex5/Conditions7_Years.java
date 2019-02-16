package ex5;

import java.util.Random;

public class Conditions7_Years {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int year = random.nextInt(2050);
		System.out.println("Year is " +year);
		
		if ((year %4 == 0) && (year %100 != 0) || (year %100 == 0) && (year %400 == 0)) {
			System.out.println("The Year is leap");
		} else {
			System.out.println("The Year is not leap");
		}
			
		}

	}


