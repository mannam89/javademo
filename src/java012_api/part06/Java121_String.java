package java012_api.part06;

public class Java121_String {
	public static void main(String[] args) {
		String str = new String("KoREa,jsp,java");
		System.out.println("문자열 길이:" + str.length());
		System.out.println("UpperCase:" + str.toUpperCase());
		System.out.println("lowerCase:" + str.toLowerCase());
		System.out.println("Character:" + str.charAt(0));
		System.out.println("Character:" + str.charAt(5));
		System.out.println("인덱스:" + str.indexOf('a'));
		System.out.println("인덱스:" + str.indexOf(97));
		System.out.println("인덱스:" + str.indexOf('a', 5));
		System.out.println("인덱스:" + str.indexOf(97, 5));

		System.out.println("인덱스:" + str.indexOf("jsp"));
		// 검색 문자열이 없으면 -1을 리턴한다.
		System.out.println("인덱스:" + str.indexOf("jsp", 7));

		// 5인덱스부터 마지막까지 문자열 리턴
		System.out.println("인덱스:" + str.substring(5));
		// 2인덱스부터 마지막까지 문자열 리턴
		System.out.println("인덱스:" + str.substring(2, 8));

		// 메모리에 저장된 문자열을 ","로 구분해서 문자열 배열로 리턴
		String[] arr = str.split(",");
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d]=%s\n", i, arr[i]);
		}

		int x = 10;
		int y = 20;

		System.out.printf("x=%d, y=%d\n", x, y);
		
		String s1=String.valueOf(x);
		String s2=String.valueOf(y);
		System.out.println(s1+s2);
		
		char[] data= {'1','2','3','4','5'};
		String s3=String.valueOf(data);
		System.out.println(s3);
		
		String s4=String.valueOf(data,2,3);
		System.out.println(s4);

	}

}
