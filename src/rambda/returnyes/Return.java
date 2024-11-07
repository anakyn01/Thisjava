package rambda.returnyes;
/*
리턴값이 있는 람다식
함수형 인터페이스에 추상 메소드에 리턴값이 있을 경우
람다식은 아래와 같이 작성할수 있다
return문이 하나만 있을경우 중괄호와 함께 리턴 이키워드를 생략할수 잇다
리턴값은 연산식 또는 리턴값이 있는 메소드 호출로 대체할수 있다

(매개변수, ...) -> {
실행문;
return 값
}
(매개변수,...) -> 값
*/
public class Return {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Person person = new Person();
	//실행문이 두개 이상일 경우
	person.action((x, y) ->{
		double result = x + y;
		return result;
	});
	
	//리턴문이 하나만 있을경우 (연산식)
	person.action((x, y) ->{
	return (x+y);	
	});
	
	//리턴문이 하나만 있을경우 생략
	person.action((x,y)->(x+y));
	
	//리턴문이 하나만 있을 경우 (메소드 호출)
	person.action((x, y) ->{
	return sum(x,y);
	});

	person.action((x,y) -> sum(x, y));
	}

	private static double sum(double x, double y) {
		// TODO Auto-generated method stub
		return (x+y);
	}

}
