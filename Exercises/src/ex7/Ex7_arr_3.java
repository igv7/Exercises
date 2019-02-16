package ex7;

import java.util.Random;

import java.util.ArrayList;

public class Ex7_arr_3 {

	public static void main(String[] args) {

		Random rnd = new Random();
		int[] arr3 = new int[10];
		ArrayList<Integer> dinArr = new ArrayList<>(1);
		System.out.print("The array is: ");
		for (int i = 0; i < arr3.length; i++) {
			arr3[i] = rnd.nextInt(11);
			System.out.print(arr3[i] + "(" + (i + 1) + ")" + " ");
		}

		boolean ass = false;

		System.out.println();
		System.out.print("the new array is ");
		for (int i = 0; i < arr3.length; i++) {
			for (int y = 0; y < dinArr.size(); y++) {
				if (dinArr.get(y) == arr3[i]) {
					ass = true;
				}
			}
			if (ass == false) {
				dinArr.add(arr3[i]);
			}
			ass = false;
		}
		for (int i = 0; i < dinArr.size(); i++) {
			System.out.print(dinArr.get(i) + " ");
		}
	}

}

// Random random = new Random();
// int arr[] = new int[10];
//
//
// for (int i = 0; i < arr.length; i++) {
// arr[i] = random.nextInt(11);
// System.out.print(arr[i] + " (" + i + ") ");
// }
// int count = 0;
//
// for (int i = 0; i < arr.length; i++) {
// for (int j = i; j < arr.length; j++) {
// if (arr[i] == arr[j]) {
// count++;
// break;
// }
//
// }
//
// }
//
// boolean b = false;
// int c = 0;
// int j = 0;
// int arr2[] = new int[arr.length - count];
// for (int i = 0; i < arr.length; i++) {
// for (int j = 0; j < arr2.length; j++) {
// if (arr2[j] == arr[i]) {
// b = true;
// }
// }
// if (b == false) {
// arr2[c] = arr[i];
// c++;
// }
// b = false;
//
// }
// for (int i = 0; i < arr2.length; i++) {
// System.out.println(arr2[i] + " ");
// }
//
// }
// }