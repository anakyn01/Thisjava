package generic.type;

public class GenericRun {

	public static void main(String[] args) {
		// 제너릭 타입을 이용하여 TV와 Car를 저장하고 얻는 방법을 보여줍니다
//K는 tv로 대체 M은 String으로 대체
Product<Tv, String> product1 = new Product<>();
//setter매개값을 반드시 Tv와 String으로 제공
product1.setKind(new Tv());
product1.setModel("스마트Tv");
//Getter리턴값은 Tv와 String이 됨
Tv tv = product1.getKind();
String tvModel = product1.getModel();

//K는 car로 대체, M은 String으로 대체
Product<Car, String> product2 = new Product<>();
//Setter매개값은 반드시  Car와 String으로 제공
product2.setKind(new Car());
product2.setModel("SUV자동차");
//Getter리턴값은 car와 string이 됨
Car car = product2.getKind();
String carModel = product2.getModel();

	}

}
