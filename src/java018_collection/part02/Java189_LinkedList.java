package java018_collection.part02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Java189_LinkedList {
	public static void main(String[] args) {
		System.out.println("=======ArrayList=======");
		ArrayList<String> aList = new ArrayList<String>();
		aList.add(new String("java"));
		aList.add(new String("jsp"));
		aList.add(new String("spring"));
		
		ListIterator<String> ank =aList.listIterator();
		System.out.println("앞 -> 뒤");
		while(ank.hasNext())
			System.out.println(ank.next());
		
		System.out.println("뒤 -> 앞");
		while(ank.hasPrevious())
			System.out.println(ank.previous());
		
		
		LinkedList<String> aNode = new LinkedList<String>();
		aNode.add(new String("java"));
		aNode.add(new String("jsp"));
		aNode.add(new String("spring"));
		
		
		ank = aNode.listIterator();
		System.out.println("앞->뒤");
		while(ank.hasNext())
		   System.out.println(ank.next());	
		
		System.out.println("뒤->앞");
		while(ank.hasPrevious())
		  System.out.println(ank.previous());


		
	}

}
