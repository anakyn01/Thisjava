package multithread.ref;

public class PrintTh extends Thread{
public void run() {
	while(true) {
		System.out.println("실행 중");
		if(Thread.interrupted()) {
			break;//스레드는 어떤 이유로 일시정지 상태가 되면 interruptedException예외가 발생합니다
		}
	}
	System.out.println("리소스 정리");
	System.out.println("실행 종료");
}
}
