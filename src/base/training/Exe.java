package base.training;

import java.lang.reflect.Method;
/*
Method,property,constructor를 미리 파악함으로
사용할 정보를 열거하거나 시각적 개발환경을 구축합니다
객체를 통해 클래스의 정보를 분석해내는 프로그램 기법
클래스에 대한 정보가 마치 거울에 투영된 모습과 닮아있어 리플렉션 이라는 이름을 가짐
리플렉션 덕분에 @Component, @Bean과 같은 어노테이션을 프레임워크 기능을 
사용하기 위해 사용할수 있는것
*/

public class Exe {
/*
예외(Exception) => error라고 생각하시면 편함
개발자의 실수나 예기치 못한 상황등 여러가지 입니다
예외의 종류는 크게 2가지가 있습니다
컴파일시 발생하는 컴파일 에러(문법상의 오류)
프로그램이 구동되는 중에 발생하는 런타임 에러(설계가 잘못되서 발생합니다)

그래서 자바에서는 이러한 Exception을 처리하기 위해 
java.lang.Exception이라는 최상위 클래스를 제공합니다
예외 처리 기본
try{}catch(예외 클래스){}finally{}

예외 던지기 (throw, throws)
throw => 개발자가 의도적으로 예외를 발생시키는 것
비즈로직을 구현하는 과정중 컴파일에 문제는 없지만 해당 비즈니스 로직이
개발자가 의도한 대로 통과하지 못했을경우 고의로 예외를 발생시켜야 할때 사용됩니다

throws => 메서드 내에서 예외처리를 하지 않고 해당 메서드를 사용한 곳에서
예외 처리를 하도록 예외를 위로 던지는 것 예외를 전가하는것 입니다
*/
	public static void main(String[] args) throws Exception{
		
Method[] declaredMethods = Service.class.getDeclaredMethods();
for(Method method: declaredMethods) {
	PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
	
	printLine(printAnnotation); //설정 정보를 이용해 선 출력
	method.invoke(new Service());//메소드 호출
	printLine(printAnnotation);
}		
}

public static void printLine(PrintAnnotation printAnnotation) {
if(printAnnotation != null) {//존재 한다면
	int number = printAnnotation.number();
	for(int i=0; i<number; i++) {
		String value = printAnnotation.value();
		System.out.print(value);
	}
	System.out.println();
}
	
}

}
