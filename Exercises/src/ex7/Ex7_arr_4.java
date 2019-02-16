package ex7;

import java.util.Random;

public class Ex7_arr_4 {

	public static void main(String[] args) {

		int arr[] = new int[10];
		int arr2[] = new int[10];

		Random random = new Random();

		for (int i = 0; i < arr2.length; i++) {
			arr[i] = random.nextInt(11);
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		int index = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			arr2[index] = arr[i];
			System.out.print(arr2[index] + " ");
		}
	}

}

// int arr1 [] = new int [10];
// int arr2 [] = new int [10];
//
// Random random = new Random();
//
// for (int i = 0; i < arr1.length; i++) {
// arr1[i] = random.nextInt(11);
// System.out.print(arr1[i]+ " ");
// }
//
// System.out.println();
//
// int index = 0;
//
// for (int j = arr1.length-1; j >= 0 ; j--) {
// arr2[index] = arr1[j];
// System.out.print(arr2[index]+ " ");
// index++;
// }
//
// }
//
