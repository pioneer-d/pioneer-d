package day4.extend;

public class MainClass {	//자식클래스를 객체생성하여 부모의 클래스의 기능을 가져오는 실험
	
	public static void main(String[] args) {
		
		ChildClass cc = new ChildClass();
		
		String getString = cc.parent;
		System.out.println(getString);
		
		cc.getPapaName();
		cc.getMamaName();
		cc.getChange(); 	//이 메소드는 자식이 재정의한 메소드. Overriding을 사용했다.
		
	}

}
