package java001_basic;

public class Java001_main {

	public static void main(String[] args) {
		System.out.println("Loading...");
		boolean license = false;
		int age = 18;
		
		if (age >=18 && license == false) {
			System.out.println("...");
		}else {
			System.out.println(".");
		}
		process();
			
	}
	public static void process() {
	for (int i = 1; i <= 5; i++) {
		System.out.println("i= " + i);
	}
	}
}
