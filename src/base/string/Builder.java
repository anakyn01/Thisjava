package base.string;

/*
- String은 내부 문자열을 수정할수 없습니다
- 수정되는 것이 아니아 새로운 객체를 생성합니다
- 그리고 data변수는 새로운 String 객체를 참조합니다
String data = "ABC"
data += "DEF"
- 문자열의 연산은 새로운 String 객체가 생성되고
계속 버려지기 때문에 효율성이 좋다고 볼수 없다 
- 잦은 문자열 변경 작업을 해야 한다면 String보다
StringBuilder를 사용하는 것이 좋다
StringBuilder는 내부 버퍼(데이터를 저장하는 메모리)에 문자열을 저장해두고
그안에 추가,수정,삭제 작업을 하도록 설계되어 있습니다
그래서 String처럼 새로운 객체를 만들지 않고도 문자열을 조작할수 있다

StringBuilder메소드
append(기본값 | 문자열)= 문자열을 끝에 추가
insert(위치, 기본값 | 문자열) =  문자열 지정위치에 추가
delete(시작위치 ,끝위치) = 문자열 일부 삭제
replace(시작위치 ,끝위치, 문자열) = 문자열 일부 대체
toString () = 완성된 문자열 값을 리턴

toString ()제외한 다른메소드는 StringBuilder를 리턴하기 때문에
메소드 체이닝 패턴을 사용할수 있다 jquery
*/

public class Builder {
	public static void main(String[] args) {
		String data = new StringBuilder()
				.append("오른쪽")
				.insert(0, "왼쪽")
				.delete(3, 4)
				.toString();
		System.out.println(data);
	}
	
	
	
	
	
	
	

}
