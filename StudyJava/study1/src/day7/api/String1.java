package day7.api;

public class String1 {
	
	public static void main(String[] args) {
		
		String str1 = "abcd";
		String str2 = "EFGH";
		String str3 = " ijkl " ;
		
		//���ڿ��� ��ġ�� 0�����̴�!
		
		//concat - ���ڿ� ����
			System.out.println("���ڿ� ���� : "+str1.concat(str2));
		//substring - ���ڿ� �ڸ��� - �����ϱ� 1����
			System.out.println("���ڿ� �ڸ��� : "+str1.substring(2));
		//length - ���ڿ� ����
			System.out.println("���ڿ� ���� : "+str1.length());
		//toUpperCase - �빮��ȭ
			System.out.println("�빮��ȭ : "+str1.toUpperCase());
		//to LowerCase - �ҹ���ȭ
			System.out.println("�ҹ���ȭ : "+str2.toLowerCase());
		//charAt - Ư�� ��ġ�� ���� ã�� - �����ϱ� 0����
			System.out.println("Ư�� ��ġ�� ���� ã�� : "+str1.charAt(2));
		//indexOf - Ư�� ���ڿ��� ��ġ ã��
			System.out.println("Ư�� ���ڿ��� ��ġ ã�� : "+str1.indexOf("a"));
		//equal - ���ڿ� ��
			System.out.println("���ڿ� �� : "+str1.equals(str3));
		//trim - ���ڿ� ��������(�����ڸ���)
			System.out.println("���ڿ� ���� ���� : "+str3);
			System.out.println("���ڿ� ���� ���� : "+str3.trim());
		//replace - Ư�� ���� ����
			System.out.println("Ư�� ���� ���� : "+str1.replace('a','b'));
		//replaceAll - Ư�� ���ڿ� ����
			System.out.println("Ư�� ���ڿ� ���� : "+str1.replaceAll("abc","aaa"));
	}

}