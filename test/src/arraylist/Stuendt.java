package arraylist;

public class Stuendt {
	private String student;
	private int pNum;
	private String ad;
	
	public Stuendt(String student, int pNum, String ad) {
		super();
		this.student = student;
		this.pNum = pNum;
		this.ad = ad;
	}

	public String getStudent() {
		return student;
	}

	public void setStudent(String student) {
		this.student = student;
	}

	public int getpNum() {
		return pNum;
	}

	public void setpNum(int pNum) {
		this.pNum = pNum;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	@Override
	public String toString() {
		return "Stuendt [student=" + student + ", pNum=" + pNum + ", ad=" + ad + "]";
	}
	
	
	
}
