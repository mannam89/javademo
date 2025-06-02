package ANY.part01;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;

class Exercise {
	private String exerciseName;  // 운동 이름
	private int sets;             // 세트 수
	private int reps;             // 반복 횟수 (갯수)
	private int restTime;         // 휴식 시간 (초)

	public Exercise(String exerciseName, int sets, int reps, int restTime) {
		this.exerciseName = exerciseName;
		this.sets = sets;
		this.reps = reps;
		this.restTime = restTime;
	}

	@Override
	public String toString() {
		return String.format("운동명: %s\n세트수: %d세트\n갯수: %d회\n휴식시간: %d초", 
							exerciseName, sets, reps, restTime);
	}

	public String getExerciseName() {
		return exerciseName;
	}

	public int getSets() {
		return sets;
	}

	public int getReps() {
		return reps;
	}

	public int getRestTime() {
		return restTime;
	}

	public int getTotalReps() {
		return sets * reps;
	}
}

public class ExerciseManager {

	public static class ConsoleColors {
		public static final String RESET = "\033[0m";
		public static final String RED = "\033[0;31m";
		public static final String RED_BOLD = "\033[1;31m";
		public static final String YELLOW = "\033[0;33m";
		public static final String YELLOW_BOLD = "\033[1;33m";
		public static final String GREEN = "\033[0;32m";
		public static final String ORANGE = "\033[38;5;208m";
		public static final String PURPLE = "\033[0;35m";
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Exercise> exerciseList = new ArrayList<>();

		System.out.println(ConsoleColors.PURPLE + "🏋️‍♂️ 운동 관리 시스템에 오신 것을 환영합니다! 🏋️‍♀️" + ConsoleColors.RESET);
		System.out.println();

		while (true) {
			System.out.println("==============================================================");
			System.out.printf(ConsoleColors.RED_BOLD + "%48s", ">>>메뉴를 선택하세요(1-6)<<<\n" + ConsoleColors.RESET);
			System.out.println();
			System.out.print("  1." + ConsoleColors.YELLOW + "운동기록조회  " + ConsoleColors.RESET + "2."
					+ ConsoleColors.YELLOW + "운동기록추가  " + ConsoleColors.RESET + "3." + ConsoleColors.YELLOW + "운동기록삭제\n"
					+ ConsoleColors.RESET);
			System.out.print("  4." + ConsoleColors.YELLOW + "기록저장     " + ConsoleColors.RESET + "5."
					+ ConsoleColors.YELLOW + "기록불러오기  " + ConsoleColors.RESET + "6." + ConsoleColors.YELLOW + "프로그램종료\n"
					+ ConsoleColors.RESET);
			System.out.println("==============================================================");

			int choice;
			try {
				choice = scanner.nextInt();
				scanner.nextLine();
			} catch (Exception e) {
				System.out.println(ConsoleColors.RED + "❌ 올바른 숫자를 입력해주세요!" + ConsoleColors.RESET);
				scanner.nextLine();
				continue;
			}

			switch (choice) {

			case 1:
				viewExercises(exerciseList);
				break;

			case 2:
				addExercise(scanner, exerciseList);
				break;

			case 3:
				removeExercise(scanner, exerciseList);
				break;
				
			case 4:
				saveToFile(exerciseList);
				break;
				
			case 5:
				loadFromFile(exerciseList);
				break;

			case 6:
				System.out.println(ConsoleColors.ORANGE + "🎯 운동 기록 관리를 마칩니다. 건강한 하루 되세요!" + ConsoleColors.RESET);
				scanner.close();
				return;

			default:
				System.out.println(ConsoleColors.RED + "❌ 1-6 사이의 숫자를 입력하세요" + ConsoleColors.RESET);
			}
		}
	}

	private static void viewExercises(ArrayList<Exercise> exerciseList) {
		System.out.println("\n=============================================================");
		System.out.println(ConsoleColors.YELLOW + "📋【 운동 기록 조회 】" + ConsoleColors.RESET);
		System.out.println("=============================================================");
		if (exerciseList.isEmpty()) {
			System.out.println("💭 아직 운동 기록이 없습니다. 오늘부터 운동을 시작해보세요!");
		} else {
			int totalSets = 0;
			int totalReps = 0;
			for (int i = 0; i < exerciseList.size(); i++) {
				System.out.println(ConsoleColors.GREEN + "🏃‍♂️ [ " + (i + 1) + "번째 운동 ]" + ConsoleColors.RESET);
				System.out.println(exerciseList.get(i));
				totalSets += exerciseList.get(i).getSets();
				totalReps += exerciseList.get(i).getTotalReps();
				System.out.println();
			}
			System.out.println(ConsoleColors.ORANGE + "📊 오늘의 운동 총합:" + ConsoleColors.RESET);
			System.out.println(ConsoleColors.ORANGE + "   • 총 세트수: " + totalSets + "세트" + ConsoleColors.RESET);
			System.out.println(ConsoleColors.ORANGE + "   • 총 반복횟수: " + totalReps + "회" + ConsoleColors.RESET);
		}
	}

	private static void addExercise(Scanner scanner, ArrayList<Exercise> exerciseList) {
		System.out.println("\n=============================================================");
		System.out.println(ConsoleColors.YELLOW + "➕【 운동 기록 추가 】" + ConsoleColors.RESET);
		System.out.println("=============================================================");

		System.out.println("💡 예시: 푸시업, 스쿼트, 벤치프레스, 데드리프트, 풀업 등");
		System.out.print("🏋️‍♂️ 운동명 : ");
		String exerciseName = scanner.nextLine().trim();

		if (exerciseName.isEmpty()) {
			System.out.println(ConsoleColors.RED + "❌ 운동명을 입력해주세요" + ConsoleColors.RESET);
			return;
		}

		int sets, reps, restTime;
		
		try {
			System.out.print("🔢 세트수 : ");
			sets = scanner.nextInt();
			scanner.nextLine();

			if (sets <= 0) {
				System.out.println(ConsoleColors.RED + "❌ 세트수는 1 이상 입력해주세요!" + ConsoleColors.RESET);
				return;
			}
		} catch (Exception e) {
			System.out.println(ConsoleColors.RED + "❌ 올바른 숫자를 입력해주세요!" + ConsoleColors.RESET);
			scanner.nextLine();
			return;
		}

		try {
			System.out.print("🔁 갯수(반복횟수) : ");
			reps = scanner.nextInt();
			scanner.nextLine();

			if (reps <= 0) {
				System.out.println(ConsoleColors.RED + "❌ 갯수는 1 이상 입력해주세요!" + ConsoleColors.RESET);
				return;
			}
		} catch (Exception e) {
			System.out.println(ConsoleColors.RED + "❌ 올바른 숫자를 입력해주세요!" + ConsoleColors.RESET);
			scanner.nextLine();
			return;
		}

		try {
			System.out.print("⏰ 휴식시간(초) : ");
			restTime = scanner.nextInt();
			scanner.nextLine();

			if (restTime < 0) {
				System.out.println(ConsoleColors.RED + "❌ 휴식시간은 0 이상 입력해주세요!" + ConsoleColors.RESET);
				return;
			}
		} catch (Exception e) {
			System.out.println(ConsoleColors.RED + "❌ 올바른 숫자를 입력해주세요!" + ConsoleColors.RESET);
			scanner.nextLine();
			return;
		}

		Exercise newExercise = new Exercise(exerciseName, sets, reps, restTime);
		exerciseList.add(newExercise);
		
		System.out.println(ConsoleColors.GREEN + "✅ 운동 기록이 저장되었습니다! 💪" + ConsoleColors.RESET);
		System.out.println(ConsoleColors.ORANGE + "📈 총 " + (sets * reps) + "회 완료 예정! 화이팅!" + ConsoleColors.RESET);
	}

	private static void removeExercise(Scanner scanner, ArrayList<Exercise> exerciseList) {
		System.out.println("\n=============================================================");
		System.out.println(ConsoleColors.YELLOW + "🗑️【 운동 기록 삭제 】" + ConsoleColors.RESET);
		System.out.println("=============================================================");
		if (exerciseList.isEmpty()) {
			System.out.println("💭 삭제할 운동 기록이 없습니다");
			return;
		}
		
		System.out.println("현재 운동 기록:");
		for (int i = 0; i < exerciseList.size(); i++) {
			System.out.println(ConsoleColors.YELLOW + "🏃‍♂️ [ " + (i + 1) + "번째 운동 ]" + ConsoleColors.RESET);
			System.out.println(exerciseList.get(i));
			System.out.println();
		}

		int del;
		try {
			System.out.print("🗑️  삭제할 운동 번호 (취소: 0): ");
			del = scanner.nextInt();
			scanner.nextLine();

			if (del == 0) {
				System.out.println("🔄 삭제가 취소되었습니다");
				return;
			}
			if (del < 1 || del > exerciseList.size()) {
				System.out.println(ConsoleColors.RED + "❌ 올바른 번호를 입력해주세요!" + ConsoleColors.RESET);
				return;
			}
		} catch (Exception e) {
			System.out.println(ConsoleColors.RED + "❌ 올바른 숫자를 입력해주세요!" + ConsoleColors.RESET);
			scanner.nextLine();
			return;
		}

		exerciseList.remove(del - 1);
		System.out.println(ConsoleColors.GREEN + "✅ " + del + "번째 운동 기록이 삭제되었습니다." + ConsoleColors.RESET);
	}

	private static void saveToFile(ArrayList<Exercise> exerciseList) {
		System.out.println("\n=============================================================");
		System.out.println(ConsoleColors.YELLOW + "💾【 운동 기록 저장 】" + ConsoleColors.RESET);
		System.out.println("=============================================================");

		try (PrintWriter writer = new PrintWriter("exercise_records.txt")) {
			for (Exercise exercise : exerciseList) {
				writer.println(exercise.getExerciseName());
				writer.println(exercise.getSets());
				writer.println(exercise.getReps());
				writer.println(exercise.getRestTime());
				writer.println("---");
			}
			System.out.println(ConsoleColors.GREEN + "✅ 운동 기록이 파일에 저장되었습니다! 📁" + ConsoleColors.RESET);

		} catch (IOException e) {
			System.out.println(ConsoleColors.RED + "❌ 파일 저장에 실패했습니다!" + ConsoleColors.RESET);
		}
	}

	private static void loadFromFile(ArrayList<Exercise> exerciseList) {
		System.out.println("\n=============================================================");
		System.out.println(ConsoleColors.YELLOW + "📁【 운동 기록 불러오기 】" + ConsoleColors.RESET);
		System.out.println("=============================================================");

		File file = new File("exercise_records.txt");
		if (!file.exists()) {
			System.out.println("📂 저장된 운동 기록 파일이 없습니다.");
			return;
		}

		try (Scanner fileScanner = new Scanner(file)) {
			exerciseList.clear();

			while (fileScanner.hasNextLine()) {
				String exerciseName = fileScanner.nextLine();

				if (fileScanner.hasNextLine()) {
					int sets = Integer.parseInt(fileScanner.nextLine());
					
					if (fileScanner.hasNextLine()) {
						int reps = Integer.parseInt(fileScanner.nextLine());
						
						if (fileScanner.hasNextLine()) {
							int restTime = Integer.parseInt(fileScanner.nextLine());

							if (fileScanner.hasNextLine()) {
								fileScanner.nextLine(); // "---" 구분자 건너뛰기
							}

							Exercise exercise = new Exercise(exerciseName, sets, reps, restTime);
							exerciseList.add(exercise);
						}
					}
				}
			}
			System.out.println(ConsoleColors.GREEN + "✅ 운동 기록 불러오기 완료! 📈" + ConsoleColors.RESET);
			System.out.println("📊 총 " + exerciseList.size() + "개의 운동 기록을 불러왔습니다.");
		} catch (IOException e) {
			System.out.println(ConsoleColors.RED + "❌ 파일 읽기에 실패했습니다!" + ConsoleColors.RESET);
		} catch (NumberFormatException e) {
			System.out.println(ConsoleColors.RED + "❌ 파일 형식이 올바르지 않습니다!" + ConsoleColors.RESET);
		}
	}
}