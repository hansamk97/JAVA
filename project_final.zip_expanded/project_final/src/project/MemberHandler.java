package project;

import java.util.*; // 끝을 *로 하면 java.util 패키지의 모든 클래스를 쓸 수 있다.

public class MemberHandler {

	private MemberInfo[] members;
	private int idx;

	public MemberHandler(int num) {
		members = new MemberInfo[num];
		idx = 0;
	}

	public void memberInsert() { // 회원가입용 메서드
		String id, pw, name;
		Scanner scanner = new Scanner(System.in);
		System.out.print("아이디 : ");
		id = scanner.nextLine();
		if (!isUniqueID(id)) { // 아이디가 중복되었으면
			System.out.println("이미 사용중인 아이디 입니다. \n");
			return;
		}
		System.out.print("암 호 : ");
		pw = scanner.nextLine();
		System.out.print("이 름 : ");
		name = scanner.nextLine();
		members[idx] = new MemberInfo(id, pw, name);
		idx++;
		System.out.println("\n");
		System.out.println("\t 가입 완료! \t\n");
	}

	private boolean isUniqueID(String id) { // 아이디의 중복 여부를 리턴
		if (idx == 0) {
			return true;
		}
		for (int i = 0; i < idx; i++) {
			if (members[i].getId().equals(id)) {
				return false;
			}
		}
		return true;
	}

	// 로그인 메서드
	public void memberLogin() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("아이디 : ");
		String id = scanner.nextLine();
		System.out.print("패스워드 : ");
		String pw = scanner.nextLine();
		String msg = "존재하지 않는 아이디 입니다.";

		for (int i = 0; i < idx; i++) {
			if (members[i].getId().equals(id)) {// members배열에 입력한 아이디가 있으면
				if (members[i].getPw().equals(pw)) {
					msg = "로그인 되었습니다.";
				} else {
					msg = "암호가 잘못되었습니다.";
				}
			}
		}

		System.out.println(msg);

		if (msg.equals("로그인 되었습니다.")) {
			chooseDate();
		} else {
			memberLogin();
		}
	}

	// 날짜 선택 메서드
	public void chooseDate() {

		Scanner scanner = new Scanner(System.in);

		System.out.print("연도 입력 : ");
		int year = scanner.nextInt();
		if (year < 1) {
			System.out.println("정확히 입력해주세요.");
			year = scanner.nextInt();
			if (year < 1) {
				System.out.println("정확히 입력해주세요.");
				year = scanner.nextInt();
			} else {
				System.out.print("월 입력 : ");
				int month = scanner.nextInt();

				DayOfCalendar.calendarUp(year, month);

				System.out.println("\n");
			}
		} else {
			System.out.print("월 입력 : ");
			int month = scanner.nextInt();

			DayOfCalendar.calendarUp(year, month);

			System.out.println("\n");

			System.out.println("예약할 날짜 선택 : ");
			int day = scanner.nextInt();

			System.out.println(day + "일로 예약 완료");
		}
	}

}
