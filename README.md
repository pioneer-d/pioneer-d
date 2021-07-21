자바스터디

Day1
3가지 플랫폼이 있음.
JAVA SE - JAVA Applecation개발
JAVA ME - 거의 안씀(소형 디바이스)
JAVA EE - 기업 솔루션 개발

JAVA의 특징
Virtual Machine - 운영체제의 영향을 받지 않음.(대신 조금 느림)
Garbage Collection - 개발자가 메모리 관리를 하지 않아도 됨.(쓰지 않는 메모리를 알아서 관리)
Object Oriented Program - 객체지향 언어로 개발과 유지보수면에서 효율적.

JAVA개발 환경설정
JDK - JAVA개발 키트(내가 쓰고있는건 15.0.2버전)
(개발이 아닌 실행만 시킬거면 JRE만 있으면 된다)
IDE - 통합 개발툴(이클립스)

시스템 변수(Program파일의 java파일 참고)설정
1. 변수 이름 :  JAVA_HOME - 변수 값 : jdk까지의 경로
2. 변수 이름 : Path - 변수 값 : bin까지 경로>


github desktop 올릴때 CFLR어쩌구 에러뜰때
git config core.autocrlf 이거 true false관리 하면 된다.

기본적인 데이터 타입, 산술,연산자
if문, switch문, scanner등에 대해 간단한 예제작성.




Day2

객체지향과 절차지향의 차이점.
1. 메소드의 유무 > 이로인한 효율성 측면 >더 나아가 클래스의 유무.
	ex) 자동차는 색상, 엑셀, 종류 이런 무수한 종류들이 있다.
	     매번 차를 만들때 다르게 만드려면 만들때마다 따로 만들어줘야 한다.
	     이때 메소드, 즉 틀이란 것을 만들어 입,출력만 다르게 하여 효율적으로 접근한다.


메소드 형태
접근제한자 반환타입 메소드명(파라미터){}
ex) public int sum(int i, int j){
     int z;     
     어쩌구 저쩌구
     return z;	//반환 타입이 void면 반환하지 않는다.
}
이때 파라미터는 메소드내에서만 쓰인다. = 지역변수이다(!= 전역변수)

객체사용법(객체의 본질)
ex)A라는 클래스가 존재.
	A a = new A();
	A b = new A();
    이때 a와 b는 같은 레퍼런스(주소 값)을 갖는다.
    하지만 이때 a에서 사용되는 데이터들과 b에서 사용되는 데이터들은 각각 다르게 저장된다.
    즉 A는 틀을 제공하는 것이며 이를 new라는 생성자를 통해 clone(?)을 생성하여 자유롭게 사용한다.
    이때 a와 b는 객체변수라 불린다.

Day4

static = '공유'라고 생각하자.
서로 다른 클래스들이 a라는 객체를 각각 생성하여 따로 쓰는 것이 아닌 static을 통해 공유한다.
static으로 생성된 것은 객체를 생성하지 않고 바로 Class.으로 접근이 바로 가능하다.
static은 객체변수가 아닌 클래스 변수로써 객체가 생성되기 전에 이미 존재한다.

생성자와 메소드의 차이 - 생성자는 반환이라는 개념이 존재하지 않는다.

메모리 영역이 크게 2가지 있다. 데이터영역(A)과 Heap(B)영역이다.
A영역은 쉽게 말해 객체들이 생성되기 전 모든 클래스들이 있다. (모두 1개씩 존재)
B영역은 객체들이 모여있다. 이 Heap영역은 가비지 콜렉터가 관리한다.
이때 static은 A영역에 상주하게 되는데, 객체를 생성하지 않기 때문에 그만큼 B영역의 메모리를 사용하지 않지만,
반대로 가비지콜렉터의 관리 밖에 있기 때문에 항상 A메모리에 상주하게 된다. 프로젝트가 커질 수록 점차 느려진다!
그러므로 static변수는 신중히 해야한다.

final키워드는 더이상 변경 불가하게 막아두는, 마치 자물쇠의 역할을 한다.

상속
super는 this와 다르게 상위 객체를 찾아간다.
이를 쓰는 이유는 자식 객체가 부모의 것을 재정의할 경우 부모의 것은 사용하지 못하기 때문에
부모의 것도 사용할 수 있도록 도와주는 것이 super이다.


Day5

추상클래스
자식은 부모의 모든 메소드를 전부 재정의 해야함. == 오버라이딩에 강제성이 붙음.
추상클래스의 메소드(추상메소드)는 내용이 없다. 선언만 있을뿐.

지금까지 추상과 일반의 차이점.
1. 추상클래스는 자식클래스에서 오버라이딩을 강제한다.
2. 추상클래스의 추상메소드에는 내용없이 선언만 있다.

인터페이스
실제 기능은 없음. 추상메소드와 상수만이 존재함.
상수는 private 접근제한자가 안됨.
메소드는 무조건 추상메소드만 존재.
인터페이스는 객체는 아니지만 객체 타입으로만 사용됨.
다형성의 특징. 추상화의 특징.
상속과 다르게 여러개의 implements할 수 있다.

ex)
코딩 테스트를 하려한다. 5가지의 기능을 만들라고 시킬때,
인터페이스를 만들어 5가지의 추상메소드를 만든뒤,
참가자들에게 뿌린다. 요런느낌?


인터페이스와 추상클래스의 차이
공통점
	1. 둘다 추상메소드를 갖고 있다.
	2. 데이터 타입이 목적이다.(객체 생성시)
	3. 객체 생성시 anonymose를 이용해야 한다.

차이점
	1. 추상클래스는 '상속' / 인터페이스는 '구현'이다.(extends <-> implements)
	2. 인터페이스는 추상클래스와 다르게 추상메소드와 상수만이 존재할 수 있다.
	3. 추상클래스는 단일상속 / 인터페이스는 다중구현이 가능하다.

interfaceTest1과 interfaceTest2의 차이점 - 
1은 여러 인터페이스를 한개의 클래스가 구현하고 있고,
2는 한개의 인터페이스를 여러개의 클래스가 구현하고 있다.

이때 실행하는 클래스(MainClass)에서는 객체생성에 주의해야 한다. 같은 타입으로 해야할 경우 통일을 시켜야 하기 때문.


Day6

패턴

Singleton 패턴
객체를 한개만 만들고 그 객체를 모든곳에서 전역으로 공유할 수 있도록 하는 패턴.
생성자를 private로 막고, 메소드를 static으로 두고, 그 메소드를 통해 객체를 얻어온다.
static, 데이터타입이 자신인 변수를 만들고 그것을 공유한다.

Strategy 패턴
(패키지 strategy1 참고)
로봇을 만들건데, 공통기능과 개별기능이 있다. 가격에 따라 다르겠지?

(패키지 strategy2 참고)
이때 공통기능과 개별기능을 로봇을 만들때마다 입력하는 것은 효율성이 떨어진다.
이때 추상클래스의 기능을 활용하여 공통기능을 일반메소드로,
개별기능을 추상메소드로 만들고 로봇마다 상속을 시키면 상당히 효율성이 증대된다.

(패키지 strategy3 참고)
추가적으로 인터페이스를 사용하면 개별기능까지 부품화하여
더욱 효율적으로 코딩이 가능하다.

참고
equal은 대상의 내용자체를 비교한다. 비교를 위한 연산자 메소드 이다.
==은 대상의 주소값을 비교한다.






