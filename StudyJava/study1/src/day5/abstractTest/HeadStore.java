package day5.abstractTest;

public abstract class HeadStore {	//추상클래스의 이해
	
	public HeadStore() {
		// TODO Auto-generated constructor stub
	}
	
	//추상메소드는 내용이 없다. 선언만 있을뿐.
	public abstract void chicken();
	
	public abstract void pizza();
	
	public abstract void coffee();
	
	public void test() {
		System.out.println("일반 메소드는?");
	}

}
