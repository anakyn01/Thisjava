package multithread.ref;
/*
스레드 이름 => 작업스레드 "Thread-n"이라는 이름을 가진다
필요에 따라 작업스레드의 이름을 바꾸려면 Thread클래스의 
setName()메소드를 사용한다
thread.setName("스레드 이름");

이름을 바꾸는 이유
스레드 이름은 디버깅할때 어떤 스레드가 작업을 하는지 조사할 목적으로 주로 사용됩니다
현재 코드를 어떤 스레드가 실행하고 있는지 확인하려면 
정적 메소드인 currentThread()로 스레드 객체의 참조를 얻은 다음
getName() 메소드로 이름을 출력해 본다

아래에서는 현재 실행중인 스레드의 참조를 얻어 이름을 콘솔에 출력하고
작업 스레드의 이름을 setName() 메소드로 수정하는 방법을 보인다

Thread thread = Thread.currentThread();
System.out.println(thread.getName())
*/
public class Name {

	public static void main(String[] args) {//터미널에서의 출력
		Thread mainThread = Thread.currentThread();
		//이 코드를 실행하는 스레드 객체 참조 얻기
		System.out.println(mainThread.getName()+" 을 실행중 입니다");
		
		for(int i=0; i < 3; i++) {
			Thread threadA = new Thread() {
				@Override
				public void run() {
					System.out.println(getName() + " 실행");
					//getName()메소드는 Thread의 인스턴스 메소드로 스레드의 이름을 리턴
				}
			};
			threadA.start();
		}
		/*
		Concurrency Problems 동시성 문제
		스레드는 프로그램의 다른부분과 동시에 실행되기 때문에 코드가 어떤 순서로 실행될지
		알 수 없습니다
		그래서 그걸 해결하려면 isAlive()메소드를 사용해야 됩니다
		*/
		
		Thread chatThread = new Thread() {
			@Override
			public void run() {
				System.out.println(getName()+"실행중 입니다");
				System.out.println("Thread-n 에서 n은 넘버를 의미합니다");
			}
		};
		chatThread.setName("chat-thread");//이름을 바꾸고 
		chatThread.start();//스레드 스타트
	}

}
