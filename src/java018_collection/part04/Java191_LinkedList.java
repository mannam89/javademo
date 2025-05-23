package java018_collection.part04;

import java.util.LinkedList;

public class Java191_LinkedList {
	public static void main(String[] args) {
		LinkedList<String> nQueue = new LinkedList<String>();
		nQueue.offer(new String("java"));
		nQueue.offer(new String("jsp"));
		nQueue.offer(new String("spring"));
		System.out.println(nQueue.size());
		
//		System.out.println(nQueue.poll());
//		System.out.println(nQueue.poll());
//		System.out.println(nQueue.poll());
//		System.out.println(nQueue.size());
//		System.out.println(nQueue.poll());
		
		while(!nQueue.isEmpty())
			System.out.println(nQueue.poll());
		
		System.out.println(nQueue.size());
	}

}
