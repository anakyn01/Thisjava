package multithread.ref;

public class WaitNotify {


	public static void main(String[] args) {
		//공유 작업 객체 생성
		WorkObject workObject = new WorkObject();
		
		ThreadA threadA = new ThreadA(workObject);
		ThreadB threadB = new ThreadB(workObject);
		
		threadA.start();
		threadB.start();

	}

}
/*
경우에 따라서는 두개의 스레드를 교대로 번갈아 가며 실행할때가 있다.
정확한 교대 작업이 필요할 경우
자신의 작업이 끝나면 상대방 스레드를 일시 정지 상태에서 풀어주고
자신은 일시 정지 상태로 만들면 된다
이방법에 핵심은 공유 객체에 있는데
공유 객체는 두스레드가 작업할 내용을 각각 동기화 메소드로 정해 놓는다.
한스레드가 작업을 완료하면 notify()메소드를 호출해서  
일시 정지상태에 있는 다른 스레드를 실행 대기 상태로 만들고
자신은 두번 작업을 하지 않도록 wait()메소드를 호출하여
일시정지 상태로 만듭니다
notify()는 wait()에의해 일시정지된 스레드중 한개를 실행대기 상태로 만들고
notifyAll() wait()에의해 일시정지된 모든 스레드를 실행대기 상태로 만든다
주의할 점은 이 두 메소드는 동기화 블록또는 메소드에서 만 사용할수 있다
*/
