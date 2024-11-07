package multithread.ref;

public class End {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*
멀티스레드 개념 => 
운영체제는 실행중인 프로그램을 프로세스로 관리
멀티태스킹은 두가지 이상의 작업을 동시에 처리
자바에서는 두가지 이상의 작업을 처리할때 멀티 스레드로 처리한다

메인스레드 => main() 메소드를 실행하면서 시작 
마지막 코드를 실행하거나 return문을 만나면 실행을 종료

작업 스레드 생성과 실행
1) 스레드 클래스로 직접 생성
Thread thread = new Thread(Runnable target)

2) Runnable 구현 클래스
class implements Runnable{
@Override
}

스레드 이름 : 스레드 이름에 확인이 필요하거나 
이름 변경이 필요할때
Thread thread = thread.currentThread();
thread.setName("스레드 이름");

스레드 상태
객체생성(new) start() 
실행대기상태(RUNNABLE)
실행상태(run)
종료상태(TERMINATED)
일시정지 : sleep,join,wait
일시정지에서 벗어남 : interrupt, notify, notifyAll
양보 : yield()

스레드 동기화 메소드 및 블록선언 : 
public synchronized void method(){
}

synchronized(공유객체)

스레드 안전 종료 => 조건 이용방법과 interrupt 메소드 이용
데몬스레드 자동저장
스레드 풀 => 시스템과부하를 막기 위해 스레드풀을 지정
Executor, ExecutorService를 활용
*/
