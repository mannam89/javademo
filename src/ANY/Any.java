package ANY;

public class Any {

	public static void main(String[] args) {
		int num = (int)(Math.random()*6) + 1;
		
		switch(num) {
		case 1:
			System.out.println("1번이 나왔습니다.");
			break;
		case 2:
			System.out.println("2번이 나왔습니다.");
			break;
		case 3:
			System.out.println("3번이 나왔습니다.");
			break;
		case 4:
			System.out.println("4번이 나왔습니다.");
			break;
		case 5:
			System.out.println("5번이 나왔습니다.");
			break;
		default:
			System.out.println("6번이 나왔습니다.");
		}
		
		
		
		int day = 6;
		String dayName;
		
		switch(day) {
		case 1:
			dayName = "월요일";
			break;
		case 2:
			dayName = "화요일";
			break;
		case 3:
			dayName = "수요일";
			break;
		case 4:
			dayName = "목요일";
			break;
		case 5:
			dayName = "금요일";
			break;
		case 6:
			dayName = "토요일";
			break;
		case 7:
			dayName = "일요일";
			break;
		default:
			dayName = "유효하지 않은 날";
		}
		
		System.out.println(dayName);

		
		
		int jumsu = 102;
		// 90이상 : A, 90미만 ~ 80이상: B, 80미만 ~ 70이상 : C, 70미만 ~ 60이상 : D, 60미만 : F
		if (jumsu==100) {
			System.out.printf("점수가 %d이므로 학점은 %c입니다.", jumsu, 'A');
		}else {
		switch(jumsu/10) {
		case 9:	System.out.printf("점수가 %d이므로 학점은 %c입니다.", jumsu, 'A'); break;
		case 8: System.out.printf("점수가 %d이므로 학점은 %c입니다.", jumsu,'B'); break;
		case 7: System.out.printf("점수가 %d이므로 학점은 %c입니다.", jumsu,'C'); break;
		case 6: System.out.printf("점수가 %d이므로 학점은 %c입니다.", jumsu,'D'); break;
		case 5: case 4: case 3: case 2: case 1:
			System.out.printf("점수가 %d이므로 학점은 %c입니다.", jumsu,'F'); break;
		default: System.out.println("Error");
		}
		}
		

		
		for (int i=1; i<=Math.random()*6+1; i++) {
			System.out.println(i);
			
		
		for (int m=2; m<=9; m++) {
			System.out.println("*** " + m +"단 ***");
		 for (int n=1; n<=9; n++) {
			 System.out.println(m+"x"+n+"="+m*n);

		 }
		}
		}
	}
}
