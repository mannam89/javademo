package java014_api;

import java.util.Calendar;

public class Java155_Calendar {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);

		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int date = cal.get(Calendar.DATE);

		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);

		System.out.printf("%d-%d-%d  %d:%d:%d\n", year, month, date, hour, min, sec);

		System.out.println(cal.getActualMaximum(Calendar.DAY_OF_MONTH));

		// 오늘의 요일 리턴(일요일 -> 1, 토요일 -> 7)
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));

		// 오늘 기준으로 5일전 날짜 지정
		cal.add(Calendar.DATE, -5);
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH);
		date = cal.get(Calendar.DATE);
		System.out.printf("%d-%d-%d  %d:%d:%d\n", year, month, date, hour, min, sec);

		cal.set(2025, 0, 1); //2025. 1. 1
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH);
		date = cal.get(Calendar.DATE);
		System.out.printf("%d-%d-%d  %d:%d:%d\n", year, month, date, hour, min, sec);
		
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));

	}

}
