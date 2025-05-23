package java006_class.part01;

public class Java066_class {

	public static void main(String[] args) {

		Person pn; // 객체참조변수 선언
		pn = new Person(); // 객체생성

		// 객체참조변수.맴버변수
		pn.name = "홍길동";
		pn.age = 30;
		pn.gender = '남';

		System.out.printf("%s %d %c\n", pn.name, pn.age, pn.gender);

		pn.develop();
		pn.run();

		Person ps = new Person();
		ps.name = "김영희";
		ps.age = 28;
		ps.gender = '여';
		System.out.printf("%s %d %c\n", ps.name, ps.age, ps.gender);
		ps.develop();
		ps.run();

	}

}
