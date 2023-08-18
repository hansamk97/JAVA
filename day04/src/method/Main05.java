package method;

public class Main05 {

	/*
	 *  사칙연산 메서드 생성
	 *   -> +, -, *, / 각각의 메서드 생성(4건), return, param int 2개,
	 *   -> main()에서 각각 메서드 호출 return 결과 출력
	 */
	
	
	public static void main(String[] args) {
		System.out.println(plus(10, 10));
		System.out.println(minus(10, 10));
		System.out.println(times(10, 10));
		System.out.println(divide(10, 10));
		
	}
	
	public static int plus(int x, int y) {
		return x + y;
	}
	public static int minus(int x, int y) {
		return x - y;
	}
	public static int times(int x, int y) {
		return x * y;
	}
	public static int divide(int x, int y) {	// 소수점까지 원하는지 물어봐야한다.
		int result = 0;							// 0 넣었을 때 error => 개발자 필수 체크사항
		if(  y != 0 ) {
			result = x / y;
		}
		return x / y;
	}
}






