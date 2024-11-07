package generic.type;

/*
제너릭 타입은 결정되지 않은 타입을 파라미터로 가지는 클래스와 
인터페이스를 말한다.
제너릭 타입은 선언부'<>'부호가 붙고 그사이에 타입 파라미터들이 
위치 합니다

public class 클래스명<A, B,>{}
public interface 인터페이스명<A, B,>{}

타입 파라미터는 변수명 동일한 규칙인데 일반적으로 
대문자 알파벳 한글자로 표현한다.
외부에서 제네릭 타입을 사용하려면 타입 파라미터에 구체적인 
타입을 지정해야 한다 
만약 지정하지 않으면 Object타입이 암묵적으로 사용된다

아래에 예시에서 타입 파라미터를 사용하는데 사용하는 이유는
Product에 다양한 종류와 모델 제품을 저장하기 위함이다
*/
public class Product<K, M> { //타입 파라미터로 K와M정의
//필드
	private K kind;//타입 파라미터를 필드타입으로 사용
	private M model;
	//메소드 타입파라미터를 리턴 타입과 매개 변수 타입으로 사용
	public K getKind() {return this.kind;}
	public M getModel() {return this.model;}
	public void setKind(K kind) {this.kind = kind;}
	public void setModel(M model) {this.model = model;}

}
