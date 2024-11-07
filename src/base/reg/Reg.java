package base.reg;
/*
문자열이 정해져 있는 형식으로 구성되어 있는지 검증해야 되는 경우
이메일이나 전화번호를 사용자가 제대로 입력했는지 검증할때
자바는 정규표현식 Regular Expression
정규표현식은 문자 또는 숫자와 관련된 반복기호가 결합된 문자열 입니다
[]
[a,b,c]
[^abc]
[a-zA-Z]
\d 한개의 숫자 [0-9]와 동일
\s 공백
\w 한개의 알파벳 또는 한개의 숫자와 동일[a-z,A~Z_0-9]중 한나의 문자
.모든문자중 한개의 문자
? 없음 또는 한개
* 없음 또는 한개 이상
* + 한개 이상
* {n} 정확히 n개
* {n,} 최소한 n개
* {n,m} n개부터 m개 까지
* a | b a또는 b
* {} 그룹핑
* 02-122-1243 또는 010-1234-5678
* (02|010)-\d{3,4}-\d{4}
* 이메일에 대한 정규 표현식은
* \w+@\w+\.\w+(\.\w+)?
*/
import java.util.regex.Pattern;

public class Reg {
public static void main(String[] args) {
	String regExp = "(02|010)-\\d{3,4}-\\d{4}";
	String data = "010-3276-0426";
	boolean result = Pattern.matches(regExp, data);
	if(result) {
		System.out.println("일치 합니다");
	}else {
		System.out.println("일치 하지 않습니다");
	}
	
	regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
	data = "anakyn@naver.com";
	result = Pattern.matches(regExp, data);
	if(result) {
		System.out.println("일치 합니다");
	}else {
		System.out.println("일치 하지 않습니다");
	}
}
	
	
	
	
	
	
	
	
	
}
