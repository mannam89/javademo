package java008_static_access.part06;
import java008_static_access.part05.Java088_access;

public class Java090_access extends Java088_access {
	public static void main(String[] args) {
		// package가 다른 클래스를 접근할때는 public일때만 가능하다.
		// 그러나 상속관계일때는 protected일때에도 접근이 가능하다.
			Java088_access p =new Java088_access();
//			System.out.println(p.var_private);
//			System.out.println(p.var_default);
//			System.out.println(p.var_protected);
//			System.out.println(p.var_public);
			
			
			Java090_access ps =new Java090_access();
//			System.out.println(ps.var_private);
//			System.out.println(ps.var_default);
			System.out.println(ps.var_protected);
			System.out.println(ps.var_public);
	}

}
