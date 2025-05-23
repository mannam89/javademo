package java014_api;

import java.text.SimpleDateFormat;

public class Java154_System {
	public static void main(String[] args) {
		System.out.println(60*60*24);
		
		//System.currentTimeMillis() : 1970. 1. 1 부터 초단위로 누적
		long curr = System.currentTimeMillis();
		System.out.println(curr);
		//				  2025-05-20	11:15:16 오전 화요일
		String pattern = "yyyy-MM-dd	HH:mm:ss a EEEE";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String dateTime = sdf.format(curr);
		System.out.println(dateTime);
	}

}
