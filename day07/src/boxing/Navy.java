package boxing;

public class Navy extends Unit{
	public Navy(String name) {
		super(name);
	}
	@Override
	public void attack() {
		super.attack();
		System.out.println(this.getName() + " >> 어뢰발사");
		System.out.println(this.getName() + " >> 지상상륙");
	}
	// nucleus()
	public void nucleus() {
		System.out.println(this.getName() + " >> 핵공격");
	}
}

