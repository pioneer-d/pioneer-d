package day2.Array;

import java.util.Scanner;

public class Array2 {	//다차원 배열을 이용하여 반 갯수, 학생 수, 해당 학생의 가진 돈들 입력하기.
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("반 갯수를 입력하시오");
		int i = scanner.nextInt();	//반 갯수
		
		System.out.println("최대 학생 수를 입력하시오");
		int j = scanner.nextInt();	//학생 수
		
		int arr[][] = new int [i][j];
		
		for(int z = 0; z<i; z++) {
			for(int c = 0; c<j; c++) {
				System.out.println((z+1)+"반의"+(c+1)+"번 학생이 가진 돈은?");
				arr[z][c] = scanner.nextInt();
				
			}
		}
		
		for(int z = 0; z<i; z++) {
			System.out.println((z+1)+"반");
			for(int c = 0; c<j; c++) {
				System.out.println(arr[z][c]+"원");
			}
		}
		
		
	}
	

}
