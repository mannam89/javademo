package ANY;

public class Student_main {
	public static void main(String[] args) {
		Student st = new Student();
		
		st.Name();
		st.Grade(3);
		st.Graduated(false);
		
		System.out.println("이름: " + st.Name());
		System.out.println("학년: " + st.Grade());
		System.out.println("졸업여부: " + st.Graduated());

	}

}
