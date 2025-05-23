package java009_inheritance.part05;

public class Second extends First{
	int b =20;
	
	public Second(){
		
	}
	
	@Override
	public void display() {
		System.out.println("b="+b);
		
	}
	
	@Override
	public String toString() {
		return String.format("a=%d, b=%d\n",a,b);
	}
	
	public void superThisMethod() {
		super.display();
		this.display();
	}

}
