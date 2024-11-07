package collection.map;

import java.util.TreeSet;

public class ComRun {

	public static void main(String[] args) {
		// TreeSet 생성
		TreeSet<Person> treeSet = new TreeSet<Person>();
		
		//객체 저장
		treeSet.add(new Person("홍길동",45));
		treeSet.add(new Person("감자",25));
		treeSet.add(new Person("김지원",31));
		
		for (Person person : treeSet) {
			System.out.println(person.name + ":" + person.age);
		}

	}

}
