package base.ref;
/*
자바는 클래스와 인터페이스의 메타 정보를 class객체로 관리한다.
여기서 메타정보란 [패키지정보,타입정보,맴버(생성자,필드,메소드)]정보등을 말한다
이러한 메타 정보를 프로그램에서 읽고 수정하는 행위를 리플렉션 이라고 
합니다

프로그램에서 Class객체를 얻으려면 아래에 3가지 방법중 하나를 이용하면 됩니다

- 클래스로부터 얻는 방법 - 
Class clazz = 클래스이름.class
Class clazz = Class.forName("패키지...클래스이름");

- 객체로부터 얻는 방법 - 
Class clazz = 객체참조변수.getClass();

패키지 타입(클래스, 인터페이스) 정보 얻기
Package getPackage() : 패키지 정보 읽기
String getSimpleName() : 패키지를 제외한 타입이름
String getName() : 패키지를 포함한 전체 타입이름
*/
import java.lang.reflect.*;


public class GetClass {
	public static void main(String[] args) throws Exception{
		Class clazz = Car.class;
		
		System.out.println("[생성자 정보]");
		Constructor[] constructors = clazz.getDeclaredConstructors();
		
		for (Constructor constructor : constructors) {
			System.out.print(constructor.getName() + "(");
			Class[] parameters = constructor.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}
		System.out.println();
		
		System.out.println("[필드 정보]");
		Field[] fields = clazz.getDeclaredFields();
		for(Field field : fields) {
			System.out.println(field.getType().getName()+ " " + field.getName());
		}
		System.out.println();
		
		System.out.println("[메소드 정보]");
		Method[] methods = clazz.getDeclaredMethods();
		for(Method method : methods) {
			System.out.print(method.getName() + "(");
			Class[] parameters = method.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}
	}

	private static void printParameters(Class[] parameters) {
		// 생성자 및 메소드의 매개변수 정보를 출력
		for(int i=0; i<parameters.length; i++) {//정보를 출력
			System.out.print(parameters[i].getName());
			if(i<(parameters.length-1)) {//만약 끝에 도달하지 않는다면 쉼표로 구분
				System.out.print(",");
			}
		}
		
	}
	
	
	
	
	
	
	
	
	
	

}
