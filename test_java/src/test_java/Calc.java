package test_java;

public class Calc {
	
	private String name;
	
	public int plus(int x, int y) {
		return x + y;
	}
	public int minus(int x, int y) {
		return x - y;
	}
	public int times(int x, int y) {
		return x * y;
	}
	public int divide(int x, int y) {
		int result = 0;
		if(y != 0) {
			result = x / y;
		}
		return result;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

	
	
	
	
}	
