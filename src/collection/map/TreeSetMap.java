package collection.map;

import java.util.NavigableSet;
import java.util.TreeSet;

/*
검색 기능을 강화시킨 TreeSet[Set], TreeMap[Map]컬렉션 입니다
TreeSet은 이진트리(binary tree)를 기반으로 한 Set컬렉션
하나의 노드로 시작해서 각 노드에 최대 2개의 노드를 연결할수 있는 구조를 가지고 있다

검색 메소드
- first() : 제일 낮은 객체를 리턴
- last() : 제일 높은 객체를 리턴
- lower(E e) : 주어진 객체보다 바로 아래 객체를 리턴
- higher(E e) : 주어진 객체보다 바로 위 객체를 리턴
- ceiling(E e) : 주어진 객체와 동등한 객체가 있으면 리턴, 만약 없다면 주어진 객체의 바로 위의 객체를 리턴
- pollFirst() : 제일 낮은 객체를 꺼내오고 컬렉션에서 제거함
- pollLast() : 제일 높은 객체를 꺼내오고 컬렉션에서 제거함
- Iterator<E> descendingIterator() : 내림차순으로 정렬된 iterator를 리턴
- NavigableSet<E> descendingSet() : 내림차순으로 정렬된 NavigableSet을 리턴
- NavigableSet<E> headSet() : 주어진 객체보다 낮은 객체들을 NavigableSet으로 리턴
- NavigableSet<E> tailSet() : 주어진 객체보다 높은 객체들을 NavigableSet으로 리턴
- NavigableSet<E> subSet() : 시작과 끝으로 주어진 객체사이의 객체들을 NavigableSet으로 리턴

NavigableSet SortedSet을 상속하는 인터페이스이다

TreeMap 
- TreeSet과 차이점은 키와 값이 저장된 Entry를 저장 한다는 점이다
- TreeMap에 엔트리를 저장하면 키를 기준으로 자동정렬이 되는데 
부모 키 값과 비교하여 낮은 것은 왼쪽,높은 것은 오른쪽 자식노드에
Entry개체를 저장한다
*/

public class TreeSetMap {

	public static void main(String[] args) {
		// 무작위로 저장한 점수를 검색하는 방법
		TreeSet<Integer> scores = new TreeSet<>();//Treeset컬렉션 생성
		//Integer객체 저장
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		//정렬된 Integer객체 하나씩 가져오기
		for(Integer s:scores) {
			System.out.println(s + " ");
		}
		System.out.println("\n");
		
		System.out.println("가장 낮은 점수: " + scores.first());
		System.out.println("가장 높은 점수: " + scores.last());
		System.out.println("95점 아래 점수: " + scores.lower(95));
		System.out.println("95점 위에 점수: " + scores.higher(95));
		System.out.println("95점 이거나 바로 아래 점수: " + scores.floor(95));
		System.out.println("85점 이거나 바로 위에 점수: " + scores.ceiling(85) + "\n");
		
		//내림차순으로 정렬하기
		NavigableSet<Integer> descendingScores = scores.descendingSet(); 
		for(Integer s: descendingScores) {
			System.out.print(s + " ");
		}
		System.out.println("\n");
		
		//범위 검색 (80 <= )
		NavigableSet<Integer> rangeSet = scores.tailSet(80, true);
		for (Integer s : rangeSet) {
			System.out.print(s + " ");
		}
		System.out.println("\n");
		
		//범위 검색 (80 <= score < 90 )
		rangeSet = scores.subSet(80, true, 90, false);
		for (Integer s : rangeSet) {
			System.out.print(s + " ");
		}
		System.out.println("\n");
		
		
		

	}

}
