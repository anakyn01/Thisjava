package generic.method;

public class Mexe {
	//제네릭 메소드
	//타입파라미터로 <T>를 정의하고 매개변수 타입과 리턴타입에서 T를 사용
	public static <T> Box<T> boxing(T t){
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
		
	}
	public static void main(String[] args) {
		//제너릭 메소드 호출
		Box<Integer> box1 = boxing(100);
		//T를 Integer로 대체
		int intValue = box1.get();
		System.out.println(intValue);
		
		Box<String>box2 = boxing("홍길동");
		String strValue = box2.get();
		System.out.println(strValue);

	}
	
	
	
	
	
	
	
	

}
