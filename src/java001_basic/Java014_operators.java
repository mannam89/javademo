package java001_basic;

// 조건식 ? 참 : 거짓

public class Java014_operators {

	public static void main(String[] args) {
		int total = 23;
		int record = 5;
		
		
		//total % record == 0 식이 true이면 total/record 계산 후 변수에 할당.
		//total % record == 0 식이 false이면 total/record + 1 계산 후 변수에 할당.
		int res = total % record == 0 ? total/record : total/record + 1;
		System.out.println(res);
		
		int jumsu = 61;
		// jumsu >= 80 : 상, jumsu < 80 && jumsu >= 60 : 중, jumsu < 60 : 하
		
		char check = jumsu >= 80 ? '상' : jumsu >= 60 ? '중' : '하';
		System.out.println(check);
		
		check = jumsu >= 60 ? jumsu >= 80 ? '상' : '중' : '하';
	}

}
