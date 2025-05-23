package java013_api;

public class Java152_Wrapper {
	public static void main(String[] args) {
		String sn = "korea12 paran3";
		int cnt = 0;
		
		
//		for(int i = 0;i<sn.length();i++) {
//			char data = sn.charAt(i);
//			if(data >='0' && data<='9') {
//				cnt++;
//			}
//		}
		
		
//		for(int i = 0;i<sn.length();i++) {
//			char data = sn.charAt(i);
//			if(Character.isDigit(data)) {
//				cnt++;
//			}
//		}
		
		
		char[] line = sn.toCharArray();
		for(char data : sn.toCharArray()) {
			if(Character.isDigit(data))
				cnt++;
		}
		
		System.out.println("숫자갯수:"+cnt);
		
		
	}

}
