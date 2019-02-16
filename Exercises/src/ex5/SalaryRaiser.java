package ex5;

import java.util.Random;

public class SalaryRaiser {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int salary = random.nextInt(1000);
		salary = salary + 5000;
		System.out.println("Salary is " + salary);
		
		if (salary * 1.1 <= 6000) {
			System.out.println("New salary is " + salary * 1.1f);
		}
		
		
	}

}
