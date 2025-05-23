package java013_api;

//Math클래스의 모든 맴버변수, 메소드는 static이 선언되어 있다.
//Math.맴버변수
//Math.메소드()

public class Java138_Math {
	public static void main(String[] args) {
		System.out.println(Math.E);
		System.out.println(Math.PI);
		
		double de = Math.random();//0.0~1.0미만
		System.out.println(de);
		
		de = de *10;//0.0~9.99999...
		System.out.println(de);
		
		
		System.out.println(Math.floor(de));//0.0~9.0
		
		System.out.println((int)Math.floor(de));//0~9
		
		System.out.println((int)Math.floor(de)+1); //1부터 ~ 10까지
		
		System.out.println((int)Math.floor(Math.random()*10)+1);
		
	}

}
