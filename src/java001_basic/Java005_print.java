package java001_basic;

public class Java005_print {

	public static void main(String[] args) {
		byte bNum = 127; // -128 ~ 127
		short sNum = 32767; // -32768 ~ 32767
		int iNum = 2147483647; // -2,147,483,648 ~ 2,147,483,647
		long lNum = 6L; // L or l -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
		float fNum = 2.5F; // F or f
		double dNum = 5.25;
		char cData = 'a';
		boolean eNum = true;
		String sData = "java";

		// 데이터를 출력하고 줄바꿈을 한다.
		System.out.println(bNum + "," + sNum);
		System.out.printf("%d,%d\n", bNum, sNum);

//		/*
//		 * System.out.printf("출력형식", 값1, 값2, 값3...);
//		 * 
//		 * 출력기호
//		 * %d : 정수(byte, short, int, long)
//		 * %f : 실수 (float, double)
//		 * %b : 논리 (boolean)
//		 * %c : 문자 (char)
//		 * %s : 문자열 (String)
//		 * %% : %
//		 * \n : 줄바꿈
//		 * \t : 탭
//		 *\

		System.out.printf("%d,%d %d %d\n", bNum, sNum, iNum, lNum);
		System.out.printf("%.1f %.2f\n", fNum, dNum);
		System.out.printf("%c %b %s\n", cData, eNum, sData);
		System.out.printf("%d %% %d = %d\n", 5, 2, 5 % 2); // % 나머지
		
		System.out.printf("%o\n", 19); // 8진수로 출력
		System.out.printf("%x\n", 19); // 16진수로 출력
		System.out.printf("%s\n", Integer.toBinaryString(19)); //2진수
		System.out.printf("%5x\n", 19); //오른쪽 정렬, 총자리수 5
		System.out.printf("%-5x\n", 19); //왼쪽 정렬, 총자리수 5
		System.out.printf("%05x\n", 19); //값이 없는 자리는 0으로 채움
		
		System.out.print("java");
		System.out.print("program");
	}

}
