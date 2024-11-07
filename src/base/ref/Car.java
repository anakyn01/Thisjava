package base.ref;

/*
맴버 정보얻기
타입(클래스, 인터페이스)가 가지고 있는 맴바정보는 아래에 메소드를
통해 얻을수 있습니다
Constructor[] getDeclaredConstructors() : 생성자 정보 읽기
Field[] getDeclaredFields() : 필드정보 읽기
Method[] getDeclaredMethods() : 메소드 정보 읽기
*/

public class Car {
	
	//필드
	private String model;
	private String owner;
	
	//생성자
	public Car() {
		
	}
	public Car(String model) {
		this.model = model;
	}
	
	//메소드
	public String getModel() {return model;}//private  리턴
	public void setModel(String model) {this.model = model;}
	public String getOwner() {return owner;}//private  리턴
	public void setOwner(String owner) {this.owner = owner;}
	
	/*Class clazz = Car.class; how1
	Class clazz = Class.forName("base.ref.Car"); how2
	
	Car car = new Car(); how3
	class clazz = car.getClass();*/
}
