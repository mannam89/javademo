package java013_api;

import java.util.Arrays;

public class Java139_Math {
	public static void main(String[] args) {
		int[] num = new int[5];

		for (int i = 0; i < num.length; i++) {
			num[i] = ((int) Math.floor(Math.random() * 100) + 1) % 45 + 1;

			for (int j = 0; j < i; j++) {
				if (num[j] == num[i]) {
					i--;
					break;
				}

			}
		}

		for (int data : num) {
			System.out.printf("%4d", data);
			
		}
		System.out.println();

		Arrays.sort(num);
		for (int data1 : num) {
			System.out.printf("%4d", data1);
		}
	}

}
