package ex7;

import java.util.Random;

public class Ex7_arr_3_2 {

	public static void main(String[] args) {

		int[] arr = new int[10];

		Random random = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(11);
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					arr[j] = 99;
				}
			}
		}

		int count = 0;
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] != 99) {
				count++;
			}
		}
		int[] arr2 = new int[count];
		int c = 0;
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] != 99) {
				arr2[c] = arr[j];
				c++;
			}

		}

		for (int k = 0; k < arr2.length; k++) {
			System.out.print(arr2[k] + " ");
		}

	}

}
