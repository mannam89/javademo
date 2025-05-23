package java013_api;
import java.util.Scanner;

public class Java146_Scanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("부서 연봉 평가:");
		
		String dept= sc.next();
//		System.out.println(dept);
		
		int salary = sc.nextInt();
//		System.out.println(salary);
		
		double avg = sc.nextDouble();
//		System.out.println(avg);
		
		System.out.printf("%s %d %.1f\n",dept,salary,avg);
		sc.close();
		
	}

}
