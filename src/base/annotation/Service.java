package base.annotation;

public class Service {
	//Ano Annotation 적용
	@Ano
	public void Function1() {
		System.out.println("실행 내용 1");
	}
	
	@Ano("*")
	public void Function2() {
		System.out.println("실행 내용 2");
	}
	
	@Ano(value="#", number=20)
	public void Function3() {
		System.out.println("실행 내용 3");
	}

}
