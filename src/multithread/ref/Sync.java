package multithread.ref;
/*
 스레드 동기화
하나의 객체를 공유해서 작업할수 있다
다른 스레드에 의해 객체 내부데이터가 변경될수 있기 때문에
의도했던 결과와 다르게 나올수 있습니다
스레드가 사용중인 객체를 다른 스레드가 변경할수 없도록 하려면
스레드 작업이 끝날때 까지 객체에 잠금을 겁니다
이를 위해 자바는 동기화(synchronized)메소드와 블록을 제공합니다

public synchronized void method(){
단 하나의 스레드만 실행하는 영역
}
스레드가 동기화 메소드를 실행하는 즉시 객체는 잠금이 일어나고
메소드 실행이 끝나면 잠금이 풀린다
메소드 전체가 아닌 일부 영역을 실행할때만 객체잠금을 걸려면
아래와 같이 동기화를 만든다

public void method(){
//여러 스레드를 실행할수 있는 영역

synchronized(공유객체){
단 하나의 스레드만 실행
}
}
*/
public class Sync {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		//User1,2 생성
		User1Thread user1Thread = new User1Thread();
		user1Thread.setCalculator(calculator);//동기화 메소드
		user1Thread.start();
		
		User2Thread user2Thread = new User2Thread();
		user2Thread.setCalculator(calculator);//동기화 블록
		user2Thread.start();
		
		/*
		User1Thread는 Calculator의 동기화 메소드인
		setMemory1를 실행하는 순간
		1) Calculator 객체를 잠금
		2) User1Thread는 객체가 잠금 해제될때까지 
		Calculator의 동기화 블록을 실행하지 못한다
		3) 2초 일시정지후에 잠금이 해제되면 비로소 User2Thread
		동기화 블록을 실행한다
		*/
		
		
		
		
		
		
		
		
		

	}

}
