package collection.map;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hashset {

	public static void main(String[] args) {
		// HashSet컬렉션 생성
		Set<String> set = new HashSet<String>();
		// 객체추가
		set.add("Java");
		set.add("JDBC");
		set.add("JSP");
		set.add("Spring");
		
		//객체를 하나씩 가져와 처리
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			//객체를 하나 가져오기
			String element = iterator.next();
			System.out.println(element);
			if(element.equals("JSP")) {
				iterator.remove();
			}
		}
		System.out.println();
		
		//객체제거
		set.remove("JDBC");
		
		//객체를 하나씩 가져와서 처리
		for(String element : set) {
			System.out.println(element);
		}
		
		
		
		
		
		
		
		
		
		

	}

}
