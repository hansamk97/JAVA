package day01;

/*
 * 프로그램 소스의 최소 단위(=class)를 명시하는 블록
 * -> public class 클래스이름 {}
 * 클래스 이름은 소스파일의 이름과 동일해야 하며, 영어/숫자/언더바(_)만 사용 가능하다.
 * 첫 글자는 반드시 영어(대문자)로만 구성되어야 한다.
 */
public class Main01 {
	// 프로그램의 시작점을 의미하는 블록 -> main 매서드
	public static void main(String[] args) {
		// 콘솔에 문장을 출력하기 위한 명령어
		// 문장을 표현하는 방법 -> " " -> " " 안에 있는 문장을 문자열이라 한다.
		System.out.println("Hello World!!!");
		// 자동완성 ctrl+space
		System.out.println("KHS");
		// 한줄 라인을 지우는 단축키 ctrl+d
		String name = "ja" + "va";
		String str = name + 8.0;
		System.out.println(str);
		System.out.print("hi");

	}

}
