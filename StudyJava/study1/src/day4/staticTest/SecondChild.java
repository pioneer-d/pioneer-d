package day4.staticTest;

public class SecondChild {

	public void getMoney(int money) {

		if (PapaPouch.MONEY <= 0) {
			System.out.println("둘째가 받을 돈이 지갑에 없습니다.");
		}else {
		PapaPouch.MONEY = PapaPouch.MONEY - money;
		System.out.println("둘째가 "+money+"원 받았습니다.");
		}

	}
}
