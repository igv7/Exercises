package ex5;

import java.util.Random;

public class TaxCalculator {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int salary = random.nextInt(200000);
		System.out.println("Your Gross Salary is " +salary);
		
		if (salary > 0 && salary == 23000) {
			salary /= 1.1;
		} else if (salary > 23000 && salary == 50000) {
			salary /= 1.2;	
		} else if (salary > 50000 && salary == 100000) {
			salary /= 1.3;
		} else {
			salary /= 1.4;
		}
		System.out.println("Your Net Salary is " +salary);

	}

}
