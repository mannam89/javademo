package java013_api;

import java.util.Scanner;

//이름, 학점을 입력하는 프로그램을 구현하시오.
//입력 : 홍길동,80,93
//
//[출력결과]
//이름: 홍길동
//국어: 80
//영어: 93
//평균: 86.5 (double로 계산)

public class Java153_Wrapper {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 : ");
		String line = sc.nextLine();
		String[] data = line.split(",");
		double avg = (Double.parseDouble(data[1]) + Double.parseDouble(data[2])) / 2;
		System.out.println("Name: " + data[0]);
		System.out.println("KOR: " + data[1]);
		System.out.println("ENG: " + data[2]);
		System.out.println("Average: " + avg);
	
	}

}
