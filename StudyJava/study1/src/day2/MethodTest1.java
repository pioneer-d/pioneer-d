package day2;

import java.util.Scanner;

public class MethodTest1 {		//��ü����� �����ϱ� ���� �޼ҵ� �����

	
	public static void main(String[] args) {	//�ᱹ�� main�� �ϳ��� �޼ҵ��̴�. ��, �� Ŭ�����ʹ� ������ ���ٰ� ��������.
		
		Scanner scanner = new Scanner(System.in);
		

		System.out.println("Ȯ�� �� �������� ������ �Է��Ͻÿ�.");
		int gugu = scanner.nextInt();
		
//		gugudan(gugu);	//�̶� gugudan�޼ҵ带 �׳� ���������� static�� ����ؾ��Ѵ�.
		MethodTest1 method1 = new MethodTest1();
		method1.gugudan(gugu);
		//�̷��� ȣ���ϱ⸸ �ϸ� ����� ���� Ʋ�� ��������� ����� �� �ִ�. ���������̶�� ��� �����ܿ� ���� ����� �־��ϴ� ������...
	
	}
	
	public void gugudan(int i) {	//���� Ŭ���� �ۿ� �ִ�.
		for(int j = 1; j<10; j++) {
			System.out.println(i+"*"+j+"="+(i*j));
		}
	}

}