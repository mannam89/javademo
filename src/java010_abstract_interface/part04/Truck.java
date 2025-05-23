package java010_abstract_interface.part04;

public class Truck implements CarRun {
	public Truck() {

	}

	@Override
	public void prn() {
		System.out.println("Truck prn");

	}
	
	@Override
	public void call() {
		System.out.println("Truck Call");
	}

}
