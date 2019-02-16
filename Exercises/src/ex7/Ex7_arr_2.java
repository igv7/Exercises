package ex7;

import java.util.Random;

public class Ex7_arr_2 {

	public static void main(String[] args) {
		
		int[] arr = new int[50];
		int num;
		int max=0;
		int maxI=0;
		
		Random random = new Random();
		
		for (int i = 0; i < arr.length; i++) {
			num = random.nextInt(100);
			arr[i]=num;
			System.out.println("The index is "+i + " and the value is "+arr[i]);
		
				if (arr[i]>max) {
					max=arr[i];
					maxI=i;
				}
				
		}
		System.out.println("The highest value is "+max + " and its index in the array is "+maxI);
		

	}

}
