package day2.loop;

public class ForTest3 { // ������ �����
	public static void main(String[] args) {

		for (int j = 1; j < 10; j++) {
			for (int i = 2; i < 10; i++) {
				System.out.print(i + "*" + j + "=" + (i * j) + "\t");
			}
			System.out.println("");
		}
	}
}