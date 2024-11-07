package generic.wild;



public class Intro {
public static void main(String arg[]) throws Exception {
	String wildcard = "와일드카드 타입 파라미터\n"+
"제네릭 타입을 매개값이나 리턴 타입으로 사용할때 타입 파라미터로 와일드카드를 사용할 수 있다\n"+
"범위에 있는 모든 타입으로 대체할수 있다는표시\n"+
"예를 들어 상속관계 가 그림과 같이 있는 경우\n"+
"타입 파라미터의 대체 타입으로 Student와 그에 자식 클래스인 고등,중등만 가능하도록\n"+
"매개변수를 아래와 같이 선언할 경우\n"+
"리턴타입 메소드명 (제네릭 타입<? extends Student> 변수) {}\n"+
"반대로 Worker와 부모클래스인 Person만 가능하도록 매개변수를 아래와 같이 선언할수 있다\n"+
"리턴타입 메소드명 (제네릭 타입<?super Worker > 변수) {}\n"+
"어떤 타입이든 가능하도록 매개변수를 선언할수도 있다\n"+
"리턴타입 메소드명 (제네릭 타입<?> 변수) {}";
	System.out.println(wildcard);
	
}
}
