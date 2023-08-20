package project;

import java.util.*;

import project.DayOfCalendar;

public class MemberManage {

	public static void main(String[] args) {

		MemberHandler handler = new MemberHandler(100);

		while (true) {

			System.out.println("---- 풋살 예약 프로그램 ----");
			System.out.println("------- 메뉴 선택 -------");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 종료");

			try {
				Scanner scanner = new Scanner(System.in);
				int choice = scanner.nextInt();

				switch (choice) {

				case 1:
					System.out.println("------------------");
					handler.memberInsert();
					break;

				case 2:

					System.out.println("------------------");
					handler.memberLogin();
					break;

				case 3:
					System.out.println("------------------");
					System.out.println("프로그램 종료");
					return;
				}
			} catch (Exception e) {
				System.out.println("잘못 입력했습니다.");
			}
		}
	}
}
