package test_java;

public class Main01 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
		// 1부터 100까지의 홀수 합
		while( true ) {
			i++;
			if( i%2 != 0 && i%3 != 0) {
				continue;
			}
			if( i>=20 ) {
				break;
			}
			sum += i;
//			System.out.println(i);
		}
		System.out.println(sum);
	}
}
