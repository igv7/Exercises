package ex7;

import java.util.Random;

public class Ex7_arr_5 {

	public static void main(String[] args) {
		
		int arr [][] = new int [20][10];
		Random random = new Random();
		int sum = 0;
		int totalSum = 0;
		
		for (int i = 0; i < 20; i++) {
			sum=0;
			for (int j = 0; j < 10; j++) {
				arr[i][j] = random.nextInt(101);
				System.out.print(arr[i][j]+ " ");
				sum+=arr[i][j];	
				
			}
			
			System.out.println();
			System.out.println("The avg grade is "+sum/10.0);
			totalSum+=sum/200.0;
			System.out.println();
		}
		System.out.println("The avg class grade is "+totalSum);
	}

}
