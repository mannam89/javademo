package java005_method;

public class Java056_mothod {

	public static void main(String[] args) {
		int year = 2025; // 년도

		boolean chk = isLeapYear(year);
		display(year,chk);
	}

	public static void display(int year,boolean chk) {
		if (chk) {
			System.out.printf("%d년도는 윤년입니다.\n", year);
		} else {
			System.out.printf("%d년도는 평년입니다.\n", year);
		}
	}

	public static boolean isLeapYear(int year) {
		
		boolean res;
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			res=true;

		} else {
			res=false;
		}
		return res;
		// 년도가 윤년이면 true, 평년이면 false로 리턴
	}

}
