package day2.Array;

public class Array1 {	//�迭 ���� 2����

	public static void main(String[] args) {
		
		//index����� ���ÿ� value�� �Է��ϴ� ���
		int i[] = {1,2,3,4,5};
		
		//index���� �� value�� ���� �Է��ϴ� ���
		int[] j = new int[5];
		j[0] = 1;
		j[1] = 2;
		j[2] = 3;
		j[3] = 4;
		j[4] = 5;
		
		//�ּ� �� ���� �������� �׽�Ʈ
		int z[] = i;
		//���⼭ value���� �ٲ㵵 i�� �迭�� �ٲ��. ���� ���۷����� �����ϱ� ����!
		
		
		//�̰� ����ϸ� ��ü�� �ּ� ���� ���´�. �̶� �ּ� ���� '���۷���'��� �Ѵ�.
		System.out.print(i);	
		System.out.println("");
		System.out.print(i == z);	//i�� z�� ���� ������ i�� �ּ� ���� z�� �״�� �Էµȴ�.
		System.out.println("");

				
		//�迭 ��ü�� ����Ϸ���?
		for(int k = 0; k<i.length; k++) {	//�迭�� index�� 0�����̴�.
			System.out.println(i[k]);
		}
		
		
	}
}