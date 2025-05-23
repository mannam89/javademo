package java005_method;
//[출력결과]
//입시총점: 135점
//입시결과: 불합격

public class Java063_method {
	public static void main(String[] args) {
		int toeic = 75;
		int it = 60;
		int sum = total(toeic, it);
		
		System.out.printf("입시총점:%d점\n", sum);
		System.out.printf("입시결과:%s\n", rs(sum));
	} // end main()
	public static int total(int toeic, int it) {
		// 두 매개변수의 합계를 리턴하는 메소드 구현
		int sum=toeic+it;
		return sum;
	}// end total()
	
	public static String rs(int tot) {
		//tot매개변수의 값이 150이상이면 "합격", 미만이면 "불합격" 리턴하는 메소드 구현
		if(tot>=150) {
			return "합격";
		}else {
			return "불합격";
		}
	
	} //end rs();
  
} // end class

