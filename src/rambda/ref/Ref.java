package rambda.ref;
/*
메소드 참조
메소드를 참조해서 매개변수의 정보 및 리턴타입을 알아내 람다식에서
불필요한 매개 변수를 제거하는것을 목적으로 합니다
예를 들어 두개의 값을 받아 큰수를 리턴하는 Math클래스의
max() 정적 메소드를 호출하는 람다식은 아래와 같다
(left, right) -> Math.max(left, right)
람다식은 단순히 2개의 값을 비교하기 때문에 다소 불편해 보인다
이경우에는 아래와 같이 메소드 참조를 이용한다
Math :: max

정적메소드와 인스턴스 메소드 참조
static 메소드를 참조할경우 클래스 이름뒤에 ::기호를
붙이고 정적 메소드 이름을 기술한다
클래스 :: 메소드
인스턴스 메소드일 경우 먼저 객체를 생성한 다음 참조변수 뒤에 ::
기호를 붙이고 인스턴스 메소드 이름을 기술한다
참조변수 :: 메소드

매개변수의 메소드 참조
아래와 같이 람다식에서 제공되는 a매개변수의 메소드를 호출해서
b매개변수를 매개값으로 사용하는 경우도 있다
(a,b) -> {a.instanceMethod(b);}
이것을 메소드로 참조를 하면
클래스 :: instanceMethod
작성법은 정적메소드 참조와 동일하지만 a의 인스턴스 메소드가 사용된다는
점에서 다르다

생성자 참조
생성자를 참조한다는 것은 객체를 생성하는걸 의미한다
람다식이 단순히 객체를 생성하고 리턴하도록 구성된다면 람다식을 생성자 참조로 
대치 할수 있다
(a, b) -> {return new 클래스(a,b);} 객체를 생성한후 리턴만 한다
이거를 생성자 참조로 표현하면
클래스 :: new
생성자가 오버로딩되어 여러개가 있는경우
컴파일러는 함수형 인터페이스 추상 메소드와 동일한 매개변수 타입과 개수를
가지고 있는 생성자를 찾아 실행한다
만약 해당 생성자가 존재하지 않으면 컴파일 오류가 발생한다
*/
public class Ref {

	public static void main(String[] args) {
	Person person = new Person();
	
	// 정적 메소드일 경우 람다식
	person.action((x,y)-> Computer.staticMethod(x, y));
	// 메소드 참조
	person.action(Computer :: staticMethod);

	//인스턴스 메소드일 경우 람다식
	Computer com = new Computer();
	person.action((x,y)->com.instanceMethod(x, y));
	//메소드 참조
	person.action(com :: instanceMethod);
	
	//이름 비교
	Ps ps = new Ps();
	ps.ordering(String :: compareToIgnoreCase);
	/*
	compareToIgnoreCase compareTo와 동일하게 두개의 문자열을 비교하지만
	특징이 있는데 대소문자를 구분하지 않는다
	*/
		
	//생성자 비교
	Ps2 ps2 = new Ps2();
	
	Member m1 = ps2.getMember1(Member :: new);
	System.out.println(m1);
	System.out.println();
		
	Member m2 = ps2.getMember2(Member :: new);
	System.out.println(m2);
	System.out.println();
	
	//생성자 참조는 두 가지 방법 모두 동일하지만 함수형 인터페이스의 매개변수 개수에 따라 실행되는 Member생성자가 다릅니다
	
		
		
	}

}
