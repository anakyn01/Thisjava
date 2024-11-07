package base.format;

/*
Format()클래스는 숫자또는 날짜를 원하는 형태의 문자열로 변환해 주는 기능을
제공합니다 
Format클래스는 java.text패키지에 포함되어 있는데 
주요 Format클래스는 아래와 같습니다

DecimalFormat : 숫자를 형식화된 문자열로
0 = 10진수 (빈자리는 0으로 채움)
# = 10진수 (빈자리는 채우지 않음)
. = 소주점
- = 음수기호
, = 단위 구분
E = 지수 문자 1.2E6
; = 양수와 음수의 패턴을 모두 기술할경우, 패턴 구분자
+#,###; -#,###
% 12234%
\u00A4 \1.234

SimpleDateFormat : 날짜를 형식화된 문자열로
DecimalFormat 객체를 생성하고 
format()메소드로 숫자를 제공하면 패턴에 따른 형식화된 문자열을 
얻을수 있습니다
*/
import java.text.DecimalFormat;

public class Format {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num = 1234567.89;
		//DecimalFormat변수로 선언만
		DecimalFormat df;
		//정수 자리까지 표기
		df = new DecimalFormat("#,###");
		System.out.println(df.format(num));
		//무조건 소수 첫째 자리까지 표기
		DecimalFormat df2;
		df2 = new DecimalFormat("#,###.#");
		System.out.println(df2.format(num));
	}

}
