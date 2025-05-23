package java018_collection.part18;

import java.util.Comparator;

public class NameAgeSort implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		if (o1.getName().equals(o2.getName()))
			return Integer.valueOf(o2.getAge()).compareTo(Integer.valueOf(o1.getAge()));
		else
			return o1.getName().compareTo(o2.getName());
	}

}
