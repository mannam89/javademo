package java013_api;

import java.util.Arrays;
import java.util.Random;

public class Java144_Random {
	public static void main(String[] args) {
		int[] num = new int[5];

		Random ran = new Random();
		for (int i = 0; i < num.length; i++) {
//			num[i] = ((int) Math.floor(Math.random() * 100) + 1) % 45 + 1;
			num[i] = ran.nextInt(10)+1;

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
