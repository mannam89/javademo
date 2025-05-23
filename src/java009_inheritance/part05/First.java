package java009_inheritance.part05;

public class First /* extends Object */ {
	int a =10;
	
	public First() {
		
	}
	
	protected void display() {
		System.out.println("a=" + a);
	}
	
	@Override
	public String toString() {
		return String.format("a=%d", a);
	}
	

}
