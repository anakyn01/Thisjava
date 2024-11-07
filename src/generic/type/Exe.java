package generic.type;

public class Exe {

	public static void main(String[] args) {
		HomeAgency homeAgency = new HomeAgency();
		Home home = homeAgency.rent();
		home.turnOnLight();
		
		CarAgency carAgency = new CarAgency();
		Car car = carAgency.rent();
		car.run();
		/*타입 파라미터는 기본적으로 Object타입으로 간주되므로
		Object가 가지고 있는 메소드를 호출할수 있다.
		*/
	}

}
