package generic.intro;

public class Intro {

	public static void main(String[] args) {
		String Generic = "제너릭(generic)이란?\n"+
		"데이터의'(data type)' 타입을 일반화(generalize) 한다\n"+
		"제네릭은 클래스나 메소드에서 사용할 내부 데이터 타입을 컴파일시에 미리 지정하는 방법\n"+
		"이렇게 컴파일시에 미리 타입검사(type check)를 수행하면 아래와 같은 장점을 가집니다\n"+
		"1. 클래스나 메소드 내부에서 사용되는 객체의 타입 안정성을 높일수 있습니다\n"+
		"2. 반환값에 대하 타입 변환 및 타입 검사에 들어가는 노력을 줄일수 있습니다";
		System.out.println(Generic);
	}

}
