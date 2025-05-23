package java013_api;

public class Java133_StringBuffer {
	public static void main(String[] args) {
		String sg = new String("java test java");
		String ss = sg.replace("java", "jsp");
		System.out.println("sg:" + sg);
		System.out.println("ss:" + ss);

		System.out.println(System.identityHashCode(sg));
		System.out.println(System.identityHashCode(ss));

		StringBuffer sb = new StringBuffer("spring test");
		StringBuffer su = sb.replace(7, 11, "framework");
		System.out.println("sb:" + sb);
		System.out.println("su:" + su);
		System.out.println(sb == su);
		System.out.println(System.identityHashCode(sb));
		System.out.println(System.identityHashCode(su));

	}

}
