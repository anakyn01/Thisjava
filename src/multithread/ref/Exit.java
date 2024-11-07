package multithread.ref;

/*다른 스레드의 종료를 기다림
독립적으로 실행되지만
다른 스레드가 종료될때까지 실행해야 되는 경우가 있다
예를 들어 계산스레드의 작업이 종료된후에 그 결과값을 받아처리하는 경우이다
이를 위해 스레드는 join()메소드를 제공한다
ThreadA가 ThreadB의 join메소드를 호출하면 
ThreadA는 ThreadB가 종료 할때까지 일시 정지 상태가 됩니다
ThreadB run()메소드가 종료되고 나서야 ThreadA는 일시정지에서
풀려 다음코드를 실행합니다

ThreadA
threadB.start() -> run()
threadB.join() => ThreadA 일시 정지
*/

public class Exit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SumThread sumThread = new SumThread();
sumThread.start();
try {sumThread.join();}catch(InterruptedException e) {}
System.out.println("1-100합: " + sumThread.getSum());				
	}

}
