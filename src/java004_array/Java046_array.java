package java004_array;

public class Java046_array {

	public static void main(String[] args) {
		// 3행 2열의 배열
		int[][] num = { { 1, 2 }, { 3, 4 }, { 5, 6 } };

		for (int row = 0; row < num.length; row++) {
			for (int col = 0; col < num[row].length; col++) {
				System.out.printf("num[%d][%d]=%d", row, col, num[row][col]);
				System.out.printf("%c", col != num[row].length - 1 ? '\t' : '\n');
			}
		}
		System.out.println("================================");
		for (int col = 0, row = 0; col < num[row].length; col++, row = 0) {
			for (; row < num.length; row++) {
				System.out.printf("num[%d][%d]=%d", row, col, num[row][col]);
				System.out.printf("%c", row != num[col].length ? '\t' : '\n');
			}
		}
	}

}
