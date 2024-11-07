package base.training;

public class Service {
	@PrintAnnotation
	public void method1() {
		System.out.println("실행 내용1");
	}
	@PrintAnnotation("*") //default에서 선의 종류만 바꿈
	public void method2() {
		System.out.println("실행 내용2");
	}
	@PrintAnnotation(value="#", number=20) //default에서 선의 종류만 바꿈
	public void method3() {
		System.out.println("실행 내용3");
	}
	
}
