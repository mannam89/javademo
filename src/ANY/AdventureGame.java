package ANY;
import java.util.Scanner;

public class AdventureGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== 취업하기 ===");
        System.out.println("당신은 부천역에 있습니다. 세 갈래 목적지가 나타났습니다.");
        System.out.println("1. 서울역으로 간다");
        System.out.println("2. 용산역으로 간다");
        System.out.println("3. 구로디지털단지역으로 간다");

        System.out.print("어디로 가시겠습니까? (1-3 입력): ");
        int choice = scanner.nextInt();

        System.out.println(); // 줄바꿈

        switch (choice) {
            case 1:
                System.out.println("당신은 서울역으로 가는 열차를 탔습니다...");
                System.out.println("취업 실패.");
                break;
            case 2:
                System.out.println("당신은 용산역으로 가는 열차를 탔습니다...");
                System.out.println("취업 실패.");
                break;
            case 3:
                System.out.println("당신은 구로디지털단지역으로 가는 열차를 탔습니다...");
                System.out.println("취업 성공.");
                break;
            default:
                System.out.println("잘못된 선택입니다. 아무 일도 일어나지 않았습니다.");
                break;
        }
        scanner.close();
    }
}

