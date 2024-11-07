package stream.ref;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
리소스로 부터 스트림 얻기
baseStream
Stream<T> => List 컬렉션, Set컬렉션

,intStream,LongStream,DoubleStream => 배열

Stream<Path> 디렉토리
Stream<String> 텍스트 파일

intStream,LongStream,DoubleStream => 랜덤수
*/


public class Resource {

	public static void main(String[] args) {
		// List컬렉션 생성
		List<Product> list = new ArrayList<>();
for(int i=1; i <= 5; i++) {
	Product product = new Product(i, "상품"+i, "멋진 회사", (int)(10000*Math.random()));
	list.add(product);
}
//객체 스트림 얻기
Stream<Product> stream = list.stream();
stream.forEach(p -> System.out.println(p));
		
		
		
		
		
		
		
		
		
		

	}

}
