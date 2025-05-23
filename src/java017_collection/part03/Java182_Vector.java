package java017_collection.part03;

import java.util.Vector;

public class Java182_Vector {
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.add(new String("java"));
		v.add(new String("jsp"));
		v.add(new String("spring"));
		System.out.println("요소의 크기: " + v.size());

		for (int i = 0; i < v.size(); i++) {
			//Vector을 생성할때 String을 선언했기 때문에 Vector에서 String요소를 꺼내올때 다운캐스팅을 명시하지 않아도 된다.
			String data = v.get(i);
			System.out.println(data);
		}
		
		//개선된 반복문
		//for(데이터타입 변수 : 배열 or 컬렉션) { }
		for(String data : v)
			System.out.println(data);
	}

}
