package day4.extend2;

public class MainClass {	//��üŸ�Կ� ���� ����
	
	public static void main(String[] args) { //����� ������ ���� Ŭ������ Ÿ���� ������ �� �ִ�!
		
		HeadStore store = new HeadStore();
		
		HeadStore store1 = new Store1();
		//���� HeadStore�� ��üŸ���� �����ϴ� ���̴�.
		//�̶� Store1�� HeadStore�� ��ӹް� ������ HeadStore�� Ÿ���� �޾Ƶ� �ȴ�!
		//Ÿ���� HeadStore�ϻ� ��ü�� Store1�� ����!
		
		HeadStore store2 = new Store2();
		
		//�θ��� �޼ҵ��
		store.chicken();
		store.pizza();
		store.coffee();
		
		System.out.println("");
		//�ڽ��� �޼ҵ��(chicken�� ������ �Ǿ���)
		store1.chicken();
		store1.pizza();
		store1.coffee();
		
		System.out.println("");
		//�ڽ��� �޼ҵ��(pizza�� ������ �Ǿ���)
		store2.chicken();
		store2.pizza();
		store2.coffee();
		
	}
}