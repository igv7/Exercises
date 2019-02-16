package ex7;

import java.util.Random;

public class Ex7_arr_1 {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		int num;
		int sum=0;
		float avg=0f;
		
		Random random = new Random();
		
		
		for (int i = 0; i <10; i++) {
			num = random.nextInt(100);
			arr[i]=num;
			System.out.println("The index is "+i + " and the value is "+arr[i]);
			sum=sum+arr[i];
			avg=sum/10f;
		}
		System.out.println("The sum is "+sum);
		System.out.println("The average is "+avg);

		

	}

}
