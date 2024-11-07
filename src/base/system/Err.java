
package base.system;

/*
자바 프로그램은 운영체제상에서 바로 실행되는 것이 아니라 자바 가상머신(jvm)에
서 실행된다 그래서 운영체제의 모든 기능을 자바 코드로 직접 접근하기가 어렵다
그래서 java.lang패키지에 속하는 System클래스를 이용하면 
운영체제의 일부 기능을 이용할수 있다
System 클래스의 정적(static)필드와 메소드를 이용하면 프로그램종료
키보드 입력, 콘솔 모니터출력,현재시간,시스템 프로퍼티 읽기가 가능하다

필드
out : 콘솔모니터에 문자출력
원하는 문자열을 출력
err : 콘솔모니터에 에러 내용 출력
콘솔에 종류에 따라서 내용이 빨간색으로 출력된다는 것이다

in : 키보트 입력

메소드
exit(int status) : 프로세스 종료
currentTimeMillis() : 현재시간을 밀리초 단위의 long값으로 리턴
nanoTime() : 현재시간을 나노초 단위의 long값으로 리턴
getProperty() : 운영체제와 사용자 정보제공
getenv() : 운영체제의 환경변수 정보제공
*/

public class Err {

	public static void main(String[] args) {
		try {
			int value = Integer.parseInt("100");
			System.out.println(value);
		}catch(NumberFormatException e) {
			System.err.println("[에러 내용]");
			System.err.println(e.getMessage());
		}finally {
			System.out.println("종료");
		}
	}
}
