package base.dto;

public class Person {
private final String name;
private final int age;

	public Person(String name, int age) {
		this.name = name;
		this.age =age;
	}
	
	public String name() {return this.name;}
	public Integer age() {return this.age;}
	
	@Override
	public int hashCode() {
		return age;};
	@Override
	public boolean equals(Object obj) {
		return false;		
	}
	@Override
	public String toString() {
		return name;		
	}
	
	
	
	
	
}
