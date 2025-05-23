package java013_api;

import java.util.Scanner;

public class Java148_Scanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("단입력: ");
			int dan = sc.nextInt();
			for(int i =1;i<=9;i++) {
				System.out.printf("%d X %d = %2d\n",dan,i,dan*i);
			}
			
			System.out.println("계속하시겠습니까?(종료:n, 계속:아무키)");
			String chk = sc.next();
			if(chk.equals("n")) {
				System.out.println("프로그램종료");
				break;
			}
		}
	}

}
