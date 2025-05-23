package java013_api;

public class Java134_StringBuffer {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("java test");
		System.out.println(sb);
		System.out.println(sb.toString());
		
		sb.insert(4, "jsp");
		System.out.println(sb);
		
		sb.delete(4,7);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		String data="mybatis orm";
		StringBuffer sf =new StringBuffer(data);
		sf.reverse();
		System.out.println(sf);
		String ss= sf.toString();
		System.out.println(ss);
		
		char[] arr = {'k','o','r','e','a'};
		StringBuffer sk = new StringBuffer(new String(arr));
		System.out.println(sk.reverse());
		
		StringBuffer se = new StringBuffer(String.valueOf(arr));
		System.out.println(se.reverse());
		
		String sp = se.toString();
		char[] val=sp.toCharArray();
		System.out.println(val);
		System.out.println(se.toString().toCharArray());
		
		
	}

}
