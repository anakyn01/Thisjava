package base.annotation;

import java.lang.reflect.Method;
//getMethod 로 차는것이 아니아 getMethod를 통해서 클래스에 선언되어 있는 클래스를 전부취득


public class Exe {
/*
바로 처리 하지 않고 throw하는가?

FileInputStream에서는 FileNotFoundException도 발생할수 있고
SecurityException도 발생할수 있다

1.API가 제공하는 method는 사전에 예외가 발생할수 있음을 선언부에 명시
2.그리고 프로그래머가 그 예외에 대처하도록 합니다
3.이는 API내부에서 예외처리를 하면 외부의 프로그래머 입장에서는 
무슨일이 일어난지 알수 없기 때문이다

내부적으로 예외를 처리해 버리면 프로그래머 입장에서는 예외가 발생한 건지 조차 알수 없다
이상하게 돌아가도 왜 그런지 알수가 없다
따라서 예외에 대하 계획도 할수가 없다

예외 throw를 하는 이유는 API를 사용하는 개발자가 상황을 인지 하고 각자의 상황에 맞게
유련한 예외처리를 할 수 있도록 하기 위함입니다

super class가 throw하는 예외의 상위 예외를 throw 할수 없다
예를 들어 Parent에서 IOExcrption을 throw하는 method를 child에서 재정의할때
Exception을 throw하도록 하룻 없습니다
*/
	public static void main(String[] args) throws Exception {
		Method[] declaredMethods = Service.class.getDeclaredMethods();
		for(Method method : declaredMethods) {
			//Ano 얻기
			Ano printAnnotation = method.getAnnotation(Ano.class);
			
			//설정 정보를 이용해서 선 출력
			printLine(printAnnotation);
			
			//메소드 호출 invoke(먹이다,부르다)
			method.invoke(new Service());
			
			//설정 정보를 이용해서 선출력
			printLine(printAnnotation);
			
		}

	}

	private static void printLine(Ano printAnnotation) {
		if(printAnnotation != null) {//printAnnotation존재 한다면
			//number속성값 얻기
			int number = printAnnotation.number();
			for (int i=0; i <number; i++) {
				//value 속성값 얻기
				String value = printAnnotation.value();
				System.out.print(value);
			}
			System.out.println();
		}
		
	}

}
