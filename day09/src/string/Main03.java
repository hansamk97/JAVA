package string;

public class Main03 {

	public static void main(String[] args) {
		// 이메일 주소에서 아이디와 도메인 구별하기
		// split 사용 금지
		// student@java.com
		// 이메일 주소 : student
		// 도메인 주소 : java.com
		// 강사 풀이
		String email = "student@java.com";
		// "@"가 나타나는 위치를 얻기
		int s = email.indexOf("@");
		
		// 처음부터 "@"가 나타나는 위치까지 자르기 -> 아이디
		String email_id = email.substring(0, s);
		
		// "@"가 나타나는 위치 다음부터 끝까지 자르기 -> 도메인
		String email_domain = email.substring(s+1);
		
		// 자릿수는 바뀔 수 있기때문에 자릿수를 지정해선 안된다.
		System.out.println("아이디 : " + email_id);
		System.out.println("도메인 : " + email_domain);
	}
}
