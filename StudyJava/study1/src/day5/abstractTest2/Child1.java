package day5.abstractTest2;

public class Child1 extends LunchMenu {

	public Child1(int meal, int guk, int iceCream, int coffee, int milk) {
		super(meal, guk, iceCream, coffee, milk);	//�θ��� �ʵ带 �״�� ������ ���ڴ�? �̷� �ǹ��ΰ� ����. �´�!
		// �θ��� �����ڿ� �Ű������� ������ �� ��� �ڽ� Ŭ������ �����ڵ� ���� ������ ���ؾ��ϴ� �� ����.
	}

	//�� Ŭ������ ���� �Ĵ� �� coffee�� �����Ѵ�.
	@Override
	public int calculrate() {	//�̶� �θ� �ʵ忡�� private�� �ϴϱ� ������ �ȵƴ�.
		System.out.println("��, ��, Ŀ�Ǹ� �����ϼ̽��ϴ�.");
		return (meal + guk + coffee);
	}

}