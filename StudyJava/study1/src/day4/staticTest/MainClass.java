package day4.staticTest;

public class MainClass {	//static�� ���� 
	
	public static void main(String[] args) {
		
		//���� PapaPouch���� 200���� �ִ�.
		
		System.out.println("���� �ƺ������� ���� �� : "+PapaPouch.MONEY);
		
		FirstChild fc = new FirstChild();
		fc.getMoney(100);
		System.out.println("���� �ƺ������� ���� �� : "+PapaPouch.MONEY);
		
		SecondChild sc = new SecondChild();
		sc.getMoney(100);
		System.out.println("���� �ƺ������� ���� �� : "+PapaPouch.MONEY);
		
		ThirdChild tc = new ThirdChild();
		tc.getMoney(100);
		System.out.println("���� �ƺ������� ���� �� : "+PapaPouch.MONEY);
		
		
	}

}
