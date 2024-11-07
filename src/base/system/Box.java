package base.system;

import base.hash.Member;

/*
기본 타입의 값을 포장객체로 만드는 과정을 boxing
그반대로 포장객체에서 기본 타입의 값을 얻어내는 과정을 언박싱이라 합니다
박싱은 포장 클래스 변수에 기본 타입 값이 대입될때 발생합니다
반대로 언박싱은 포장객체가 대입될때 발생됩니다
Integer obj = 100 박싱
변수 명 = value
변수 명 = 변수명  

int value = obj 언박싱

아래와 같은 연산 과정에서도 발생됩니다
int value = obj + 50; 언박싱후 연산

포장객체는 내부 값을 비교하기 위해 ==와 !=연산자를 사용할수 없다
이 연산은 내부의 값을 비교하는 것이 아니라 포장객체의 번지를
비교하기 때문입니다
Integer obj1 = 300
Integer obj2 = 300
System.out.println(obj1 == obj2)








*/

public class Box {

	public static void main(String[] args) {
	//Boxing
	Integer obj = 100;
	System.out.println("value: "+obj.intValue());
	
	//Unboxing
	int value = obj;
	System.out.println("value: "+value);	
	
	//연산 시 unboxing
	int result = obj + 100;
	System.out.println("result: "+result);
	
	//-128 ~ 127 초과할 경우
	Integer obj1 = 300;
	Integer obj2 = 300;
	System.out.println("==: "+(obj1 == obj2));
	System.out.println("equals: " + obj1.equals(obj2));
	//값이 동등한지 여부를 따져서 맞으면 true
	//Member obj1 = new Member("blue");
	//Member obj2 = new Member("blue");
	
	//-128 ~ 127 범위값을 경우
	Integer obj3 = 10;
	Integer obj4 = 10;
	System.out.println("==: "+(obj3 == obj4));
	System.out.println("equals: " + obj3.equals(obj4));	
		
		
				
	}

}
