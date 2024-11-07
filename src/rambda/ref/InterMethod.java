package rambda.ref;

interface StringFunction{//1) 인터페이스 생성
	String run(String str);
}

public class InterMethod {

	public static void main(String[] args) {
		/*메서드에서 람다식을 사용하려면 메서드에 단일 메서드 인터페이스를 
		 * 해당 형식으로 사용하는 매개변수가 있어야 합니다*/
		StringFunction exclaim = (s) -> s + "!";
		StringFunction ask = (s) -> s + "?";
		printFormatted("Hello", exclaim);
		printFormatted("Hello", ask);


	}
	//2) 메소드 생성
	public static void printFormatted(String str, StringFunction format) {
		String result = format.run(str);
		System.out.println(result);
	}

}
