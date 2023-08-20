package patternchecker;

import java.util.regex.Pattern;

public class RegexHelper {	// 밸리데이션
	// 싱글톤 객체  만들 줄 알아야함!
	
	private static RegexHelper current;
	public static RegexHelper getInstance() {
		if(current == null) {
			current = new RegexHelper();
		}
		return current;
	}
	public static void freeInstance() {
		current = null;
	}	
		
	/*
	 *  주어진 문자열이 공백이거나, null인지를 검사
	 *  @param str	- 검사할 문자열
	 *  @return		- 공뱃, null이 아닐 경우 true 리턴
	 */
	public boolean isValue( String str ) {
		boolean result = false;
		if( str != null ) {
			result = str.trim().equals("");
		}
		return result;
	}
	
//	String m = "비가 온다.";
//	
//	boolean word = Pattern.matches("^[0-9]*$", m);
//	
//		if( !word ) {
//			System.out.println( "문자를 입력하시오" );
//			return;
//		}
//	
	/*
	 *  숫자 모양에 대한 형식 검사(공백, null 체크)
	 */
	public boolean isNum( String str ) {
		boolean result = false;
		if( isValue(str) ) {
			result = Pattern.matches("^[0-9]*$", str);
		}
		return result;
	}
//	boolean num = Pattern.matches("^[0-9]*$", m);
//		if( !num ) {
//			System.out.println("숫자를 입력하시오");
//			return;
//		}
	/*
	 *  영문으로만 구성되었는지에 대한 형식 검사(공백, null 체크)
	 */
	public boolean isEng( String str ) {
		boolean result = false;
		if( isValue(str) ) {
			result = Pattern.matches("^[a-zA-Z]*$", str);
		}
		return result;
	}
//	boolean eng = Pattern.matches("^[a-zA-Z]*$"
//, m);
//	if( !eng ) {
//		System.out.println("영어를 입력하시오");
//		return;
//	}
	/*
	 *  한글로만 구성되었는지에 대한 형식 검사(공백, null 체크)
	 */
	public boolean isKor( String str ) {
		boolean result = false;
		if( isValue(str) ) {
			result = Pattern.matches("^[ㄱ-ㅎ가-힣]*$", str);
		}
		return result;
//	boolean kor = Pattern.matches("^[ㄱ-ㅎ가-힣]*$"
//
//			, m);
//			if( !eng ) {
//			System.out.println("영어를 입력하시오");
//					return;
//				}
	
	}	
}

