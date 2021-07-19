package day2.Array;

public class Array1 {	//배열 선언 2가지

	public static void main(String[] args) {
		
		//index선언과 동시에 value를 입력하는 방식
		int i[] = {1,2,3,4,5};
		
		//index선언 후 value를 따로 입력하는 방식
		int[] j = new int[5];
		j[0] = 1;
		j[1] = 2;
		j[2] = 3;
		j[3] = 4;
		j[4] = 5;
		
		//주소 값 같게 나오는지 테스트
		int z[] = i;
		//여기서 value값을 바꿔도 i의 배열이 바뀐다. 같은 레퍼런스를 참조하기 때문!
		
		
		//이걸 출력하면 객체의 주소 값이 나온다. 이때 주소 값을 '레퍼런스'라고 한다.
		System.out.print(i);	
		System.out.println("");
		System.out.print(i == z);	//i를 z에 대입 했으니 i의 주소 값이 z에 그대로 입력된다.
		System.out.println("");

				
		//배열 전체를 출력하려면?
		for(int k = 0; k<i.length; k++) {	//배열의 index는 0부터이다.
			System.out.println(i[k]);
		}
		
		
	}
}
