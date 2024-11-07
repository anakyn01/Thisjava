package multithread.ref;

public class WorkObject {
 public synchronized void methodA() {
	 Thread thread = Thread.currentThread();
	 //실행 중인 스레드의 주소 값을 사용해야 하는경우 currentThread()
	 System.out.println(thread.getName()+":methodA 작업실행");
	 notify();//다른 스레드를 대기 상태로 만듬
	 try {
		 wait();//자신의 스레드는 일시정지 상태로 만듬
	 }catch(InterruptedException e) {		 
	 }
 }
 
 public synchronized void methodB() {
	 Thread thread = Thread.currentThread();
	 //실행 중인 스레드의 주소 값을 사용해야 하는경우 currentThread()
	 System.out.println(thread.getName()+":methodB 작업실행");
	 notify();//다른 스레드를 대기 상태로 만듬
	 try {
		 wait();//자신의 스레드는 일시정지 상태로 만듬
	 }catch(InterruptedException e) {		 
	 }
 }


}
