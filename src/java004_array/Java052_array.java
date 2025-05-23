package java004_array;

//가변배열을 생성할때는 제일 마지막의 배열크기는 지정하지 않는다.
//가변배열을 제공하는 이유는 메모리 손실을 최소화 하기 위한 목적이다.
		
//		int[][] num = new int[3][];
//		num[0] = new int[2];  //0행에 2개의 열을 생성함
//		num[1] = new int[3];  //1행에 3개의 열을 생성함
//		num[2] = new int[5];  //2행에 5개의 열을 생성함
		
//		int[][] num = new int[3][];
//		num[0] = new int[] {1,2};
//		num[1] = new int[] {3,4,5};
//		num[2] = new int[] {6,7,8,9,10};

public class Java052_array {

	public static void main(String[] args) {
//		int[][] num = new int[3][];
//		num[0] = new int[2];  //0행에 2개의 열을 생성함
//		num[1] = new int[3];  //1행에 3개의 열을 생성함
//		num[2] = new int[5];  //2행에 5개의 열을 생성함

//		int[][] num = new int[3][];
//		num[0] = new int[] {1,2};
//		num[1] = new int[] {3,4,5};
//		num[2] = new int[] {6,7,8,9,10};

		int[][] num = new int[][] {{1,2},{3,4,5},{6,7,8,9,10}};
		
		for(int i=0;i<num.length;i++) {
			
			for(int j=0;j<num[i].length;j++) {
				System.out.printf("%4d",num[i][j]);
			}
			System.out.println();
			
		}
		

	}

}
