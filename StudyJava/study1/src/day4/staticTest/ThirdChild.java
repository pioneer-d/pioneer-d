package day4.staticTest;

public class ThirdChild {

	public void getMoney(int money) {
		
		if (PapaPouch.MONEY <= 0) {
			System.out.println("��°�� ���� ���� ������ �����ϴ�.");
		}else {
		PapaPouch.MONEY = PapaPouch.MONEY - money;
		System.out.println("��°�� "+money+"�� �޾ҽ��ϴ�.");
		}
		
	}

}