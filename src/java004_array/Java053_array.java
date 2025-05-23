package java004_array;

public class Java053_array {

	public static void main(String[] args) {
		char[][] color = { { 'r', 'e', 'd' }, { 'g', 'r', 'e', 'e', 'n' }, { 'p', 'i', 'n', 'k' } };
		for (int i = 0; i < color.length; i++) {
			for (int j = 0; j < color[i].length; j++) {
				System.out.printf("%c", j == 0 ? (char) color[i][j] - 32 : color[i][j]);
//				if(j==0) {
//					System.out.printf("%C",color[i][j]);
//				}else {
//					System.out.printf("%c",color[i][j]);	
//				}
			}
			System.out.println();
		}
	}
}
