package condition;

public class Main07 {

	public static void main(String[] args) {

		int math = 80;
		
		/* 삼항연산자
		 *  수학점수가 90점 이상이면 Pass, 그렇지 않으면 Fail
		 */
		
		String grade = (math >= 90) ? "Pass" : "Fail";
		System.out.println("grade : " + grade);

		
		
	}

}
