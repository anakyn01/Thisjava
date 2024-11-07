package stream.ref;

import java.util.Arrays;

/*
요소 조건 만족여부(매칭 : 특정 조건에 만족하는지 여부를 조사하는 최종 처리기능 입니다)
매칭과 관련된 메소드는 아래와 같습니다

리턴타입 : boolean

메소드 매개변수
allMatch : 모든 요소가 만족하는지 여부
anyMatch : 최소한 하나의 요소가 만족하는지 여부
noneMatch : 모든 요소가 만족하는지 않는지 여부

위에 3개 메소드는 매개값에 주어진 Predicate가 리턴하는 값에 따라
true, 또는 false를 리턴합니다

아래에 예제에서 모든요소가 2의 배수인지 하나라도 3의 배수가 존재하는지
또는 모든요소가 3의 배수가 아닌지를 조사합니다
*/

public class Match {

	public static void main(String[] args) {
	int[] intArr = {2, 4, 6};
	
	boolean result = Arrays.stream(intArr).allMatch(a -> a%2==0);
	System.out.println("모두 2의 배수인가? " + result);
	
	result = Arrays.stream(intArr).anyMatch(a -> a%3==0);
	System.out.println("하나라도 3의 배수가 있는가? " + result);	

	result = Arrays.stream(intArr).noneMatch(a -> a%3==0);
	System.out.println("3의 배수가 없는가? " + result);
	}

}
