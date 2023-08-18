package loop;

public class Main02 {

	public static void main(String[] args) {
		// 7의 배수를 출력
		int sum = 0;
		
		for( int i = 1; i<10; i++ ) {	// for문 밖에 있으면 하나만 실행
			sum = 7 * i;				// for문 안에 있으면 반복적으로 실행
			System.out.println(sum);
		
		}
				
	}

}
