package multithread.ref;

public class IsAlive extends Thread{
	
	public static int amount = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IsAlive thread = new IsAlive();
		thread.start();
			while(thread.isAlive()) {
				System.out.println("Waiting...");
			}
		System.out.println("main: "+ amount);
		amount++;
		System.out.println("main: "+ amount);		


	}
	
	public void run() {
		amount++;
	}

}
/*
동시성 문제를 피하기 위해서 스레드간에 가능한한 적은 속성을 공유하는 것이 좋습니다
속성을 공유해야 하는경우에 가능한 해결책중에 하나는
isAlive() => 스레드가 변경할수 있는 속성을 사용하기 전에
스레드의 매서드를 사용하여 
스레드가 실행을 완료했는지 확인하는 것 입니다
*/
//System.out.println(isalive);
//String isalive = "스레드는 프로그램의 다른 부분과 동시에 실행되기 때문에 코드가 어떤 순서로 실행될지 알수가 없습니다 스레드와 메인 프로그램이 같은 변수를 읽고 쓸때 값은 예측할수 없습니다 이로 인해 발생하는 문제르 동시성 문제라 합니다";