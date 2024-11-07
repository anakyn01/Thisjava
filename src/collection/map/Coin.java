package collection.map;

//동전케이스라 가정하고 위에만 오픈되어 있기에
public class Coin {
	private int value;
	
	public Coin(int value) {
		this.value = value;//접근제어자 접근한정자는 = 인수
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	//getter setter 설정
	

}
