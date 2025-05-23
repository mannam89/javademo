package java007_class.part08;

public class Java082_for {

	public static void main(String[] args) {
		int[] num= {10,20,30,40,50};
		
		for(int i =0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		System.out.println("=======================");
		
		for(int element:num) {
			System.out.println(element);
		}

	}

}
