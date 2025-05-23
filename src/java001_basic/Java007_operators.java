package java001_basic;

public class Java007_operators {

	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		System.out.println(a / b); // 정수일때 / 는 몫을 구함
		System.out.println((double) a / b); // 3.3333333333333335
		System.out.println(a / (double) b); // 3.3333333333333335
		System.out.println((double) (a / b)); // 3.0

	}

}
