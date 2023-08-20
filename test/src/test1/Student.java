package test1;

public class Student {
	private String name;
	private int ban;
	private int no;
	private int kor;
	private int eng;
	private int math;
	
	
	public String getName() {
		return name;
	}
	public Student(String name, int ban, int no, int kor, int eng, int math) {
		super();
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBan() {
		return ban;
	}
	public void setBan(int ban) {
		this.ban = ban;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	public static int sum(int kor, int eng, int math) {
		return kor + eng + math;
	}
	
	public static int avg(int kor, int eng, int math) {
		return (kor + eng + math) / 3;
	}
	
	public static void pri(String name, int ban, int no, int kor, int emg, int math) {
		
	}
	
	
	
	
	
	
	
	
}
	
	

