package day3;

public class Class3 {	//�ʵ�, ������, getter, setter
	
	//�̰͵��� �ν��Ͻ� ������� �Ѵ�.(�ʵ�)
	//private�� ������ �߱� ������ �ܺο��� ���� ���� �Ұ��̴�.
	private int age;
	private String name;
	private int num;
	
	public Class3() {
		System.out.println("Class3�� �⺻ ������");
	}
	
	public Class3(int age, String name, int num) {	//��ġ Ŭ������ �޼ҵ� �����ε�??
		this.age = age;
		//�̶� this�� �Ķ���� ���� �ʵ� ���� �򰥸��� �ʵ��� �����ִ� ģ��.
		//�ڽ�, �� Class3�� age�� ����Ų��.
		this.name = name;
		this.num = num;
	}
	
	//���⿡ �����Ӱ� �޼ҵ嵵 ����� ����, ���������ڸ� Ȱ���Ͽ�, �ܺο����� Ȱ���� �� �ֵ��� �˾Ƽ� �����ϸ� �ȴ�.

	public int getAge() {	//public�̹Ƿ� �ۿ��� age���� �� �� �ִ�.
		return age;
	}

	public void setAge(int age) {	//public�̹Ƿ� �ۿ��� age���� ���� �� �� �ִ�.
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
 
	
	
}