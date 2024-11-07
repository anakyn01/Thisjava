package multithread.ref;
/*
스레드풀
병렬 작업 처리가 많아지면 스레드의 개수가 폭증하여
CPU가 바빠지고 메모리 사용량이 늘어난다
이에 따라 애플리케이션의 성능이 급격히 저하된다
이렇게 병렬 작업 증가로 인한 스레드의 폭증을 막으려면 
스레드풀을 사용하는 것이 좋다
스레드풀은 작업처리에 사용되는 스레드를 제한된 개수만큼 정해놓고
작업 큐(Queue)에 들어오는 작업들을 스레드가 하나씩 맡아 처리하는 방식이다
작업량이 증가해도 스레드의 개수가 늘어나지 않아 
애플리케이션의 성능이 급격히 저하되지 않는다

작업큐 => 스레드에서 최대개수 제한으로 보냄

스레드풀 생성
java.util.concurrent
ExecutorService 인터페이스
Executors 클래스를 제공
Executors 메소드
newCachedThreadPool() 초기수0 코어수0 최대수Integer.MAX_VALUE
newFixedThreadPool(int nThreads) 
초기수0 코어수(생성된수) 최대수 nThreads

초기수는 스레드풀이 생성될때 기본적으로 생성되는 스레드수를 말하고
코어 수는 스레드가 증가된후 사용되지 않는 스레드를 제거할때 최소한 풀에서 유지하는 스레드수를 말한다
그리고 최대수는 증가되는 스레드의 한도수이다

ExecutorService executorService = Excutors.newCachedThreadPool();
newCachedThreadPool(); 생성된 스레드풀의 초기수와 모어수는 0개이고 
작업 개수가 많아지면 새 스레드를 생성시켜 작업을 처리한다
60초 동안 스레드가 아무 작업을 하지 않으면 스레드 풀에서 제거한다

ExecutorService executorService = Excutors.newCachedThreadPool(5);
초기수는 0이고 작업개수가 많아지면 최대 5개까지 스레드를 생성시켜 작업을 처리한다
이 스레드풀의 특징은 생성된 스레드를 제거하지 않는다

ThreadPoolExcutor로 스레드풀을 생성할수도 있다
아래에서는 초기수 0개 코어수 3개, 최대수 100인 스레드풀을 생성한다
그리고 추가된 스레드가 120초 동안 놀고 있는 경우 해당 스레드풀에서 제거한다

ExecutorService executorService = new ThreadPoolExcutor(
3, 코어 스레드 개수
100, 최대 스레드 개수
120L, 놀고 있는 시간
TimeUnit.SECONDS, 놀고 있는 시간 단위
new SynchronousQueue<Runnable>() 작업큐
);

스레드폴 종료
스래드풀의 스레드는 기본적으로 데몬스레드가 아니기 때문에
main스레드가 종료되더라도 작업을 처리하기 위해 계속 실행상태로 남아있다
스레드풀의 모든 스레드를 종료하려면 ExcutorService의 아래 두 메소드중 하나를 실행한다

리턴타입 void 메소드명 shutdown(),설명 : 현재처리중인 작업뿐만 아니라 작업큐에 대기하고 있는 모든
작업을 처리한뒤 스레드풀을 종료한다

리턴타입 List<Runnable> 메소드명 shutdownNow(), 설명 : 현재 작업처리중인 스레드를 interrupt해서
작업을 중지시키고 스레드풀을 종료한다 리턴값은 작업큐에 있는 미처리된 작업(Runnable)의 목록이다

남아있는 작업을 마무리 하고 스레드풀을 종료할때는 shutdown을 호출하고
남아있는 작업과 상관없이 강제로 종료할때는 shutdownNow()를 호출한다

아래의 예제에서는 최대 5개의 스레드로 운영되는 스레드풀을 생성하고 종료한다
*/
public class Pool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
