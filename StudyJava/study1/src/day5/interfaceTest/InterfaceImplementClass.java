package day5.interfaceTest;

public class InterfaceImplementClass implements Interface1, Interface2 {

	@Override
	public void method1() {
		System.out.println("��� �޼ҵ� �������̵�!(�������̽��� ��� �޼ҵ尡 �߻�޼ҵ��̴�.)");
	}	
	
	@Override
	public String method2() {
		System.out.println("�������̽��� ����� �߻�޼ҵ常 ���簡 �����ϴ�.");
		return null;
	}


}