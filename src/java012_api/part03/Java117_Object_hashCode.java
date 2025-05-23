package java012_api.part03;


//Object의 hashCode( )메소드는 객체의 메모리 주소를 이용해서
//해시코드를 생성하기 때문에 객체마다 다른 정수값을 리턴한다.

public class Java117_Object_hashCode {

	public static void main(String[] args) {
		Person p1=new Person("홍길동");
		Person p2=new Person("홍길동");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		System.out.println(System.identityHashCode(p1));
		System.out.println(System.identityHashCode(p2));
		

	}

}
