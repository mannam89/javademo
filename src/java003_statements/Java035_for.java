package java003_statements;

public class Java035_for {

	public static void main(String[] args) {
		go: // label
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.println(j);
				if(j==3) {
//					break;
//					break go;
//					continue;	//for문에서 continue를 만나면 현재 수행중인 for문의 증감식으로 이동한다.
					continue go;
				}
			}
		}

	}

}
