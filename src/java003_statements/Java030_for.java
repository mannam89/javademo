package java003_statements;

//1~10까지 짝수, 홀수 누적을 계산하는 프로그램
//
//[출력결과]
//홀수누적:25
//짝수누적:30
//

public class Java030_for {

	public static void main(String[] args) {
		int odd = 0;
		int even = 0;

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				odd = odd + i;
			} else {
				even = even + i;
			}

		}
		System.out.println("홀수누적:" + odd);
		System.out.println("짝수누적:" + even);

	}

}
