package collection.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Sync {

	public static void main(String[] args) {
		// Map
		Map<Integer, String> map = Collections.synchronizedMap(new HashMap<>());//wraping
//A
Thread threadA = new Thread() {
	@Override
	public void run() {
		for (int i=1; i <= 1000; i++ ) {
			map.put(i, "내용"+i);
		}
	}
};
//B
Thread threadB = new Thread() {
	@Override
	public void run() {
		for (int i=1001; i <= 2000; i++ ) {
			map.put(i, "내용"+i);
		}
	}
};

threadA.start();
threadB.start();

try {
	threadA.join();
	threadB.join();
}catch(Exception e) {
	
}

int size = map.size();
System.out.println("총 객체수: " + size);
	}

}
/*
동기화된 컬렉션
컬렉션 프레임 워크의 특징
- 싱글 스레드 환경에서 사용할수 있도록 설계 되었음
- 여러 스레드가 동시에 컬렉션에 접근하면 의도하지 않게 요소가 
변경될수 있는 불안전한 상태가 됩니다
- Vector와 Hashtable은 동기화 메소드로 구성되어 있기 때문에 
멀티스레드 환경에서 안전하게 사용할수 있지만..
- 경우에 따라서는 ArrayList, HashSet, HashMap을 멀티스레드 환경에서
사용하고 싶을때가 있다
- 비동기화된 메소드를 동기화된 메소드로 ㅐ핑하는 
synchronizedXXX() 메소드를 사용한다
- synchronizedList(List<T>list)
- synchronizedMap(Map<K,V>m)
- synchronizedSet(Set<T>s)
*/
