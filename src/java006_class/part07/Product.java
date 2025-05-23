package java006_class.part07;

//this : 메모리에 생성된 객체 자신을 의미한다.
//1. this.멤버변수
//2. this.메소드()
//3. this( ) :생성자
public class Product {
	String code;
	String pname;
	int cnt;

	public Product() { // 2
		this("b001", "식품", 2000); // 3
		System.out.println("매개변수가 없는 생성자"); // 9
	} // 10

	public Product(String code, String pname, int cnt) { // 4
		this.code = code; // 5
		this.pname = pname; // 6
		this.cnt = cnt; // 7
	} // 8

	void display() { // 14
		System.out.printf("%s %s %d\n", code, pname, cnt); // 15
	} // 16

	void process() { // 12
		this.display(); // 13
	} // 17
}// end class
