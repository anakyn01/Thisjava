package collection.map;

public class Person implements Comparable<Person>{
//인터페이스로 정의	
	public String name;
	public int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
		
	@Override
	public int compareTo(Person o) {
		if (age < o.age) return -1;
		else if (age == o.age) return 0;
		else return 1;
	}
	/*public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}*/
	
	

}
