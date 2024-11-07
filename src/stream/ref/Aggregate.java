package stream.ref;

import java.util.Arrays;

public class Aggregate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr = {1,2,3,4,5};
//카운팅
long count = Arrays.stream(arr).filter(n -> n%2==0).count();
System.out.println("2의 배수 개수: " + count);

//총합 sum()
long sum = Arrays.stream(arr).filter(n -> n%2==0).sum();
System.out.println("2의 배수의 합: " + sum);

//평균 average()
double avg = Arrays.stream(arr).filter(n -> n%2==0).average().getAsDouble();
System.out.println("2의 배수의 평균: " + avg);

//최대값 max()
int max = Arrays.stream(arr).filter(n -> n%2==0).max().getAsInt();
System.out.println("최대값: " + max);

//최소값 min()
int min = Arrays.stream(arr).filter(n -> n%2==0).min().getAsInt();
System.out.println("최소값: " + min);

//첫번째요소 findFirst
int first = Arrays.stream(arr).filter(n -> n%3==0).findFirst().getAsInt();
System.out.println("첫번째 3의 배수: " + first);

	}

}
/*
스트림이 제공하는 기본집계
스트림은 아래와 같이 카운팅,최대,최소,평균,합계 등을 처리하는
최종처리메소드를 제공한다

리턴타입 : long => count() : 요소개수

리턴타입 : OptionalXXX[Optional, OptionalDouble, OptionalInt] => findFirst() : 첫번째 요소
get(), getAsDouble(), getAsInt(), getAsLong()을
호출하면 최종값을 얻을수 있습니다

리턴타입 : Optional<T> => max(Comparator<T>) : 최대 요소
리턴타입 : OptionalXXX => max()

리턴타입 : Optional<T> => min(Comparator<T>) : 최소 요소
리턴타입 : OptionalXXX => min()

리턴타입 : OptionalDouble => average() : 요소 평균

리턴타입 : int,long,double => sum() : 요소 총합


*/
