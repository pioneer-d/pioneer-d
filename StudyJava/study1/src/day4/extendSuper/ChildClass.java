package day4.extendSuper;

public class ChildClass extends ParentClass {	//super�� ����
	
	public ChildClass() {
		System.out.println("ChildClass�� ������ ȣ��!");
	}
	
	@Override
	public void method1() {
		super.method1();	//�̶� super�� this(�ڱⰴü)�� �ٸ��� ���� ��ü�� ã�� Ű����!
		System.out.println("�ڽ��� ������ �� �޼ҵ�!");
		
		//super�� �θ��� ��ü�� ���� method1�� ���� �� ���� �ٽ� ���ƿ� �ڽ��� �������� �޼ҵ带 �����ϴ� �����̴�.
	}

}