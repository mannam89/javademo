package ANY;
import java.util.Scanner;
import java.util.ArrayList;

/*  >>>AnyProject04를 위한 임시 주석<<<

class Item{
	private String type;
	private int count;
	
	public Item(String type,int count) {
		this.type= type;
		this.count=count;
	}
	
	@Override
	public String toString() {
		return String.format("타입: %s\n수: %d", type,count);
	}
	
	public String getType() {
		return type;
	}
	public int getCount() {
		return count;
	}
}
*/

public class AnyProject03 {
	
	

	public static class ConsoleColors {
		public static final String RESET = "\033[0m";
		public static final String RED = "\033[0;31m";
		public static final String RED_BOLD = "\033[1;31m";
		public static final String YELLOW = "\033[0;33m";
		public static final String YELLOW_BOLD = "\033[1;33m";
		public static final String GREEN = "\033[0;32m";

	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Item> list = new ArrayList<>();

		while (true) {
			System.out.println("==============================================================");
			System.out.printf(ConsoleColors.RED_BOLD + "%44s", ">>>숫자를 입력하세요(1-4)<<<\n" + ConsoleColors.RESET);
			System.out.println();
			System.out.print("	1." + ConsoleColors.YELLOW + "항목조회     " + ConsoleColors.RESET + "2."
					+ ConsoleColors.YELLOW + "항목추가     " + ConsoleColors.RESET + "3." + ConsoleColors.YELLOW
					+ "항목제거     " + ConsoleColors.RESET + "4." + ConsoleColors.YELLOW + "종료\n" + ConsoleColors.RESET);
			System.out.println("==============================================================");
					
			int choice;
			try {
				choice = scanner.nextInt();
				scanner.nextLine();
			} catch (Exception e) {
				System.out.println(ConsoleColors.RED + "올바른 숫자를 입력해주세요!" + ConsoleColors.RESET);
				scanner.nextLine();
				continue;
			}

			switch (choice) {

			case 1:
				viewItems(list);
				break;

			case 2:
				addItem(scanner, list);
				break;

			case 3:
				removeItem(scanner, list);
				break;

			case 4:
				System.out.println("프로그램 종료!");
				scanner.close();
				return;

			default:
				System.out.println("1-4 사이의 숫자를 입력하세요");
			}
		}
	}

	private static void viewItems(ArrayList<Item> list) {
		System.out.println("\n=============================================================");
		System.out.println(ConsoleColors.YELLOW + "【 항목 조회 】" + ConsoleColors.RESET);
		System.out.println("=============================================================");
		if (list.isEmpty()) {
			System.out.println("목록이 비어있습니다");
		} else {
			for (int i = 0; i < list.size(); i++) {
				System.out.println(ConsoleColors.GREEN + "[ " + (i + 1) + "번 항목 ]" + ConsoleColors.RESET);
				System.out.println(list.get(i));
			}
		}
	}

	private static void addItem(Scanner scanner, ArrayList<Item> list) {
		System.out.println("\n=============================================================");
		System.out.println(ConsoleColors.YELLOW + "【 항목 추가 】" + ConsoleColors.RESET);
		System.out.println("=============================================================");

		System.out.print("타입 : ");
		String type = scanner.nextLine().trim();

		if (type.isEmpty()) {
			System.out.println(ConsoleColors.RED + "타입을 입력해주세요" + ConsoleColors.RESET);
			return;
		}

		int count;
		try {
			System.out.print("수 : ");
			count = scanner.nextInt();
			scanner.nextLine();

			if (count <= 0) {
				System.out.println(ConsoleColors.RED + "양수를 입력해주세요!" + ConsoleColors.RESET);
				return;
			}
		} catch (Exception e) {
			System.out.println(ConsoleColors.RED + "올바른 숫자를 입력해주세요!" + ConsoleColors.RESET);
			scanner.nextLine();
			return;
		}

		Item newItem = new Item(type,count);
		list.add(newItem);
		System.out.println(ConsoleColors.GREEN + "✓ 저장 완료!" + ConsoleColors.RESET);
	}

	private static void removeItem(Scanner scanner, ArrayList<Item> list) {
		System.out.println("\n=============================================================");
		System.out.println(ConsoleColors.YELLOW + "【 항목 제거 】" + ConsoleColors.RESET);
		System.out.println("=============================================================");
		if (list.isEmpty()) {
			System.out.println("삭제 할 항목이 없습니다");
			return;
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println("\n" + ConsoleColors.YELLOW + "[ " + (i + 1) + "번 항목 ]" + ConsoleColors.RESET);
			System.out.println(list.get(i));
		}

		int del;
		try {

			System.out.print("\n삭제할 항목 번호 (취소: 0): ");
			del = scanner.nextInt();
			scanner.nextLine();

			if (del == 0) {
				System.out.println("삭제가 취소되었습니다");
				return;
			}
			if (del < 1 || del > list.size()) {
				System.out.println(ConsoleColors.RED + "올바른 번호를 입력해주세요!" + ConsoleColors.RESET);
				return;
			}
		} catch (Exception e) {
			System.out.println(ConsoleColors.RED + "올바른 숫자를 입력해주세요!" + ConsoleColors.RESET);
			scanner.nextLine();
			return;
		}

		list.remove(del - 1);
		System.out.println(ConsoleColors.GREEN + "✓ " + del + "번 항목이 삭제되었습니다." + ConsoleColors.RESET);

	}
}