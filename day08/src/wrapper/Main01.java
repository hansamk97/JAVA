package wrapper;

public class Main01 {

	public static void main(String[] args) {
		String a = "20";
		String b = "3.14";
		
		/*
		 * wrapper class의 가장 중요한 기능은 특정 데이터형의 모양을 하고 있는 문자열을
		 *  실제 데이터 형으로 변환하는 기능이다.
		 */
		
		int num_a = Integer.parseInt(a);
		float num_b = Float.parseFloat(b);		
		
		// 변환된 값은 사칙연산이 가능해진다
		int v1 = num_a + 500;
		float v2 = num_b + 500;
		System.out.println("v1 : " + v1);
		System.out.println("v2 : " + v2);
		
		Integer i = new Integer(10);
		
		
			
	}

}












