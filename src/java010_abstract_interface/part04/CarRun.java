package java010_abstract_interface.part04;

public interface CarRun {
	int carCount = 5; // public static final

	//public CarRun() {}
	//static {}
	
	void prn(); //public abstract
	
	class Sun{
		public Sun() {
			System.out.println("Sun constructor");
		}
	}
	
	//Java8부터 default 가능
	default void call() {
		System.out.println("CarRun Call");
	}
	
	//Java8부터 static 가능
	static void display() {
		System.out.println("display");
	}

}
