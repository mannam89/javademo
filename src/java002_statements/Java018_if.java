package java002_statements;

public class Java018_if {

	public static void main(String[] args) {
		boolean member = true; //회원(true) or 비회원(false)
		String grade = "VIP"; // 회원등급(VIP, 일반)

		if(member == true) {
			//회원
			if(grade == "VIP") {
				//회원&&VIP
				System.out.printf("고객님은 %s이며 %d%% 적립 했습니다.\n", grade, 30);
			}else {
				//회원&&일반
				System.out.printf("고객님은 %s이며 %d%% 적립 했습니다.\n", grade, 10);
			}
		}else {
			//비회원
			System.out.printf("고객님은 %s이며 %d%% 적립 했습니다.\n", "비회원", 0);
		}
		System.out.println("오늘도 방문해 주셔서 감사합니다.");
	}
}
