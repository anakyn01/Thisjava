package generic.type;

//집과 자동차를 렌트해 주는 대리점 클래스로 Rentable타입 파라미터를 Home과 Car로 대체해서 구현하는 방법을 보여줍니다

public class HomeAgency implements Rentable<Home> {
	@Override
	public Home rent() {
		return new Home();//리턴 타입이 반드시 Home이어야 함
	}
}
