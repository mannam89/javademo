package ANY;
import java.util.Scanner;
import java.util.ArrayList;

public class AnyProject01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();

		while (true) {
			System.out.println("=============================================================");
			System.out.printf(ConsoleColors.RED_BOLD + "%43s", ">>>숫자를 입력하세요(1-4)<<<\n" + ConsoleColors.RESET);
			System.out.println();
			System.out.print("	1." + ConsoleColors.YELLOW + "항목조회     " + ConsoleColors.RESET + "2."
					+ ConsoleColors.YELLOW + "항목추가     " + ConsoleColors.RESET + "3." + ConsoleColors.YELLOW
					+ "항목제거     " + ConsoleColors.RESET + "4." + ConsoleColors.YELLOW + "종료\n" + ConsoleColors.RESET);
			System.out.println("=============================================================");
			int choice = scanner.nextInt();
			scanner.nextLine();
			if (choice == 1) {
				System.out.println("=============================================================");
				System.out.printf("항목조회\n");
				System.out.println();
				if (list.isEmpty()) {
					System.out.println("목록이 비어있습니다");
				} else {
					for (int i = 0; i < list.size(); i++) {
						System.out.println((i + 1) + ".\n" + list.get(i));
						System.out.println();
					}
				}

			} else if (choice == 2) {
				System.out.print("타입 : ");
				String type = scanner.nextLine();

				System.out.print("수 : ");
				int count = scanner.nextInt();
				scanner.nextLine();

				String info = "타입 : " + type + "\n수 : " + count;
				list.add(info);
				System.out.println("저장 완료!");
			} else if (choice == 3) {
				if (list.isEmpty()) {
					System.out.println("삭제 할 항목이 없습니다");
				} else {
					System.out.println("삭제 할 항목을 선택 해주세요");
					for (int i = 0; i < list.size(); i++) {
						System.out.println((i + 1) + ".\n" + list.get(i));
						System.out.println();
					}
					System.out.print("삭제 할 항목: ");
					int del = scanner.nextInt();
					scanner.nextLine();
					list.remove(del - 1);
					System.out.println(del + "번 항목이 삭제 되었습니다");
				}
			} else if (choice == 4) {
				System.out.println("프로그램 종료!");
				break;
			}
		}
		scanner.close();

	}

	public class ConsoleColors {
		public static final String RESET = "\033[0m";
		public static final String RED = "\033[0;31m";
		public static final String RED_BOLD = "\033[1;31m";
		public static final String YELLOW = "\033[0;33m";
		public static final String YELLOW_BOLD = "\033[1;33m";
	}
}
