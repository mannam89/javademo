package java006_class.part06;

public class Java071_constructor {

	public static void main(String[] args) {
		HandPhone hp = new HandPhone();
		hp.name = "홍길동";
		hp.number = "010-6893-5386";
		hp.display();
		
		HandPhone hp1=new HandPhone("Hong","456-987-312");
		hp1.display();

	}

}
