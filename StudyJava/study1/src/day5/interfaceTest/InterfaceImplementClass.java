package day5.interfaceTest;

public class InterfaceImplementClass implements Interface1, Interface2 {

	@Override
	public void method1() {
		System.out.println("모든 메소드 오버라이딩!(인터페이스는 모든 메소드가 추상메소드이다.)");
	}	
	
	@Override
	public String method2() {
		System.out.println("무조건 자식이 모든 메소드 재정의!");
		return null;
	}


}
