package base.string;

import java.util.Arrays;
/*
String : 문자열을 저장하고 조작할때 사용
문자열 리터럴은 자동으로 String객체로 생성되지만
String클래스의 다양한 생성자를 이용해서 객체를 생성할수 있다
프로그래밍을 하다보면 byte배열을 문자열로 변환하는 경우가 종종있다
예를 들어서 네트워크 통신으로 얻은 byte배열을 원래 문자열로 변환하는경우
이때는 String 생성자 중에서 다음 두가지를 사용해 String객체로
생성한다
String str = new String(byte[] bytes);
기본 문자셋으로 byte배열을 디코딩해서 String 객체로 생성

특정 문자셋
String str = new String(byte[] bytes, String charsetName);



StringBuilder : 효율적인 문자열 조작 기능이 필요할때 사용
StringTokenizer : 구분자로 연결된 문자열을 분리할때 사용


*/

public class Tostring {
	public static void main(String[] args) throws Exception{
		String data = "제이슨";
		
		//String -> byte 배열 (기본 : UTF-8 인코딩)
		byte[] arr1 = data.getBytes();
		System.out.println("arr1: " + Arrays.toString(arr1));
		
		//byte배열 -> String(기본 : UTF-8 디코딩)
		String str1 = new String(arr1);
		System.out.println("str1: " + str1);
		
		/*
		EUC-KR : 아스키코드에는 미국에서 사용되는 숫자나 알파벳만
		들어있기에 다른 문자체계가 표현불가능
		UTF-8 : 전세계 모든 문자를 유니코드에 하나로 통합
		컴퓨터가 문자를 읽는방식 
		정보를 0 1 모르는 예가 문자열을 읽을때는 대응하는 숫자를 매깁니다
		65 = 'A' 이러한 과정을 문자 인코딩이라합니다
		*/
		//euc -kr
		byte[] arr2 = data.getBytes("EUC-KR");
		System.out.println("arr2: " + Arrays.toString(arr2));
		
		//byte에서 스트링으로
		String str2 = new String(arr2, "EUC-KR");
		System.out.println("str1: " + str1);
	}
}
