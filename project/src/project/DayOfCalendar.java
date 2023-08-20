package project;

public class DayOfCalendar {

	private static boolean isLeapYear(int year) {
		boolean leap = false;

		if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
			leap = true;
		}
		return leap;
	}

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

	private static int getDayOfWeek(int year, int month) {
		int dayOfWeek = 0;
		int sum = 0;

		for (int i = 1; i < year; i++) {
			for (int j = 1; j <= 12; j++) {
				sum += getDate(i, j);
			}
		}

		for (int k = 1; k < month; k++) {
			sum += getDate(year, k);
		}

		sum += 1;

		dayOfWeek = sum % 7;

		return dayOfWeek;
	}

	public static void calendarprint(int year, int month) {

		System.out.printf("\t\t%d년 %d월\n", year, month);
		System.out.printf("일\t월\t화\t수\t목\t금\t토\n");

		int start = DayOfCalendar.getDayOfWeek(year, month);

		int last = getDate(year, month);

		for (int i = 1; i <= start; i++) {
			System.out.print("\t");
		}

		for (int i = 1; i <= last; i++) {
			System.out.printf("%d\t", i);
			start++;
			if (start % 7 == 0) {
				System.out.println();
			}
		}

	}
}
