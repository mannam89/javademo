package java008_static_access.part01;

//static
//1. class loader일때 method area에 저장이 된다.
//2. 같은 클래스로 생성된 객체끼리 공유해서 사용한다.
//3. static키워드가 선언된 메소드에서 this, super키워드를 사용할 수 없다.
//
//https://velog.io/@jupiter-j/Java-2.-Inheritance-AbstractMethod

public class Java084_static {

	public static void main(String[] args) {
		System.out.println(StaticEx.y);
		
		StaticEx se = new StaticEx();
		System.out.printf("%d, %d\n", se.x,se.y);
		
		StaticEx ss=new StaticEx();
		System.out.printf("%d, %d\n", ss.x,ss.y);
		
		se.x=20;
		se.y=30;
		System.out.printf("%d, %d\n", se.x,se.y);
		System.out.printf("%d, %d\n", ss.x,ss.y);

	}
}
