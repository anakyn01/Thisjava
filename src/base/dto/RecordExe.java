package base.dto;

public class RecordExe {

	public static void main(String[] args) {
// DTO를 작성할때 반복적으로 사용되는 코드를 줄이기 위해 Java14 레코드가 도입
Member m = new Member("winter","눈송이", 25);
//public record Member(String id, String name, int age)
//이렇게 선언되 레코드를 타입과 이름을 이용해서 생성자 및 Getter메소드가 자동으로 추가된다
System.out.println(m.id()); //Getter 메소드 
System.out.println(m.name());
System.out.println(m.age());
System.out.println(m.toString());
System.out.println();

Member m1 = new Member("winter","눈송이", 25);
Member m2 = new Member("winter","눈송이", 25);
//해시코드 출력
System.out.println("m1.hashCode(): " + m1.hashCode());
System.out.println("m2.hashCode(): " + m2.hashCode());
//동등비교
System.out.println("m1.equals(m2): " + m1.equals(m2));
/*
getter,setter를 사용하는 이유 클래스에 필드에 직접 접근하는걸 막기 위해서
자바는 객체지향 언어이고 , 객체지향은 '부품화'의 정점이다
메소드는 부품화의 예시중에 하나인데
연관된 로직들을 결합해서 메소드라는 완제품의 파츠들을 만들고
이메소드들을 부품으로 하나의 완제품인 독립된 객체를 만듭니다
내부의 동작방법을 안으로 숨기고 사용자에겐 그부품의 사용법만을 노출
따라서 객체의 데이터는 함부로 공개하지 않는다 그래서 사용하는 것이 getter, setter입니다
setter : 외부에서 메소드를 통해 데이터에 접근하면 매개값을 검증해서 유효한 데이터로 저장할수 있다
getter : 데이터 복사본을 던져주기 때문에 원래 객체의 데이터를 손상시키지 않는다
원본 데이터는 안전하고 간단하게 생성자를 통해서만 데이터를 넣어줄수 있고
getter메소드만 잇다면 외부에서는 객체의 원본데이터를 변경할수 없다
*/







	}

}
