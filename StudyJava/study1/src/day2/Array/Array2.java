package day2.Array;

import java.util.Scanner;

public class Array2 {	//������ �迭�� �̿��Ͽ� �� ����, �л� ��, �ش� �л��� ���� ���� �Է��ϱ�.
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�� ������ �Է��Ͻÿ�");
		int i = scanner.nextInt();	//�� ����
		
		System.out.println("�ִ� �л� ���� �Է��Ͻÿ�");
		int j = scanner.nextInt();	//�л� ��
		
		int arr[][] = new int [i][j];
		
		for(int z = 0; z<i; z++) {
			for(int c = 0; c<j; c++) {
				System.out.println((z+1)+"����"+(c+1)+"�� �л��� ���� ����?");
				arr[z][c] = scanner.nextInt();
				
			}
		}
		
		for(int z = 0; z<i; z++) {
			System.out.println((z+1)+"��");
			for(int c = 0; c<j; c++) {
				System.out.println(arr[z][c]+"��");
			}
		}
		
		
	}
	

}