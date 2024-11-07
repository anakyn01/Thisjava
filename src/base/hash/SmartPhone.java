package base.hash;

/*
객체문자 정보
Object의 toString() 메소드는 객체의 문자정보를 리턴
객체의 문자정보는 객체를 문자열로 표현한 값을 말합니다

*/

public class SmartPhone {
	private String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}
	
	@Override
	public String toString() {
		return company + ", " + os;
	}

}
