package stream.ref;

import java.util.stream.IntStream;

/*
숫자 범위로부터 스트림 얻기
정적메소드 첫번째 매개값은 시작수이고 두번째 매개값은 끝수 인데
range() : 끝수를 포함하지않으면
rangeClosed() : 끝수를 포함하면 
*/
public class Nums {
	public static int sum;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStream stream = IntStream.rangeClosed(1, 100);
		stream.forEach(a -> sum += a);
		System.out.println("총합: "+sum);		
	}

}
