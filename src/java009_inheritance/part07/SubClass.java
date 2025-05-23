package java009_inheritance.part07;

public class SubClass extends SuperClass{
	
	public SubClass() {
	
	}
	
	public SubClass(int a, int b, int c) {
		//여기를 구현하세요.
		super(a,b,c);
		display();
		sumData();
				
	} 
	
	public void sumData() { 
		System.out.println("합: " + (x+y+z)); 
	} 

}

