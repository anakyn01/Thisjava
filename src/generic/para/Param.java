package generic.para;

public class Param {
	//제한된 타입 파라미터를 갖는 제네릭 메소드
	public static <T extends Number> boolean compare(T t1, T t2) {
		//타입 파라미터  T를 대체할 타입을 Number로 제한
		
		//T의 타입을 출력
		System.out.println("compare(" + t1.getClass().getSimpleName()+","+t2.getClass().getSimpleName()+")");
		//getClass (클래스 객체를 얻음) getSimpleName() 패키지 경로가 포함되지 않은 클래스명만 추출
		//Number의 메소드 사용
		double v1 = t1.doubleValue();
		//Number타입의 doubleValue()메소드 호출
		double v2 = t2.doubleValue();
		
		return (v1 == v2);
		
	}
	

	public static void main(String[] args) {
		// 제너릭 메소드 호출
		boolean result1 = compare(10, 20);
		System.out.println(result1);
		System.out.println();
		
		boolean result2 = compare(4.5, 4.5);
		System.out.println(result2);
		
		
		
		
		
		
		

	}

}
