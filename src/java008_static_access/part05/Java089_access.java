package java008_static_access.part05;

public class Java089_access {
	public static void main(String[] args) {
		Java088_access p = new Java088_access();
//		System.out.println("var_private=%d\n",p.var_private);
		System.out.println(p.var_default);
		System.out.println(p.var_protected);
		System.out.println(p.var_public);
	}

}
