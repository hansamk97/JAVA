package string;

public class Main06 {

	public static void main(String[] args) {
		/*
		 *  D:/photo/2023/travel/food.jpg 라는 파일이 있다
		 *  이 파일의 경로를 data라는 객체로 생성한 뒤에, 다음의 형태로 출력
		 *  단, split()메서드 사용 금자
		 *  -----------------------------------------
		 *  파일 이름	: food
		 *  확장자 	: jpg
		 *  폴더명	: D:/photo/2023/travel
		 *  
		 */
		
		String data = "D:/photo/2023/travel/food.jpg";
		
		int s = data.indexOf("/");
		
		String data_fileName = data.substring(21, 25);
		System.out.println(data_fileName);

		String data_ex = data.substring(26);
		System.out.println(data_ex);
		
		String data_folder = data.substring(0, 20);
		System.out.println(data_folder);
		
//		String data = "D:/photo/2023/travel/food.jpg";
//		String[] data_s = data.split("/");
//		
//		
//		for( int i=0; i<data_s.length; i++ ) {
//			System.out.println(data_s[i]);
//		}
	}
	}













