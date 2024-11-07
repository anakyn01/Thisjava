package base.hash;

import java.util.HashSet;

public class Hash {

	public static void main(String[] args) {
		Student s1 = new Student(1, "홍길동");
		Student s2 = new Student(2, "홍길동");
	if(s1.hashCode() == s2.hashCode()) {
		if(s1.equals(s2)) {//해시코드로 판단
			System.out.println("동등 객체입니다");
			}else {
			System.out.println("데이터가 다르므로 동등 객체가 아닙니다");
			}
		}else {
		System.out.println("데이터가 다르므로 동등 객체가 아닙니다");
		}
	}
}
