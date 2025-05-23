package java013_api;

import static java.lang.Math.*;

//난수를 이용해서 소수점 첫째자리까지 반올림해서 구하시오.
//ex) 0.5689....   =>5.7

public class Java141_Math {
	public static void main(String[] args) {
		double nan = random();
		System.out.println(nan);

		nan = nan * 100;
		System.out.println(nan);

		long data = round(nan);
		System.out.println(data);

		double val = (double) data / 10;
		System.out.println(val);

		System.out.println((double) round(random() * 100) / 10);

	}

}
