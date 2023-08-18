package loop;

public class Main03 {

	public static void main(String[] args) {
		/*
		 *  1. 구구단 2단 ~ 9단까지의 결과를 출력
		 *  	(단, 2중 for문 사용.)
		 *  출력 : 2 * 1 = 2
		 *  	 2 * 2 = 4
		 *  	 ...
		 *  	 2 * 9 = 19
		 *  	 -----------------
		 *  	 ...
		 *  	 9 * 9 = 81
		 */
	
		for( int i = 2; i<10; i++ ) {
			for( int j = 1; j<10; j++ ) {
				System.out.println(i + "x" + j + "=" + (i * j));
			}
		}
		
		System.out.println("------------------------");
		/*
		 *  2. 8 * 8열 별 찍기
		 *  ★★★★★★★★
         	★★★★★★★★
         	★★★★★★★★
         	★★★★★★★★
         	★★★★★★★★
         	★★★★★★★★
         	★★★★★★★★
         	★★★★★★★★
		 *  */
//		char[][]star = new char[8][8];
		for( int i = 0; i<8; i++ ) {
			for( int j = 0; j<8; j++ ) {
				System.out.print("★");
			}System.out.println("");
		}
		
		
		
		System.out.println("------------------------");
		/*
		 *  3. 8 * 8 별 찍기
		 *  ★★★★★★★★
         	★★★★★★★
         	★★★★★★
         	★★★★★
         	★★★★
         	★★★
         	★★
         	★
		 */
//		char[][]star1 = new char[8][8];
		for( int i = 8; i>0; i-- ) {
			for( int j = 0; j<i; j++ ) {
				System.out.print("★");
			}System.out.println("");
		}
		
		System.out.println("------------------------");
		
		/*
		 *  4. 별찍기
		 * 	★
         	★★
         	★★★
         	★★★★
         	★★★★★
         	★★★★★★
         	★★★★★★★
         	★★★★★★★★

		 */
//		char[][]star2 = new char[8][8];
		for( int i = 0; i<8; i++ ) {
			for( int j = 0; j<i; j++ ) {
				System.out.print("★");
			}
			System.out.println("");
		}
		
		
		
		
		
		
	}

	}
