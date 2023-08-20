package toy_mem;

import java.util.Scanner;

import cal.DayOfCalendar;
import cal.MTest;
//import calendar.CalendarPrint;

public class LoginApplication extends MTest{
	private static int usernum = 0;
	private static User user[] = new User[10];
	private static Scanner scanner = new Scanner(System.in);
	private static String inputId, inputPassword, inputNickname;

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			user[i] = new User();
		} // NullpointerException방지 배열 초기화
		
		boolean run = true;

		if( run = true ) {
			
		}
		do {
//		while(run) {
			System.out.println("원하는 메뉴를 숫자로 입력하여 선택하세요: ");
			System.out.println("1.회원가입 2.로그인 3.사용자조회 4.탈퇴 5.종료");
			System.out.print("선택 > ");
			
			int select = scanner.nextInt();
			if (select == 1) { // 회원가입 선택
				if (usernum == 10) {
					System.out.println("용량 초과 회원가입 실패");
					break;
				} else
					createAccount();
			} else if (select == 2) { // 로그인 선택
				loginAccount();
			} else if (select == 3) { // 사용자조회 선택
				lookAccount();
			} else if (select == 4) { // 탈퇴 선택
				deleteAccount();
			} else { // 종료 선택
				run = false;
			}
//		}
		} while (run);
		System.out.println("프로그램 종료");
	
	}
	private static void createAccount() { // 회원가입 선택
		System.out.print("아이디를 입력하세요 : ");
		inputId = scanner.next();
		user[usernum].setId(inputId);
		System.out.print("비밀번호를 입력하세요 : ");
		inputPassword = scanner.next();
		user[usernum].setPassword(inputPassword);
		System.out.print("닉네임을 입력하세요 : ");
		inputNickname = scanner.next();
		user[usernum].setNickname(inputNickname);

		usernum++;
	}

	private static void loginAccount() { // 로그인 선택
		System.out.print("아이디를 입력하세요 : ");
		inputId = scanner.next();
		System.out.print("비밀번호를 입력하세요 : ");
		inputPassword = scanner.next();

		int loginSuccess = 0;
		for (int i = 0; i < user.length; i++) {
			if (inputId.equals(user[i].getId()) && inputPassword.equals(user[i].getPassword())) {
				System.out.println("로그인 성공");
				System.out.println("아이디 : " + user[i].getId() + " " + "닉네임 : " + user[i].getNickname());
				loginSuccess = 1;
				break;
			}
		}
		
		
		
		
//	    Scanner scanner = new Scanner(System.in); 
	    
		
		// calendar
	    System.out.print("연도 입력 : "); 
	    int year = scanner.nextInt(); 

	    System.out.print("월 입력 : "); 
	    int month = scanner.nextInt(); 

	    DayOfCalendar.prn(year,month); 
	    
	    System.out.println("\n");
		
//		int date = scanner.nextInt();
		int[] day = new int[10];
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int year = 0;
//		int month = 0;
		
//        Scanner sc = new Scanner(System.in);		
//		if(loginSuccess == 1) {
//			System.out.println("년도를 선택하세요 : ");
//			year=sc.nextInt();
//			
//		System.out.println("월을 입력하세요 : ");
//	        month=sc.nextInt();
//		}
		
//		try{
//            // 입력받은 year와 month를 매개변수로 객체 및 데이터 생성
//            CalendarPrint cal = new CalendarPrint(year, month);
//            // System.out 콘솔에 출력
//            cal.printCal();
//           
//        }catch(Exception e){
//            e.printStackTrace();
//        }
			
		if (loginSuccess == 0)
			System.out.println("로그인 실패");
	}

	private static void lookAccount() { // 사용자조회 선택
		for (User users : user) {
			if (users.getNickname() != null)
				System.out.println(users.getNickname());
		}
	}

	private static void deleteAccount() { // 탈퇴 선택
		System.out.print("아이디를 입력하세요 : ");
		inputId = scanner.next();
		System.out.print("비밀번호를 입력하세요 : ");
		inputPassword = scanner.next();
		int deleteSuccess = 0;
		for (int i = 0; i < user.length; i++) {
			if (inputId.equals(user[i].getId()) && inputPassword.equals(user[i].getPassword())) {
				System.out.println("탈퇴 성공");
				user[i].setId(null);
				user[i].setPassword(null);
				user[i].setNickname(null);
				deleteSuccess = 1;
			}
		}
		if (deleteSuccess == 0)
			System.out.println("일치하는 정보 없음");
	}

}
