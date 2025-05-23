package java004_array;

public class Java042_array {

	public static void main(String[] args) {
		int[] num = new int[] { 22, 3, 8, 12 };
		int odd = 0; // 홀수 누적
		int even = 0; // 짝수 누적

//		even += num[0];
//		odd += num[1];
//		even += num[2];
//		even += num[3];

		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 != 0) {
				odd += num[i];
			} else {
				even += num[i];
			}
		}

		System.out.printf("홀수:%d\n", odd);
		System.out.printf("짝수:%d\n", even);
	}

}
