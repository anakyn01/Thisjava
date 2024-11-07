package collection.map;

import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class Treemap {
/*
TreeSet과의 차이점은

TreeMap (key value)로 저장된 Entry를 저장한다는 점
TreeMap에 엔트리를 저장하면 키를 기준으로 자동 정렬이 됩니다
부모키와 값과 비교해서 낮은 것은 왼쪽, 높은것은 오른쪽 자식 노드에 Entry객체를 저장한다
Map 타입변수에 대입해도 되지만 TreeMap 타입으로 대입하는 이유는
검색관련 메소드가 treeMap에만 정의되어 있기 때문입니다

Map.Entry<K,V> : firstEntry => 제일 낮은 Map.Entry를 리턴
Map.Entry<K,V> : lastEntry => 제일 높은 Map.Entry를 리턴
Map.Entry<K,V> : lowerEntry(K key) : 주어진 키보다 바로아래 Map.Entry를 리턴
Map.Entry<K,V> : HigherEntry(K key) : 주어진 키보다 바로위 Map.Entry를 리턴
Map.Entry<K,V> : pollFirstEntry() : 제일 낮은 Map.Entry를 꺼내오고 컬렉션에서 제거함
Map.Entry<K,V> : pollLastEntry() : 제일 높은 Map.Entry를 꺼내오고 컬렉션에서 제거함
Map.Entry<K,V> : floorEntry(K key) : 주어진 키와 동등한 키가 있으면 해당 Map.Entry를 리턴
없다면 주어진 키 바로아래 Map.Entry를 리턴
Map.Entry<K,V> : ceilingEntry(K key) : 주어진 키와 동등한 키가 있으면 해당 Map.Entry를 리턴
없다면 주어진 키 바로 위 Map.Entry를 리턴

NavigableMap<K,V> : headMap() => 주어진 키보다 낮은 Map.Entry들을
NavigableMap으로 리턴 주어진 키의 Map.Entry포함여부는 두번째 매개 값에 따라 달라짐
NavigableMap<K,V> : tailMap() => 주어진 객체보다 높은 Map.Entry들을
NavigableMap으로 리턴 두번째 매개 값에 따라 달라짐
NavigableMap<K,V> : subMap()  => 시작과 끝으로 주어진 키 사이의 Map.Entry들을
NavigableMap으로 리턴 두번째,네번째 매개값에 따라 달라짐
*/

	public static void main(String[] args) {
		// 아래에 예제에서는 페이지 번호를 무작위로 저장하고 검색하는 방법을 보여준다
		TreeMap<String,Integer> treeMap = new TreeMap<>();
		
		//엔트리 저장
		treeMap.put("apple", 10);
		treeMap.put("forever", 60);
		treeMap.put("description", 40);
		treeMap.put("ever", 50);
		treeMap.put("zoo", 80);
		treeMap.put("base", 20);
		treeMap.put("guess", 70);
		treeMap.put("cherry", 30);
		
		//정렬된 엔트리를 하나씩 가져오기
		Set<Entry<String, Integer>> entrySet = treeMap.entrySet();
		for(Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey()+"-"+entry.getValue());			
		}
		System.out.println();
		
		//특정키에 대한 값 가져오기
		Entry<String, Integer> entry = null;
		
		entry = treeMap.firstEntry();
		System.out.println("제일 앞 단어: " + entry.getKey() + "-" + entry.getValue());
		
		entry = treeMap.lastEntry();
		System.out.println("제일 뒤 단어: " + entry.getKey() + "-" + entry.getValue());
		
		entry = treeMap.lowerEntry("ever");
		System.out.println("ever 앞 단어: " + entry.getKey() + "-" + entry.getValue() + "\n");
		
		//내림차순으로 정렬하기 
		//오름차순 (Ascending[가나다 ABC]) 내림차순(Descending[그반대])
		NavigableMap<String, Integer> descendingMap = treeMap.descendingMap();
		Set<Entry<String, Integer>> descendingEntrySet = descendingMap.entrySet();
		for (Entry<String, Integer> e: descendingEntrySet) {
			System.out.println(e.getKey() + "-" + e.getValue());
		}
		System.out.println();
		
		//범위 검색
		System.out.println("[c~h 사이의 단어 검색]");
		
		NavigableMap<String, Integer> rangeMap = treeMap.subMap("c", true, "h", false);
		for(Entry<String, Integer> e: rangeMap.entrySet()) {
			System.out.println(e.getKey()+"-"+e.getValue());
		}

	}

}
