package generic.para;

/*
제한된 타입 파라미터
경우에 따라서는 타입 파라미터를 대체하는 구체적인 타입을 제한한 필요가 있다
예를 들어 숫자를 연산하는 제네릭메소드는 대체 타입으로 Number또는 
자식클래스(byte,short,Integer,Long,Double)로 제한할 필요가 있습니다

모든 타입을 대체할수 없고 특정타입과 자식 또는 구현관계에 있는 타입만 
대체할수 있는 타입파라미터를 제한된 타입파라미터라 합니다

public <T extends 상위타입>리턴타입 메소드(매개변수, ...){}
*/

public class Para {
	//number 타입과 자식 클래스에만 대체 가능한 파라미터를 정의
	public <T extends Number> boolean compare(T t1, T t2) {
	//public <T extends 상위타입>리턴타입 메소드(매개변수, ...){}
		double v1 = t1.doubleValue(); //Number의 doubleValue()메소드 사용
		double v2 = t2.doubleValue();
		return (v1 == v2);
		/*
		타입 파라미터가 Number타입으로 제한되면서 Object의 메소드 뿐만 아니라
		Number가 가지고 있는 메소드도 사용할수 있다 위에서
		doubleValue()메소드는 Number타입에 정의되어 있는 메소드로 
		double타입 값을 리턴한다
		
		Object 클래스를 선언할때 extends키워드로 다른 클래스 상속받지 않으면
		암시적 자바 Object클래스를 상속받습니다
		자바의 모든 클래스는 Object의 자식이거나 자손이다
		*/
		
	}
	
	
	
	
	
	
	
	
	

}
