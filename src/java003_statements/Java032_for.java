package java003_statements;

public class Java032_for {

	public static void main(String[] args) {
		
//		for(int i =1; i<=12; i++) {
//			System.out.printf("%4d", i);
//			if(i%4==0) {
//				System.out.println();
//			}
//		}
		int data = 1;
		for (int row = 1; row<=3; row++) {
			for (int col = 1; col<=4; col++) {
				//System.out.printf("%4d", data); 
				//data += 1;
				System.out.printf("%4d", data++);
			}
			System.out.println();
		}
	}

}
