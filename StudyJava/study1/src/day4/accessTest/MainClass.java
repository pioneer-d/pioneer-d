package day4.accessTest;

public class MainClass {
	
	public static void main(String[] args) {
	
		AccessClass ac = new AccessClass();

//		int a1 = ac.a;	//AccessClass의 a의 접근제어자가 private이기 때문에 접근 불가!
		int b1 = ac.b;
		int c1 = ac.c;
		int d1 = ac.d;
		
//		System.out.println(a1);
		System.out.println(b1);
		System.out.println(c1);
		System.out.println(d1);
		
}

}
