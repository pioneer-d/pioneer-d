package day5.abstractTest2;

public class Child1 extends LunchMenu {

	public Child1(int meal, int guk, int iceCream, int coffee, int milk) {
		super(meal, guk, iceCream, coffee, milk);	//부모의 필드를 그대로 가져다 쓰겠다? 이런 의미인것 같다. 맞다!
		// TODO Auto-generated constructor stub
	}

	//이 클래스는 선택 식단 중 coffee만 선택한다.
	@Override
	public int calculrate() {	//이때 부모 필드에서 private로 하니까 접근이 안됐다.
		System.out.println("밥, 국, 커피를 선택하셨습니다.");
		return (meal + guk + coffee);
	}

}
