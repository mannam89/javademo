package java001_basic;

/*
*  리터널(literal) : 그 자체의 값(1, 2, 3, ..., 'a','b','c'..., true, false)
 * 변수 (variable) : 하나의 값을 저장하기 위한 메모리 공간
   예약어(keyword) :  https://docs.oracle.com/javase/tutorial/java/nutsandbolts/_keywords.html
   식별자(identifier) : 프로그램에서 사용자가 정의한 이름을 '식별자(identifier)'라고 한다.
   변수의 명명규칙
     1) 대소문자가 구분되며 길이에 제한이 없다.
	 2) 예약어를 사용할 수 없다.
	 3) 숫자로 시작할 수 없다.
	 4) 특수문자는 '_', '$'만을 허용한다.
	 5) 클래스는 파스칼(pascal) 표기법, 변수와 메소드는 카멜(camel) 표기법을 사용한다.
	     ex) 파스칼(pascal) 표기법 : HelloWorld,   카멜(camel) 표기법 : helloWorld
 * 자바에서 제공하는 데이터 타입
 * 1. Primitive DataType (기본 데이터 타입)
 *    문자 - char(2byte)
 *    숫자 - 정수 - byte(1byte), short(2byte), int(4byte), long(8byte)
 *        - 실수 - float(4byte), double(8byte)
           [float] 부호(1bit)+지수(8bit) +가수(23bit) = 32bit = 4byte
		   [double]부호(1bit)+지수(11bit)+가수(52bit) = 64bit = 8byte
 *    논리 - boolean(1byte)
 *    
 * 2. Reference DataType (참조 데이터 타입)
 *    Array, Class , Interface
 *    
 *시스템에서 데이터 타입 크기
 * byte < char, short < int < long < float < double
 */


public class Java003_datatype {

	public static void main(String[] args) {
		// ⓐ 변수선언
		int data;

		// ⓐ 초기값 할당
		data = 3; // 변수명 = 값
		System.out.println(data);

		data = 20;
		System.out.println(data);

		int val = 10;

		System.out.println(val);

		double age = 4.0;
		float som = 5;
		System.out.println(age);
		System.out.println(som);

		int x = 0101; // 8진수
		// 1*8^2 + 0*8^1 + 1*8^0
		// = 64 + 0 + 1
		// = 65
		System.out.println("x=" + x);

		int z = 0B101; // 2진수
		// 1*2^2 + 0*2^1 + 1*2^0
		// 4 + 0 + 1
		// 5
		System.out.println("z=" + z);

		int k = 0X101; // 16진수
		System.out.println("k=" + k);
		
		double avg = 4.5;
		System.out.println("avg=" + avg);

		boolean chk = false; // Ctrl + Shift + F 자동정렬
		System.out.println("chk=" + chk);
		
		char grade = 'A';
		System.out.println("grade=" + grade); // grade = A
		
		String name = "홍길동";
		System.out.println("name = " + name); // name = 홍길동
		
	}

}
