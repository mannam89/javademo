package java008_static_access.part03;

public class Java086_static {

	public static void main(String[] args) {
		display();
		
//		non-static 자원은 static 메소드에서 호출할 수 없다.
//		process();

	}
	
	public static void display() {
		System.out.println("display");
		
	}
	
	public void process() {
		System.out.println("process");
	}

}
