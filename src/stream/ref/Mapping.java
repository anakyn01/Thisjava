package stream.ref;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Mapping {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int pri = 4;
	Integer myInt = 5;
	
	System.out.println(myInt);
		
		
int[] intArray = {1,2,3,4,5};

IntStream intStream = Arrays.stream(intArray);
intStream.asDoubleStream().forEach(d->System.out.println(d));

System.out.println();

intStream = Arrays.stream(intArray);
intStream.boxed().forEach(obj -> System.out.println(obj.intValue()));
//Stream<Integer>,<Long>,<Double> boxed() int-> Integer, long-> Long, double -> Double
//크게 두가지로 형변환 비교연산 을 하기 래퍼클래스를 사용함 래퍼클래스의 주요용도는 기본 타입의 값을 boxing해서 포장객체로 만듬, null값을 편하게 처리
//기본형 데이터 타입을 객체로 변환한다
	}

}
/*
래퍼 클래스는 기본 테이터 유형(boolean,등)을 객체로 사용하는 방법을 리턴
래퍼객체를 만들려면 기본유형 대신에 래퍼클래스를 사용한다

매핑은 스트림의 요소를 다른 요소로 변환하는 중간처리 기능이다
mapXxx(), A-C

DoubleStream int->double
Stream<R> map(Function<T,R>) T-R

asDoubleStream,
asLongStream(),
boxed(),
flatMapXxx()등
Type Casting
Widening Casting(자동) 작은 글자를 큰 글자로
byte -> shot -> char -> int -> long -> float -> double
Narrowing Casting(수동) 더 큰글자를 더 작은 크기 글자로
 */
