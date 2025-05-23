package java018_collection.part05;

import java.util.TreeSet;

import javax.print.attribute.SetOfIntegerSyntax;

import java.util.Iterator;
import java.util.TreeSet;

public class Java192_TreeSet {
	public static void main(String[] args) {
		// Tree(오름차순 정렬), Set(중복안됨)
		TreeSet<Integer> tree = new TreeSet<Integer>();
		tree.add(300);
		tree.add(100);
		tree.add(200);

		System.out.println(tree.size()); // 3
		for (int it : tree)
			System.out.println(it);
		System.out.println(tree.size()); // 3

		System.out.println("====Iterator=====");
		Iterator<Integer> ita = tree.iterator();
		while (ita.hasNext())
			System.out.println(ita.next());

		System.out.println("====내림차순=====");
		Iterator<Integer> descIta = tree.descendingIterator();
		while (descIta.hasNext())
			System.out.println(descIta.next());

		System.out.println("=================");
		System.out.println(tree.first()); // 100
		System.out.println(tree.size()); // 3

		System.out.println(tree.pollFirst()); // Remove하면서 가져옴
		System.out.println(tree.size()); // 2

		System.out.println(tree.last()); // 300
		System.out.println(tree.size()); // 2

		System.out.println(tree.pollLast()); // 300 //Remove하면서 가져옴
		System.out.println(tree.size()); // 1
	}// end main()
}// end class
