package java018_collection.part18;

import java.util.ArrayList;

public class Java205_Sort {
	public static void main(String[] args) {
		ArrayList<Person> ts = new ArrayList<Person>();
		ts.add(new Person("홍길동", 40));
		ts.add(new Person("가비", 20));
		ts.add(new Person("가비", 30));
		ts.add(new Person("나비", 15));
		
		ts.sort(new NameAgeSort());
		for(Person ps : ts)
			System.out.println(ps.toString());

	}

}
