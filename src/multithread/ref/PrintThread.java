package multithread.ref;

public class PrintThread extends Thread{
	
	private boolean stop;

	public synchronized boolean isStop() {
		return stop;
	}

	public synchronized void setStop(boolean stop) {
		this.stop = stop;//외부에서 stop필드값을 변경할수 있도록 Setter선언
	}
	
	@Override
	public void run() {
		while(!stop) {
			System.out.println("실행 중");
		}
		System.out.println("리소스 정리");
		System.out.println("실행 종료");
	}
	
	

}
