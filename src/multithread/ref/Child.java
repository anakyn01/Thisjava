package multithread.ref;

import java.awt.Toolkit;

/*
또다른 방법 자식 클래스로 생성
extends Thread
작업스레드 객체를 생성하는 또다른 방법은 Thread의 자식 객체로 만드는 것이다
Thread클래스를 상속한 다음에 run()메소드를 재정의해서
스레드가 실행할 코드를 작성하고 객체를 생성하면 된다

extends Thread {
	@Override
	public void run(){
	//스레드가 실행할 코드
	}
}
//스레드 객체 생성
Thread thread = new WorkerThread();

스레드를 실행하는 방법은 동일하다 start()메소드를 호출하면 작업스레드는 
재 정의된 run()을 실행시킨다

명시적인 자식 클래스는 정의하지 않고 아래와 같이 Thread익명 자식 객체를 사용할 수도 있다
Thread thread = new Thread(){
@Override
public void run(){
}
}
*/
public class Child {

	public static void main(String[] args) {
		//스레드의 익명 자식객체로 스레드를 정의하고
		Thread thread = new Thread() {
			@Override
			public void run() {//스레드가 실행한 코드를 적는곳
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i < 5; i++) {
					toolkit.beep();//툴킷에 비프음을 만들어 줌
					try {Thread.sleep(500);} catch (Exception e) {} //사용구문에 문제가 없으면 실행 에러가 있으면 캐치
				}
			}			
		};//thread end
		
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("sound");
			try {Thread.sleep(500);} catch (Exception e) {}
		}
		
		

	}

}
