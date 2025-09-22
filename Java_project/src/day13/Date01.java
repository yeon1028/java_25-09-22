package day13;

import java.util.Calendar;
import java.util.Date;

public class Date01 {

	public static void main(String[] args) {
		// 날짜 시간 클래스
		/* Date 클래스 -> Deprecated(비권장)
		 * Calendar 클래스 / LocalDateTime
		 */
		
		Date date = new Date();
		System.out.println(date);
		
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.YEAR));
		// 월 0~11까지 표현 >> +1 붙여야함
		System.out.println(c.get(Calendar.MONTH)+1);
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		// 일요일부터 시작(일(1) ~ 토(7))
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		System.out.println(c.get(Calendar.DAY_OF_YEAR));
		
		// 2025-9-11 (목)
		int year = c.get((Calendar.YEAR));
		int month = c.get(Calendar.MONTH)+1;
		int day = c.get(Calendar.DAY_OF_MONTH);
		int dayWeek = c.get(Calendar.DAY_OF_WEEK);
		String weekString = "";
		switch(dayWeek) {
		case 1: weekString= "일"; break;
		case 2: weekString= "월"; break;
		case 3: weekString= "화"; break;
		case 4: weekString= "수"; break;
		case 5: weekString= "목"; break;
		case 6: weekString= "금"; break;
		case 7: weekString= "토"; break;
		}
		
		System.out.println(year+"-"+month+"-"+day+" ("+weekString+") ");
		
		int hour = c.get(Calendar.HOUR);
		int minute = c.get(Calendar.MINUTE);
		int second= c.get(Calendar.SECOND);
		System.out.println(hour+":"+minute+":"+second);
		
		// am,pm => 0(am) 1(pm)
		System.out.println(c.get(Calendar.AM_PM));
		
		// 오후 2:48:13
		int ampm = c.get(Calendar.AM_PM);
		String ampmString = "";
		switch(ampm) {
		case 0: ampmString = "오전"; break;
		case 1: ampmString = "오후"; break;
		}
		
		System.out.println(ampmString+" "+hour+":"+minute+":"+second);
		
		
	}

}
