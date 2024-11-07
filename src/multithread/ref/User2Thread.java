package multithread.ref;

public class User2Thread extends Thread{
private Calculator calculator;

	//스레드 이름변경
	public User2Thread() {
		setName("User2Thread");
	}
	//외부에서 공유객체인 Calculator를 받아 필드에 저장
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	//동기화 메소드 호출
	@Override
	public void run() {
	calculator.setMemory2(50);
	}
}
