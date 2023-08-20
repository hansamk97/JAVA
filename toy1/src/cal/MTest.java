package cal;

import java.util.Scanner; 

// MTest클래스는 연도와 월을 입력받고 DayOFCalendar클래스의 prn메소드를 호출하여 해당 월을 출력하는 메소드입니다.
public class MTest extends DayOfCalendar {

		public static void main(String[] args) { 
			
			int date[] = new int[31];
			date[0] = 1;
			
			
			Scanner scanner = new Scanner(System.in); 
		    
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
		    	

		  
		
		    	System.out.println("예약할 날짜 선택 : " );
		    	int day = scanner.nextInt();
		    	System.out.println(day + "일로 예약 완료");
		    	
				
		    }
		
	}

}
