package java009_inheritance.part06;

public class DogOver extends PetOver {
	public DogOver() {
		
	}
	
	@Override
	public void move() {
		System.out.println("서브클래스() : 강아지가 걸어갑니다.");
	}

}
