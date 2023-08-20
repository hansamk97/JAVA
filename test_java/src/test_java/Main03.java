package test_java;

import java.util.Random;
import java.util.Scanner;

public class Main03 {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("주사위를 던지세요");
		int a = scanner.nextInt();
		System.out.println("첫번째 : " + a);
		System.out.println("주사위를 던지세요");
		int b = scanner.nextInt();
		System.out.println("두번째 : " + b);

		
}
}