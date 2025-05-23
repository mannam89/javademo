package java011_casting.part02;

public class Java111_binding {
	public static void main(String[] args) {
		Employee employee = new Employee("Steven", "code001");
		process(employee);

		Manager manager = new Manager("Neena", "professor", "second");
		process(manager);
	}

	public static void process(Object obj) {
		System.out.println(obj.toString());
		if (obj instanceof Employee) {
			Employee ee =(Employee)obj;
			System.out.println(ee.pay());
		} else if (obj instanceof Manager) {
//			Manager mm = (Manager)obj;
			System.out.println(((Manager)obj).display());
		}
	}

//	public static void process(Employee emp) {
//		System.out.println(emp.toString());
//		System.out.println(emp.pay());
//	}

}
