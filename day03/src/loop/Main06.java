package loop;

public class Main06 {

	public static void main(String[] args) {
		int result = 0;
		int i = 1;
		
		do {
			result = 7 * i;
			i++;
			System.out.println(result);
		}while( i < 10 ); 
	}

}
