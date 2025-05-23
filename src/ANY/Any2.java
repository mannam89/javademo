package ANY;
import java.util.Scanner;

public class Any2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = -1;

		do {
			System.out.print("숫자를 입력하세요 (입력 시 종료): ");
			try {
				input = scanner.nextInt();
			} catch (Exception e) {
				System.out.println("숫자만 입력하세요!");
				scanner.nextLine();
				continue;
			}
		} while (input != 0);

		System.out.println("프로그램 종료!");
		scanner.close();
	}
}
