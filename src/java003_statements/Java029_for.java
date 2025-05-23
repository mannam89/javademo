package java003_statements;

// sum = 55
public class Java029_for {

	public static void main(String[] args) {
		// 1~10까지 합계를 구하는 프로그램 구현

		int sum = 0;
		for (int num = 1; num <= 10; num++) {
			sum = sum + num;
		}
		System.out.printf("sum = %d",sum);
	}
	
}
