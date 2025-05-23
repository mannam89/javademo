package java001_basic;

public class Java002_comment {
	
	public static void main(String[] args) {
		// 한 라인 주석
		int a = 2; // 변수 선언
		/*
		 * 여러라인 주석처리
		 * Ctrl + Shift + /
		 * Ctrl + Shift + \
		 * Ctrl + Spacebar
		 */
		
		System.out.println(a);
		process();
	} //end main()
	
	public static void process() {
		System.out.println("process method");
	}
} //end class

