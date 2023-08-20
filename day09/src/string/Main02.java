package string;

public class Main02 {

	public static void main(String[] args) {
		// 이메일 주소에서 아이디와 도메인 구별하기
		// split 사용 금지
		// student@java.com
		// 이메일 주소 : student
		// 도메인 주소 : java.com
		// 내 풀이
		String str1 = new String("student@java.com");
		String str1_id = str1.substring(0, 7);
		String str1_dm = str1.substring(8);
		
		System.out.println("아이디 : " + str1_id);
		System.out.println("도메인 : " + str1_dm);
		
	}

}
