package stream.ref;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//flatMapXxx()메소드는 하나의 요소를 복수개의 요소들로 변환한 새로운 스트림
public class FlatMap {
public static void main(String[] arg) {
	//문장스트림을 단어 스트림으로 변환
	List<String> list1 = new ArrayList<>();
	list1.add("이것이 자바다");
	list1.add("나는 그루트다");
	list1.stream().flatMap(data -> Arrays.stream(data.split(" ")))
	.forEach(word -> System.out.println(word));
	
	System.out.println();
	
	//문자열 숫자 목록 스트림을 숫자 스트림으로 변환
	List<String> list2 = Arrays.asList("10, 20, 30", "40, 50");
	//Arrays.asList 객체에 담겨있는 배열데이터가 별개의 주소값
	list2.stream()
	.flatMapToInt(data -> {
		String[] strArr = data.split(",");
		//split 정규식을 사용하여 정의된 구분기호로 문자열을 하위 문자열로 만들어 줍니다
		int[] intArr = new int[strArr.length];
		for (int i=0; i < strArr.length; i++) {
			intArr[i] = Integer.parseInt(strArr[i].trim());
			//변수 i에 = 숫자로 구문분석(문자열 개별 i에 양끝에 공백제거)
		}//String[]배열을 int[]로 만듬
		return Arrays.stream(intArr);
		//arrays.stream()메소드는 주어진 int[]배열을 intStream으로 만듬
	}).forEach(number -> System.out.println(number));
}







}
