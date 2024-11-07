package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class Hashmap {

	public static void main(String[] args) {
	String map2 = "Map컬렉션에는 hashMap, Hashtable, LinkedHashMap, Properties, TreeMap등이 있다/n"+
	"Map컬렉션에서 공통적으로 사용가능한 map인터페이스 메소드는 아래와 같다.\n"+
	"키로 객체들을 관리하기 때문에 키를 매개값으로 갖는 메소드가 많다\n"+
	"객체추가 V put(K key, V value) 주어진 키와 값을 추가, 저장이 되면 값을 리턴\n"+
	"객체검색\n"+ 
	"boolean containsKey(Object key) 주어진 키가 있는지 여부\n"+
	"boolean containsValue(Object key) 주어진 값이 있는지 여부\n"+
	"Set<Map.Entry<K,V>>entrySet() 키와 값이 쌍으로 구성된 모든 Map.Entry객체를\n"+ 
	"Set에 담아서 리턴\n"+
	"V get(Object key) 주어진 키의 값을 리턴\n"+
	"boolean isEmpty() 컬렉션이 비어 있는지 여부\n"+
	"Set<K> keySet() 모든 키를 Set객체에 담아서 리턴\n"+
	"int size() 저장된 키의 총수를 리턴\n"+
	"Collection<V> values() 저장된 모든 값을 Collection에 담아서 리턴\n"+
	
	"- 객체 삭제-/n"+
	"void clear() 모든 Map.entry(키와 값)를 삭제\n"+
	"V remove(Object key) 주어진 키와 일치하는 Map.Entry삭제 삭제가 되면 값을 리턴\n";
	System.out.println(map2);		
    //Map컬렉션 생성
	Map<String, Integer> map = new HashMap<>();
	//객체저장
	map.put("신용권", 85);
	map.put("홍길동", 90);
	map.put("동장군", 80);
	map.put("홍길동", 77);
	System.out.println("총 Entry 수:"+ map.size());
	System.out.println();
	
	//키로 값 얻기
	String key = "홍길동";
	int value = map.get(key); //키를 매개값으로 주면 값을 리턴
	System.out.println(key + ": " + value);
	System.out.println();
	
	//키 Set컬렉션을 얻고 반복해서 키와 값을 얻기
	/*
	Iterator는 자바의 컬렉션 프레임워크에서 컬렉션에 저장되어 있는 요소들을 읽어오는 방법을 표준화한것
	hasNext() : 읽어올 요소가 남아있는지 확인하느 메서드, 요소가 있으면 True, 없으면 false
	next() : 다음 데이터를 리턴
	remove():next()로 읽어온 요소를 삭제
	*/
	Set<String> keySet = map.keySet();
	Iterator<String> keyIterator = keySet.iterator();//키를 반복하기 위해 반복자를 얻음
	while (keyIterator.hasNext()) {
		String k = keyIterator.next();
		Integer v = map.get(k);
		System.out.println(k + " : " + v);
	}
	System.out.println();	
		
	//엔트리 Set컬렉션을 얻고 반복해서 키와 값을 얻기
	Set<Entry<String, Integer>> entrySet = map.entrySet();
	Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
	while (entryIterator.hasNext()) {
		Entry<String, Integer> entry = entryIterator.next();
		String k = entry.getKey();
		Integer v = entry.getValue();
		System.out.println(k + ":"+v);
	}
	System.out.println();
	
	//키로 엔트리 삭제
	map.remove("홍길동");
	System.out.println("총 Entry 수: "+map.size());
	System.out.println();
		
		
		
		
		
		
		
		
		
	String hashmap = "HashMap\n"+
	"키로 사용할 객체가 hashcode()메소드의 리턴값이 같고 equals()메소드가  true를 리턴할경우\n"+ 
	"동일 키로보고 중복을 허용하지 않는다\n"+
	"아래는 HashMap 컬렉션을 생성하는 방법이다\n"+
	"K와 V는 각각 키와 값의 타입을 지정할수 있는 타입 파라미터이다\n"+
	"Map<K V>map = new HashMap<K V>";
	System.out.println(hashmap);

	}

}
