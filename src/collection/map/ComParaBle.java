package collection.map;

/*
Comparable과 Comparator
TreeSet에 저장되는 객체와 TreeMap에 저장되는 키 객체는 저장과 동시에 오름차순으로 
정렬 되는데
어떤 객체든 정렬될수 있는것은 아니고 
객체가 Comparable 인터페이스를 구현하고 있어야 가능하다
Integer, Double, String 타입은 모두 Comparable을 구현하고 있기에 상관없지만
사용자 정의 객체를 저장할때는 반드시 Comparable 구현하고 있어야 한다
Comparable 인터페이스에는 CompareTo(T 0)메소드가 정의 되어있다
따라사 사용자 정의 클래스에서 이메소드를 재정의 해서 비교 결과를 
정수 값으로 리턴해야 한다

리턴타입 int
메소드 compareTo(T o)
주어진 객체와 같으면 0을 리턴
주어진 객체보다 적으면 음수를 리턴
주어진 객체보다 크면 양수를 리턴

아래에 예제는 나이를 기준으로 Person => 오름차순 으로 정렬하기 위해
Comparable 인터페이스를 구현하고 있다
나이가 적으면 -1, 같으면 0, 크면 1을 리턴한다로
compareTo() 메소드를 재정의 한다
*/

public class ComParaBle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
