package java012_api.part04;

public class Java118_Object_clone {
	public static void main(String[] args) {
		House house = new House("Hong", 30, new Address("Seoul", "SeoCho"));
		System.out.printf("%s %d %s %s\n",house.name,house.age,house.address.city, house.address.dong);
		
		
		//shallow copy
		House house2=house;
		house2.name="Kim";
		house2.address.city="Gyeounki";
		System.out.printf("%s %d %s %s\n",house.name,house.age,house.address.city, house.address.dong);
		
		House houseCopy=house.ShallowCopy();
		houseCopy.name="Steven";
		houseCopy.address.city="jeju";
		System.out.printf("%s %d %s %s\n",house.name,house.age,house.address.city, house.address.dong);
	}

}
