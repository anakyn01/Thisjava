package rambda.ref;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Intro {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(9);
		numbers.add(8);
		numbers.add(1);
		//numbers.forEach((n) -> {System.out.println(n);});
		Consumer<Integer> method = (n) -> {System.out.println(n);};
		numbers.forEach(method);
		//java.util Consumer인터페이스를 사용하여 람다 표현식을 변수에 저장합니다
		
		
		
		
		/* syntax parameter -> expression
		두개이상에 파라미터가 되면 (param1, param2) -> expression
		
		그러나 표현에 제한이 있다
		즉시 값을 리턴시켜야 하며 
		변수, 할당 또는  if 같은 명령문을 포함할수는 없습니다
		람다식이 값을 반환해야 하면 
		코드 블록에 return 명령문이 있어야 합니다
		*/

	}

}
/*
Lambda
함수형 프로그래밍 => 함수를 정의하고 이 함수를 데이터 처리부로 보내 
데이터를 처리하는 기법을 말합니다
데이터 처리부는 데이터만 가지고 있을뿐 
처리 방법이 정해져 있지 않아서 
외부에서 제공된 함수에 의존한다

데이커처리에 다형성
동일한 데이터라도 함수  A를 제공해서 처리하는 결과와 
함수 B를 제공해서 처리하는 결과가 다를수 있다
이것이 함수형 프로그래밍에 특징이다

자바는 함수형 프로그래밍을 위해서 java8부터
Lambda Expression을 지원한다
람다식은 데이터 처리부에서 제공되는 함수역활을 하는 매개변수를 가진
중괄호 블록이다
데이터 처리부는 람다식을 받아 매개변수에 데이터를 대입하고 
중괄호를 실행시켜 처리합니다

람다식 : (매개변수,...) -> {처리 내용}

자바는 람다식을 익명 구현객체(이름이 없는 인터페이스)로 변환한다
예를 무명인터페이스

public interface Noname{
//추상 메소드
 void calculate(int x, int y);
}

객체로
new Calculate(){
@Override
public void calculate(int x, int y){처리내용}
}

to Lambda
(x, y) -< {처리내용}

람다식은 인터페이스 익명 구현 객체이므로
인터페이스 타입의 매개변수로 대입될수 있다
아래와 같이 calculate 매개변수로 가지고 있는 operator

public void operator(Calculable calculable){
int x = 10;
int y = 4;
calculable.calculate(x, y);
}

데이터 처리부에서 처리
action((x, y) -> {
int result = x + y;
System.out.println(result);
})

람다식 1)
(x, y) -> {
int result = x + y;
System.out.println(result);
}


람다식 2)
(x, y) -> {
int result = x - y;
System.out.println(result);
}

람다식을 사용하면 코드에 양을 줄인다

인터페이스에 익명 구현객체를 to lambda
단 하나의 추상메소드만 가져야 한다
두개이상이 추상 메소드를 가진 인터페이스는 람다식으로 표현할수 없다

public interface two{
void one();
void two();
}

인터페이스가 단 하나의 추상 메소드를 가질때 이를 함수형 인터페이스라고 한다
public interface Runnable{
void run(); 
}
 =>
 
 () -> {....}

@FunctionalInterface 
인터페이스가 함수형 인터페이스를 보장하기 위해서는 
@FunctionalInterface 붙이는 것은 선택사항이지만 
컴파일 과정에서 추상 메소드가 하나인지 검사하기 때문에
정확한 함수형 인터페이스를 작성할수 있게 도와 주는 역활을 한다
public interface Calculable{
void calculate(int x, int y);
}

=>
(x, y) -> {....}





*/
