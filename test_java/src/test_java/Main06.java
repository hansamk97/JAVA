package test_java;

public class Main06 {

	public static void main(String[] args) {
		
		int[][] arr = {
				{ 5, 5, 5, 5, 5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}
				};
		
		
		
		for( int i=0; i<arr.length; i++ ) {
			int sum = 0;
			int avg = 0;
			for( int j=0; j<i; i++) {
				sum += arr[i][j];
			}
			avg = sum / arr[i].length;
			System.out.println("total = " + sum);
			System.out.println("average = "+ avg);
		}
		
		
		
	}

}
