package ANY;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;

class Item {
	private String type;
	private int count;

	public Item(String type, int count) {
		this.type = type;
		this.count = count;
	}

	@Override
	public String toString() {
		return String.format("타입: %s\n수: %d", type, count);
	}

	public String getType() {
		return type;
	}

	public int getCount() {
		return count;
	}
}

public class AnyProject04 {

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
			System.out.printf(ConsoleColors.RED_BOLD + "%44s", ">>>숫자를 입력하세요(1-6)<<<\n" + ConsoleColors.RESET);
			System.out.println();
			System.out.print("  1." + ConsoleColors.YELLOW + "항목조회     " + ConsoleColors.RESET + "2."
					+ ConsoleColors.YELLOW + "항목추가     " + ConsoleColors.RESET + "3." + ConsoleColors.YELLOW + "항목제거\n"
					+ ConsoleColors.RESET);
			System.out.print("  4." + ConsoleColors.YELLOW + "저장하기     " + ConsoleColors.RESET + "5."
					+ ConsoleColors.YELLOW + "불러오기     " + ConsoleColors.RESET + "6." + ConsoleColors.YELLOW + "종료\n"
					+ ConsoleColors.RESET);
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
				saveToFile(list);
				break;
				
			case 5:
				loadFromFile(list);
				break;

			case 6:
				System.out.println("프로그램 종료!");
				scanner.close();
				return;

			default:
				System.out.println("1-6 사이의 숫자를 입력하세요");
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

		Item newItem = new Item(type, count);
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

	private static void saveToFile(ArrayList<Item> list) {
		System.out.println("\n=============================================================");
		System.out.println(ConsoleColors.YELLOW + "【 파일 저장 】" + ConsoleColors.RESET);
		System.out.println("=============================================================");

		try (PrintWriter writer = new PrintWriter("items.txt")) {
			for (Item item : list) {
				writer.println(item.getType());
				writer.println(item.getCount());
				writer.println("---");
			}
			System.out.println(ConsoleColors.GREEN + "✓ 파일 저장 완료!" + ConsoleColors.RESET);

		} catch (IOException e) {
			System.out.println(ConsoleColors.RED + "파일 저장 실패!" + ConsoleColors.RESET);
		}
	}

	private static void loadFromFile(ArrayList<Item> list) {
		System.out.println("\n=============================================================");
		System.out.println(ConsoleColors.YELLOW + "【 파일 불러오기 】" + ConsoleColors.RESET);
		System.out.println("=============================================================");

		File file = new File("items.txt");
		if (!file.exists()) {
			System.out.println("저장된 파일이 없습니다.");
			return;
		}

		try (Scanner fileScanner = new Scanner(file)) {
			list.clear();

			while (fileScanner.hasNextLine()) {
				String type = fileScanner.nextLine();

				if (fileScanner.hasNextLine()) {
					int count = Integer.parseInt(fileScanner.nextLine());

					if (fileScanner.hasNextLine()) {
						fileScanner.nextLine();
					}

					Item item = new Item(type, count);
					list.add(item);

				}
			}
			System.out.println(ConsoleColors.GREEN + "✓ 파일 불러오기 완료!" + ConsoleColors.RESET);
			System.out.println("총 " + list.size() + "개 항목을 불러왔습니다.");
		} catch (IOException e) {
			System.out.println(ConsoleColors.RED + "파일 읽기 실패!" + ConsoleColors.RESET);
		}
	}
}