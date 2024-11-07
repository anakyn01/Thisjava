package stream.ref;

import java.util.ArrayList;
import java.util.List;

public class Filter {
//성이 신인 이름만 필터링 해서 출력한다
	public static void main(String[] args) {
		List<String>list = new ArrayList<>();
list.add("홍길동");list.add("신용재");list.add("신용재");list.add("신민철");
list.add("감자");
//중복요소제거
list.stream().distinct().forEach(n->System.out.println(n));
System.out.println();

//신으로 시작하는 요소만 필터링
list.stream().filter(n->n.startsWith("신")).forEach(n -> System.out.println(n));
System.out.println();
//중복요소를 먼저 게거하고, 신으로 시작하는 요소만 필터링
list.stream().distinct().filter(n -> n.startsWith("신")).forEach(n->System.out.println(n));
System.out.println();
	}
}
/*
요소를 걸러내는 중간 처리기능입니다
메소드 distinct() 와 filter()를 가지고 있습니다
distinct() : 중복제거
filter() : 조건 필터링, 매개 타입은 요소 타입에 따른 함수형
인터페이스이므로 람다식으로 작성이 가능하다

Predicate 함수형 인터페이스
Predicate<T> : 객체 T를 조사
람다식으로 표현하면 T -> true;

intPredicate : int값을 조사
LongPredicate : long값을 조사
DoublePredicate : double 값을 조사

모든 Predicate는 매개값을 조사한후 boolean을 리턴하는 test()메소드를 
가지고 있다
*/








