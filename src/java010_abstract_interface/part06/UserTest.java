package java010_abstract_interface.part06;

public class UserTest extends User implements Score,Print {
	int s;
	public UserTest() {
		
	}
	public UserTest(String name, int score) {
		super(name);
		this.s=score;
	}
	@Override
	public int getScore() {
		return s*sol;
	}

	@Override
	public String toPaint() {
		return String.format("이름 : %s\n점수 : %d점\n", name,getScore());
	}

}
