package java013_api;

import java.util.Scanner;

//java.util.Scanner : jdk5

public class Java145_Scanner {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름:");
		
//		String name = sc.next();
		String name = sc.nextLine();
		System.out.println(name);
		
	}

}
