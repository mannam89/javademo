package java012_api.part02;

public class Member /* extends Object */{
	int id;
	
	public Member() {
		
	}
	public Member (int id) {
		this.id=id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member)
			return id==((Member)obj).id;
		else
			return false;
	}

}
