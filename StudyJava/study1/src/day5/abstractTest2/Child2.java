package day5.abstractTest2;

public class Child2 extends LunchMenu {

	public Child2(int meal, int guk, int iceCream, int coffee, int milk) {
		super(meal, guk, iceCream, coffee, milk);
		// TODO Auto-generated constructor stub
	}

	//�� Ŭ���������� ���� �Ĵ� �� iceCream�� milk�� �����Ѵ�.
	@Override
	public int calculrate() {
		System.out.println("��, ��, ���̽�ũ��, ������ �����ϼ̽��ϴ�.");
		return meal + guk + iceCream + milk;
	}

}