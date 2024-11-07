package base.end;

/*
API 
잡에서는 표준 모듈에서 제공하는 라이브러리가 방대하기때문에
API도큐먼트가 있다 
라이브러리가 클래스와 인터페이스 집합이라면
API도큐먼트는 이를 사용하기 위한 방법을 기술한 것이다

패키지
java.lang, util, text, time, io, net, nio

클래스
Object : 자바클래스의 최상위 클래스
클래스를 선언할때 extends키워드로 다른 클래스를 상속하지 않으면
암시적으로 java Object클래스를 상속합니다
그래서 자바의 모든 클래스는 Object의 자식이거나 자손입니다
Object 메소드
boolean equals(Object obj) : 객체의 번지를 비교해서 결과를 리턴
동등비교는 객체가 비록 달라도 (객체명이)달라도 내부의 데이터가 같은지를 비교한다

int hashCode() : 객체의 해시코드를 리턴
객체를 식별하는 정수를 말한다 객체의 메모리 번지를 이용해서 해시코드를 생성
객체마다 다른 정수값을 리턴한다
두 객체가 동등한지를 비교할때 주로 사용한다
객체의 데이터를 기준으로 제정의해서 새로운 정수값을 리턴
 
record : 데이터 전달을 위한 Data Transfer Object를 작성할때
반복적으로 사용되는 코드를 줄이기 위해서 java14부터 record가 도입되었다
class기워드 대신에 record로 대체하고 클래스 이름뒤에 괄호를 작성해서 저장할 
데이터의 종류를 변수로 선언하였다
  
@Override
String to String() : 객체 문자 정보를 리턴

System : 키보드,모니터,프로세스,진행,시스템 속성(프로퍼티)
String : lombok
String,StringBuilder,StringTokenizer
packing : 기본 타입의 값을 패킹할때 사용, 문자열을 기본 타입으로 변환할때 상요
Byte,Short,Character,Integer,Float,Double,boolean
Math : 수학적인 계산이 필요할때
Class : 클래스의 메타정보(이름,구성 멤버)등을 조사할때 사용

레코드 선언 : DTO를 작성할때 반복적으로 사용되는 코드를 줄이기 위해
자바 14부터 레코드가 도입되엇다
class키워드 대신에 record로 대체하고 클래스 이름뒤에 괄호안에 
저장할 데이터의 종류를 변수로 선언

롬복 JDK에 포함된 표준라이브러리는 아니지만 개발자들이 즐겨쓰는 자동코드생성 
라이브러리
이클립스에서 빌드패스를 사용
스프링에서는 svn중에 설정 mvn, gradle중 사용 적으면 됩니다
svn 아파치 서브버전 프로젝트 소프트웨어 버전관리툴이라고도 합니다

System 클래스
필드 out,err,in
메소드 exit, currentTimeMilis
nanoTime
getProperty
getenv()

정규표현식
String regExp = "(02|010)-\\d{3,4}-\\d{4}"

어노테이션 주석 
스프링 레거시 => 어노테이션
스프링부트 => jdk
*/

public class Base {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
