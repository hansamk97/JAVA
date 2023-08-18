package object;
/*
 *  - 멤버변수는 지역변수와 구별하기 위하여 가급적 this를 통하여 접근한다.
 *  - 메서드에 접근할 때 this 키워드를 사용하는 것이 필수적인 것은 아니다.
 */
class Member{
	String name;	// 멤버변수
	int age;		// 멤버변수
	
	String getName() { return this.name; }
	void setName(String name) { this.name = name; }
	
	int getAge() { return this.age; }
	void setAge(int age) { this.age = age; }
	
	void say() {
		System.out.println(this.getName());
		System.out.println(getAge());	// 메서드 호출할 때는 this 생략 가능
		
		
	}
	
}


public class Main05 {

	public static void main(String[] args) {
		Member member = new Member();
		member.setName("자바학생");
		member.setAge(20);
		System.out.println(member.getName());
		System.out.println(member.getAge());
		member.say();
		
		
	}

}
