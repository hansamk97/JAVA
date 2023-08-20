package toy_membership;

import java.util.*;


import cal.DayOfCalendar;


public class MemberManage extends DayOfCalendar{

	public static void main(String[] args) {
		
		int date[] = new int[31];
		date[0] = 1;
		
		MemberHandler handler = new MemberHandler(100);

		while ( true ) {
			System.out.println("------- 메뉴 선택 -------");
			System.out.println("1. 회원가입");
			System.out.println("2. 로 그 인");
			System.out.println("3. 프로그램 종료");

			Scanner scanner = new Scanner(System.in);
			int choice = scanner.nextInt();

			switch ( choice ) {
			case 1:
				handler.memberInsert();
				break;
			case 2:
				handler.memberLogin();
				break;
			case 3:
				System.out.println("프로그램 종료");
				return;
			}

			  System.out.print("연도 입력 : "); 
			    int year = scanner.nextInt(); 
			    if( year<1 ) {
			    	System.out.println("정확히 입력해주세요.");
			    	year = scanner.nextInt();
			    	if(year<1) {
			    		System.out.println("정확히 입력해주세요.");
				    	year = scanner.nextInt();
			    	}else {
			    	System.out.print("월 입력 : "); 
			    	int month = scanner.nextInt(); 
			    	
			    	DayOfCalendar.prn(year,month); 
			    	
			    	System.out.println("\n");
			    	}
			    }else {
			    	System.out.print("월 입력 : "); 
			    	int month = scanner.nextInt(); 
			    	
			    	DayOfCalendar.prn(year,month); 
			    	
			    	System.out.println("\n");
			    	

			
				
			    }
			
			    int day = scanner.nextInt();
			    System.out.println("예약할 날짜 선택 : " );
			    System.out.println(day + "일로 예약 완료");
			    System.out.println("-----------------");
			    System.out.println("-----------------");
			    System.out.println("-----------------");
			    System.out.println("-----------------");
		}
	    
	  
		
	}

}
