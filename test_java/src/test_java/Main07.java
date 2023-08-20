package test_java;

import java.util.Scanner;

public class Main07 extends Calc {

	public static void main(String[] args) {
		
		Calc c = new Calc();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름 : ");
		String name = scanner.nextLine();
		System.out.println(name);
		
		System.out.println("처음 수 입력 : ");
		int a = scanner.nextInt();
		System.out.println(a);
		
		System.out.println("두번째 수를 입력하세요 : ");
		int b = scanner.nextInt();
		System.out.println(b);
		
		System.out.println("이름 : " + c.getName());
		System.out.println("plus : " + c.plus(a, b));
		System.out.println("minus : " + c.minus(a, b));
		System.out.println("times : " + c.times(a, b));
		System.out.println("divide : " + c.divide(a, b));
		
		
		scanner.close();
		
	}

}
