package java018_collection.part10;

public class Java197_User {
	public static void main(String[] args) {
		Box<String> strBox=new Box<String>("java");
		System.out.println(strBox.getData());
		
		Box<Integer> intBox=new Box<Integer>(10);
		System.out.println(intBox.getData());
		
		Box<Double> dblBox=new Box<Double>();
		dblBox.setData(4.5);
		System.out.println(dblBox.getData());
		
	}

}
