package java002_statements;

//[문제]
//data변수에 저장된 값이 대문자이면 "대문자입니다.", 소문자이면 "소문자입니다."
//그외는 "기타입니다."로 출력하는 프로그램을 구현하세요.
//
//[출력결과]
//data='D'  =>  D는 대문자입니다.
//data='d'  =>  d는 소문자입니다.
//data='1'  =>  1는 기타입니다.

public class Java020_if {

	public static void main(String[] args) {
		char data = 'A';

		// 'A' >= data <= 'Z' (수학)
		// data >= 'A' && data <= 'Z' (프로그램)

		if (data >= 'A' && data <= 'Z') {
			System.out.println(data + "는 대문자입니다.");
		} else if (data >= 'a' && data <= 'z') {
			System.out.println(data + "는 소문자입니다.");
		} else {
			System.out.println(data + "는 기타입니다.");
		}

		if (Character.isUpperCase(data)) {
			System.out.println(data + "는 대문자입니다.");
		} else if (Character.isLowerCase(data)) {
			System.out.println(data + "는 소문자입니다.");
		} else {
			System.out.println(data + "는 기타입니다.");
		}
	}
}
