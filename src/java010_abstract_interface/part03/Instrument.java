package java010_abstract_interface.part03;

public  abstract class Instrument {
	String name;

	public Instrument() {

	}
	
	public Instrument(String name) {
		this.name = name;
	}
	
	public abstract void play() ;
}
