package multithread.ref;

/*5초 동안 A와 B가 번갈아가면서 실행 
5초 뒤에 메인스레드가 work필드를 false변경 함으로써 
ThreadA가 yield()메소드를 호출함
양보햇다가 다시 받아서 번갈아 가면서 실행
*/
public class WorkThread extends Thread {
 public boolean work = true;
 
 //생성자
 public WorkThread(String name) {
	 setName(name);
 }
 //메소드
 public void run() {
	 while(true) {
		 if(work) {
			 System.out.println(getName() + ": 작업처리");
		 }else {
			 Thread.yield();
		 }
	 }
 }
 
 
 
 
 
 
 
}
