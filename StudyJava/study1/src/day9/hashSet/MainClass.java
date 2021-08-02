package day9.hashSet;

import java.util.HashSet;

public class MainClass {

	public static void main(String[] args) {
		
		HashSet <Student> hashSet = new HashSet <Student>(); 
		//������ Ÿ���� Student�̴�. Student ��ü�� ���� �� �ִ�.
		
		hashSet.add(new Student("���ؿ�",1));
		hashSet.add(new Student("����",2));
		hashSet.add(new Student("��±�",3));
		
		//���� hashSet���� ��ü���� �����ͷ� ������ �Ǿ��ִ�.
		//�� ��ü���� ������ڴ� ������ ��ü���� �������� ���� ���� �ƴ�, �ּҰ��� �����ϰ� �ֱ� ������
		//���� ���� ����ϱ� ���ؼ� toString�� ������ �ؾ���.
		System.out.println(hashSet.toString());
		
		//������ ����������
		Student student = new Student("��±�",3);
		//�̳��� ���� add�� ���� "��±�"�ʹ� �ٸ� ��ü�̴�.
		
		//�׷��� �̷��� �ٷ� �����ص� ������ �ȵɰŴ�.
		hashSet.remove(student);
		System.out.println(hashSet.toString());
		
		//�����ϱ� ���ؼ� �� �� ��ü�� ���� ������ ������ �ǵ��� �����Ǹ� �� �ؾ��Ѵ�.
		//hash������ ��ü�� 2������ ������ ���ϱ� ���� ������ 2���� �ִ�.
		//hashCode�� ������, equals�� ������!
		//�� ���� ������Ű�� ���� 2������ �޼ҵ带 �������Ѵ�.
		
		//�̷��� hash���� ��ü�� ������ remove���� �͵��� �����ǰ� �ʿ��ϴ�.
		//���� �����͸� �ٷ궧�� �ʿ����!
		
		
		
	}
	
}