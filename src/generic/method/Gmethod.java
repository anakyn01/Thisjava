package generic.method;

public class Gmethod {
String Gm = "제너릭 메소드\n"+
"제너릭 메소드는 타입 파라미터를 가지고 있는 메소드를 말한다\n"+
"타입 파라미터가 메소드 선언부에 정의된다는 점에서 제네릭 타입과 차이가 있다\n"+
"제너릭 메소드는 리턴 타입 앞에 <>기호를 추가하고 파라미터를 정의한뒤\n"+
"리턴 타입과 매개변수 타입네서 사용한다.\n"+
"public <A, B, ...> 리턴타입 메소드명 (매개변수,....) {.}\n"+
"       타입파라미터 정의\n"+
"아래의 boxing() 메소드는 타입 파라미터로 <T>를 정의하고 매개변수 타입과 리턴타입에서\n"+
"T를 사용한다 정확한 리턴타입은 T를 내용물로 갖는 Box객체이\n"+
"public <T> Box<T> boxing(T t){}\n";
	public static void main(String[] args) throws Exception{
	}
}
