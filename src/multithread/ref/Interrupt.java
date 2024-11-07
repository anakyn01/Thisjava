package multithread.ref;

public class Interrupt {

	public static void main(String[] args) {
		PrintTh thread = new PrintTh();
		thread.start();
		
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {			
		}
		thread.interrupt();
		/*
		interrupt메소드는 일시정지 상태에 있을때 
		InterruptedException예외를 발생시키는 역활을 한다
		*/
	}

}
