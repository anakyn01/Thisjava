package generic.type;

public class CarAgency implements Rentable<Car>{
	//타입 파라미터 P를 Car로 대체
	@Override
	public Car rent() {
		return new Car();
	}

}
