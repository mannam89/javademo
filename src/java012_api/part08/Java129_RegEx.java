package java012_api.part08;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Java129_RegEx {
	public static void main(String[] args) {
		String sn = "12345";
		String st = "aetwef";

		// a-zA-Z_*$가 sn변수에 포함되어 있으면 true 아니면 false를 리턴한다.
		// [ ]은 or을 의미한다.
		// . 임의 문자이고 .*을 임의 문자 여러개(0개 이상)를 의미한다.
		System.out.println(sn.matches(".*[a-zA-Z_*$].*"));

		// sn변수에 숫자 0-9가 포함되어 있으면 true 아니면 false를 의미한다.
		System.out.println(sn.matches(".*[0123456789].*"));
		System.out.println(sn.matches(".*[0-9].*"));
		System.out.println(sn.matches(".*[\\d].*"));
		System.out.println(sn.matches(".*\\d.*"));

		// ^의 의미는 not
		// sn변수에 숫자 0-9가 포함되어 있지 않으면 true 포함되어 있으면 false를 의미한다.
		System.out.println(sn.matches(".*[^0123456789].*"));
		System.out.println(sn.matches(".*[^0-9].*"));
		System.out.println(sn.matches(".*[\\D].*"));
		System.out.println(sn.matches(".*\\D.*"));

		String sb = "bscba5";
		// sb변수에 저장된 값이 2로 시작되면 true 아니면 false를 리턴한다.
		System.out.println(sb.matches("2.*"));

		// 2로 시작되고 5로 끝나면 true 아니면 false를 리턴한다.
		System.out.println(sb.matches("2.*5"));

		// sb변수에 저장된 값이 'a' 이거나 'b'로 시작하고 임의문자 5개가 오면 true 아니면 false를 리턴한다.
		System.out.println(sb.matches("[ab].{5}"));

		System.out.println("======Patter======");

		String input = "3a4bsfa";
		System.out.println(input.matches("\\d"));

		Pattern pn = Pattern.compile("\\d");
		Matcher mc = pn.matcher(input);
		System.out.println(mc);
		System.out.printf("%b %s\n", mc.find(), mc.group());
		// 0인덱스부터 검색을 시작한다.
		System.out.printf("%b %s\n", mc.find(0), mc.group());
		// 1인덱스부터 검색을 시작한다.
		System.out.printf("%b %s\n", mc.find(1), mc.group());
		// 2인덱스부터 검색을 시작한다.
		System.out.printf("%b %s\n", mc.find(2), mc.group());

		// 3인덱스부터는 패턴에서 지정한 데이터가 없기 때문에 Exception이 발생한다.
//		System.out.printf("%b %s\n",mc.find(3),mc.group());

		
		String str = "The BEst things in best life are best free";
		boolean res = Pattern.compile("best").matcher(str).find();
		System.out.println(res);

		
		Pattern ptPattern = Pattern.compile("best", Pattern.CASE_INSENSITIVE);
		Matcher mhMatcher = ptPattern.matcher(str);
		System.out.println(mhMatcher);

	}

}
