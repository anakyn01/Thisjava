package collection.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CanNotMod {
	

	public static void main(String[] args) {
		// List불변
		List<String> Notmod = List.of("A","B","C");
		
		// Set불변
		Set<String> Notmod2 = Set.of("A","B","C");
		
		// Map불변
		Map<Integer, String> Notmod3 = Map.of(
			1, "A",
			2, "B",
			3, "C"
	    );
		
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		List<String> noCopy = List.copyOf(list);
		
		Set<String> set = new HashSet<>();
		set.add("A");
		set.add("B");
		set.add("C");
		Set<String> noCopy2 = Set.copyOf(set);
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		Map<Integer, String> noCopy3 = Map.copyOf(map);
		
		//배열로 부터 리스트 불변
		String[] arr = {"A","B","C"};
		List<String> noCopy4 = Arrays.asList(arr);
	}

}
/*
수정할수 없는 (unmodifiable)컬렉션이란 요소를 추가 
삭제 할수 없는 컬렉션을 의미한다
컬렉션 생성시 저장된 요소를 변경하고 싶지 않을때 유용하다
여러가지 방법으로 만들수 있는데
1)List, Set, Map인터페이스의 정적 메소드인 of()로 생성한다
List<E> immm = List.of(E...);
2) copyof => 기존 컬렉션을 복사하여 수정할수 없는 컬렉션을 만든다
3) asList => 배열로 부터 수정할수 없는 리스트 컬렉션으로 만든다
*/
