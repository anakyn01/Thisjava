package stream.ref;

import java.util.ArrayList;
import java.util.List;

/*Comparator를 이용한 정렬
요소객체가 Comparable을 구현하고 있지 않다면
비교자를 제공하면 요소를 정렬시킬수 있다
비교자는 Comparator인터페이스를 구현한 객체를 말하는데
명시적인 클래스 구현방법이 아닌 람다식으로 작성할수 
있습니다

sorted((o1, o2) -> {...})
코드블럭 안에서 o1  o2 보다 작으면 음수
같으면 0
크면 양수를 리턴 합니다
실수일 경우에는 더블을 사용하면 됩니다
*/

public class Compa {

	public static void main(String[] args) {
List<Student> studentList = new ArrayList<>();
studentList.add(new Student("홍길동", 30));
studentList.add(new Student("신용권", 10));
studentList.add(new Student("유미선", 20));

//점수를 기준으로 오름차순으로 정렬한 새 스트림 얻기
studentList.stream().sorted((s1, s2) -> Integer.compare(s1.getScore(), s2.getScore()))
.forEach(s -> System.out.println(s.getName() + ":" + s.getScore()));
System.out.println();

//점수를 기준으로 내림차순으로 정렬한 새 스트림
studentList.stream().sorted((s1, s2) -> Integer.compare(s2.getScore(), s1.getScore()))
.forEach(s -> System.out.println(s.getName() + ":" + s.getScore()));




	}

}
