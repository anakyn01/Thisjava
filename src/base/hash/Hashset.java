package base.hash;

import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {
		HashSet hashSet = new HashSet(); //컬렉션 생성
		
		Student s1 = new Student(1, "이동현");
		hashSet.add(s1); //HashSet Student객체 저장
		System.out.println("저장된 객체의 수: " +  hashSet.size());
		
		Student s2 = new Student(1, "이동현");
		hashSet.add(s2); //HashSet Student객체 저장
		System.out.println("저장된 객체의 수: " +  hashSet.size());
		
		Student s3 = new Student(2, "하민혁");
		hashSet.add(s3); //HashSet Student객체 저장
		System.out.println("저장된 객체의 수: " +  hashSet.size());

	}

}
