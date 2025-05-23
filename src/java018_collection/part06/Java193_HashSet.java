package java018_collection.part06;

import java.util.HashSet;

public class Java193_HashSet {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		
		for(int it : set)
			System.out.println(it);
	}

}
