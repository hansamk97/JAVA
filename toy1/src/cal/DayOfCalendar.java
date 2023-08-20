package cal;

import java.util.Scanner;

public class DayOfCalendar {
	// 윤년 계산
	// 위의 코드는 윤년인지 평년인지 판별해 주는 코드입니다.
	// DayIfCalendar 클래스 안에 isLeapYear 메소드로 구현하였습니다.
	// 아직 만들어지지는 않았지만 int 타입의 year를 외부에서 불러와 year가 윤년의 조건
	// ( (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0) )이 맞으면 ture / 아니면 false가 리턴되는 코드입니다.
	private static boolean isLeapYear(int year) {
		boolean leap = false;

		if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
			leap = true;
		}
		return leap;
	}
	// getDate()메소드는 1월부터 12월까지 해당 월이 며칠까지 있는지를 리턴해주는 코드입니다.
	// 윤년일 경우 2월이 29일 평년일 경우 2월이 28일까지이기 때문에 구분하여 리턴해야 합니다.
	// 윤년일 경우는 switch를 사용하여 해당 월의 일수를 리턴하도록 만들었고 평년의 경우는 if 문을 이용해 해당 월의 일수를 리턴하도록 만들었습니다.
	private static int getDate(int year, int month) {
		int tmp = 0;

		if (isLeapYear(year)) {

			switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				tmp = 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				tmp = 30;
				break;
			case 2:
				tmp = 29;
				break;
			}
		} else {
			if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
				tmp = 31;
			} else if (month == 4 || month == 6 || month == 9 || month == 11) {
				tmp = 30;
			} else if (month == 2) {
				tmp = 28;
			}
		}
		return tmp;
	}

	// 해당 월의 첫번쨰 요일 계산
	// getDayOfWeek()메소드는 조금 복잡할 수 있는데요.
	// 입력한 연도와 월을 받아와서 해당 월의 시작 요일을 계산하기 위한 코드입니다.
	// 예를 들어 2020년 12월을 출력하고자 하면 1년 1월 1일부터 2020년 11월 30일까지의 일수를 다 더하면 12월 1일이 무슨 요일인지 알 수 있습니다.
	// 그래서 1년 1월 1일부터 2020년 11월 30일까지의 일수를 계산하는 코드인데 편의상 1년 1월 1일부터 2019년 12월 31일까지 계산하고
	// 2020년 1월 1일부터 2020년 11월 30일까지 계산하는 코드로 나눠놨습니다.
	private static int getDayOfWeek(int year, int month) {
		int dayOfWeek = 0;
		int sum = 0;

		// 1.1.1 ~ year-1.12.31
		// 얘가 getDate()를 이용해서 반복문을 수행하면 1.1.1부터 2019.12.31까지 계산해 줍니다.
		for (int i = 1; i < year; i++) {
			for (int j = 1; j <= 12; j++) {
				sum += getDate(i, j);
			}
		}

		// year.1.1 ~ year.month-1.마지막(31,30.29.28)
		// 얘는 2020.1.1부터 2020.11.30까지 계산해 줍니다.
		for (int k = 1; k < month; k++) {
			sum += getDate(year, k);
		}

		// year.month.1일
		// 이 코드는 1.1.1부터 2020.11.30일까지 일수에 1을 더해야 2020.12.1의 요일을 알 수 있겠죠?
		// 그래서 sum에 1을 더하고 7로 나눈 나머지를 보면 해당 요일을 알 수 있습니다.
		sum += 1;

		// 요일
		dayOfWeek = sum % 7;

		return dayOfWeek;
	}

	public static void prn(int year, int month) {
		
		// 달력 윗부분 출력
		// prn메소드는 위에서 계산했던 것들을 출력시켜주기 위한 메소드입니다.
		// 달력 모양으로 달력을 이쁘게 출력하기 위함입니다.
		System.out.printf("\t\t%d년 %d월\n", year, month);
		System.out.printf("일\t월\t화\t수\t목\t금\t토\n");

		// 시작 요일
		// getDayOfWeek메소드가 해당 월의 시작 요일을 계산해 주는 메소드였습니다.
		int start = DayOfCalendar.getDayOfWeek(year, month);

		// 마지막 날짜
		// getDate는 해당 월이 윤년인지 아닌지 판단해서 해당 월이 며칠까지 있는지를 계산해 주는 메소드였습니다.
		int last = getDate(year, month);

		// 시작 요일만큼 빈공간.
		// 달력이 출력될 때 시작되는 요일에 맞게 빈 공간을 출력시켜주기 위한 반복문입니다.
		for (int i = 1; i <= start; i++) {
			System.out.print("\t");
		}

		// 달력출력
		// 빈 공간 이후부터 1일부터 해당 월이 가진 일수만큼 달력을 출력해 줍니다.
		for (int i = 1; i <= last; i++) {
			System.out.printf("%d\t", i);
			start++;
			if (start % 7 == 0) {
				System.out.println();
			}
		}
		
		
	}
}
