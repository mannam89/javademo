package java017_collection.part02;

public class Java181_List {
	public static void main(String[] args) {
		UserList us = new UserList();
		
		us.add(10);
		us.add(20);
		us.add(30);
		us.add(40);
		System.out.println(us.get(0));
		System.out.println(us.get(1));
		System.out.println(us.get(2));
		System.out.println(us.get(3));
		
		us.add(2,50);
		for(int i=0;i<us.size();i++)
			System.out.println(us.get(i));

		us.remove(2);
		for(int i=0;i<us.size();i++)
			System.out.println(us.get(i));
		
	}

}
