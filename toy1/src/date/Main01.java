package date;

import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;

//import java.util.Calendar;
//import java.util.GregorianCalendar;
//import java.util.Date;

public class Main01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// Calendar 클래스는 추상 클래스라 new 키워드로 인스턴스 생성이 불가하다.
		// cToday Calendar 객체 생성
//		Calendar cToday = Calendar.getInstance();
		
		// cToday에 Date 객체로 시간 설정
//		cToday.setTime(new Date());
		int inputYear, inputMonth = 0;
		String weekDay1st;
		String[] weekDays = {"일", "월", "화", "수", "목", "금", "토"};
		
		try
		{
		System.out.println("연도 입력 : ");
		inputYear = new Scanner(System.in).nextInt();
		
		System.out.println("월 입력 : ");
		inputYear = new Scanner(System.in).nextInt();
		}
		catch (InputMismatchException e)
		{
			System.out.println("!! 정수만 입력하세요.");
			return;
		}
		
		Calendar cal = Calendar.getInstance();
		cal.set(cal.YEAR, 2022);
		cal.set(cal.MONTH, inputMonth);
		
		System.out.println(cal.getTime());
		System.out.println(cal.get(cal.MONTH));
	}

}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	