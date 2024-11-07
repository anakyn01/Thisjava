package base.hash;

public class Student {
	
	private int no;//정의
	private String name;

	public Student(int no, String name) {//객체 생성
		// TODO Auto-generated constructor stub
		this.no = no;
		this.name = name;
	}
	
	public int getNo() {return no;}//리턴
	public String getName() {return name;}
	
	@Override //해시코드로 간략하게 비교하기 위해서 클래스 재정의
	public int hashCode() {
		int hashCode = no + name.hashCode();
		return hashCode;		
	}
	/*
	Object의 hashcode()메소드를 재정의 해서 학생번호와 이름 해시코드를 합한 새로운 해시코드를 리턴함
	번호와 이름이 같으면 동일한 해시코드가 생성됨
	*/
	
	@Override
	public boolean equals(Object obj) {//instanceof : 객체 타입을 확인하는 연산자
		if(obj instanceof Student target) {
			if (no == target.getNo() && name.equals(target.getName())) {
				//만약에 번호가 같고 이름또한 지정한 얻은 이름과 같다면
				return true;
			}
		}
		return false;
	}
	/*
	Object의 equals()메소드를 재정의 해서 Student객체인지 확인하고 
	학생번호와 이름이 같으면 true를 리턴
	*/
	

}
