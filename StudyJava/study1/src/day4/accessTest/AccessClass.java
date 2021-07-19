package day4.accessTest;

public class AccessClass {	//접근제한자 실험
	
	
	private int a = 10;
	int b = 11;				//이렇게 접근제어자가 생략될 경우 default로 적용된다.(public인가..?)
	protected int c = 12;
	public int d = 13;
	
	//접근제한자의 종류는 크게 4가지 있다.
	//private	같은패키지 내에서도 같은 클래스에서만 접근 가능
	//default	같은패키지 내에서 모두 접근 가능
	//protected	같은패키지 + 외부패키지 중 상속받은 서브클래스만 접근 가능
	//public	어디서든 접근 가능

}
