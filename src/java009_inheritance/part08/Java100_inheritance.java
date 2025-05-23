package java009_inheritance.part08;

public class Java100_inheritance {

	public static void main(String[] args) {
		OwnerEngine oEngine = new OwnerEngine();
		System.out.println(oEngine.toString());
		oEngine.setSpeed(100);
		oEngine.color = "Blue";		
		oEngine.setSeat(4);
		System.out.println(oEngine.toString());
		
		FireEngine fireEngine = new FireEngine();
		System.out.println(fireEngine.toString());
		fireEngine.color="Red";
		fireEngine.setSpeed(150);
		fireEngine.setWater(10000);
		System.out.println(fireEngine.toString());
		
		Car car = new Car();
		car.color = "Green";
		car.setSpeed(20);
		System.out.println(car.toString());
		

	}//end main()

}//end class
