package multithread.ref;
/*
데몬스레드는 주 스레드의 작업을 돕는 보조적인 역활을 수행하는 스레드입니다
주스레드가 종료되면 데몬 스레드도 따라서 자동종료가 된다
데몬스레드를 적용한 예로는 워드프로세서의 자동저장
미디어 플레이어의 동영상및 음악재생, 가비지 컬렉터 등이 있는데
여기에서 주 스레드(워드프로세스,미디어플레이어,JVM)종료되면
데몬 스레드도 같이 종료된다
스레드를 데몬으로 만들기 위해서는 주스레드가 데몬이 될 스레드의 setDaemon(true)를 
호출하면 된다
아래에 예를 보면 메인스레드는 주스레드, AutoSaveThread는 데몬스레드가 된다
AutoSaveThread thread = new AutoSaveThread();
thread.setDaemon(true)
thread.start()

아래에서 실행할 예제는 1초 주기로 save()메소드를 호출하는 
AutoSaveThread를 데몬스레드로 실행시킨다
그리고 메인 스레드가 3초후 종료되면 autoSaveThread도 따라서 자동종료된다
*/

public class Daemon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AutoSaveThread autoSaveThread = new AutoSaveThread();
autoSaveThread.setDaemon(true);//AutoSaveThread를 데몬스레드로 만듬
autoSaveThread.start();

try {
	Thread.sleep(3000);
}catch (InterruptedException e) {	
}
System.out.println("메인 스레드 종료");






	}

}
