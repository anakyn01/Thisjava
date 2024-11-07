package stream.ref;

import java.util.Arrays;

/*
요소를 하나씩 처리 (루핑)
스트림에서 요소를 하나씩 반복해서 가져와 처리하는 것을 말합니다
루핑 메소드에는 peek()과 forEach()가 있다

리턴타입에 따라 다르다
Stream<T>,IntStream,DoubleStream => peek

void => forEach 

동일하게 요소를 루핑하지만 
peek()은 중간처리 메소드
forEach() 는 최종처리 메소드이다

따라서 peek()은 최종처리가 붙지 않으면 동작하지 않습니다

매개타입인 함수형 인터페이스 Consumer를 가지고 있는데
매개값을 소비하는 accept()메소드를 가지고 있다
*/

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArr = {1, 2, 3, 4, 5};
		//잘못 작성하는 경우
		Arrays.stream(intArr).filter(a -> a%2 ==0).peek(n -> System.out.println(n));
		
int total = Arrays.stream(intArr).filter(a -> a%2 ==0)
.peek(n -> System.out.println(n)).sum();
System.out.println("총합: " + total + "\n");
		
Arrays.stream(intArr).filter(a -> a%2 == 0).forEach(n -> System.out.println(n));		
		
		
		
		

	}

}
