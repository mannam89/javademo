package java010_abstract_interface.part01;

//추상 클래스
public abstract class CarAbs {
	int speed;
	String color;
	
	//추상 메소드
	public abstract void work();
	
	//구현된 메소드
	public void display() {
		System.out.printf("speed=%d, color=%s\n",speed,color);
	}

}
