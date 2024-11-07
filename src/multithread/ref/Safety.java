package multithread.ref;

public class Safety {

	public static void main(String[] args) {
		Thread thread = new PrintThread2();
		thread.start();
		
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			
		}
		thread.interrupt();
		
		// TODO Auto-generated method stub
		PrintThread printThread = new PrintThread();
		printThread.start();
		
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			
		}
		printThread.setStop(true);//PrintThread를 종료하기 위해 stop필드 변경
	}

}
/*
스레드는 자신의 run()메소드 모두 실행되면 자동적으로 종료되지만
경우에 따라서는 실행중인 스레드를 즉시 종료할 필요가 있다
사용자 멈춤이 요구되는 경우
스레드를 강제 종료시키기 위해서는 stop()을 사용하엿으나 
더이상 사용하지 않음으로  바뀌었습니다
그이유가 스레드를 갑자기 종료하면 사용중이던 리소스들이
불안전한 상태로 남겨지기 때문입니다
여기에서 리소스란 파일, 네트워크 연결등을 말한다
스레드를 안전하게 종료하는 방법은 사용하던 리소스들을 정리하고
run()메소드를 빨리 종료하는 것이다
주로 조건 이용밥업과 interrupt()메소드 이용 방법을 사용한다

조건이용
스레드가 while문을 반복 실행한 경우 조건을 이용해서 run()메소드의 종료를 유도
stop필드조건

private boolean stop;

public void run(){
while(!stop){
}
//스레드가 사용한 리소스 정리

interrupt() 메소드 이용
일시정지 상태에 있을때 InterruptedEaxception예외를 발생시키는
역활을 한다
이것을 이용하면 예외처리를 통해 run()메소드를 정상종료 시킨다
1) start()
2) interrupt() 
3) InterruptedException이 발생하여 예외처리 블록으로 이동합니다
4) while에서 빠져나와 자원을 정리하고 스레드가 종료되는 효과를 가져온다




*/
