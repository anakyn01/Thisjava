package multithread.ref;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*작업 생성과 처리 요청
하나의 작업은 Runnable 또는 Callable 구현 객체로 표현한다
Runnable 과 Callable의 차이점은
처리완료후 리턴값이 있느냐 없느냐 이다

new Runnable(){
	@Override
	public void run(){
	//스레드가 처리할 작업 내용
	}
}

new Callable<T>(){
	@Override
	public T call() throws Exception{
	return T;
	}
}

작업처리 요청이란 ExcutorService의 작업 큐에 
Runnable 또는 Callable객체를 넣는 행위를 말한다
작업처리 요청을 위해 ExcutorService는 아래의 두가지 메소드를 제공한다
void excute(Runnable command) Runnable작업큐에 저장 작업 처리결과를 리턴하지 않음
Future<T> submit(Callable<T> task) Callable 을 작업큐에 저장
작업처리 결과를 얻을수 있도록 Future를 리턴
*/

public class Executor {

	public static void main(String[] args) {
	//1000개의 메일 생성
	String[][] mails = new String[1000][3];
	for(int i=0; i < mails.length; i++) {
		mails[i][0] = "admin@my.com";
		mails[i][1] = "member"+i+"@my.com";
		mails[i][2] = "신상품 입고";
	}
	// 스레드풀 생성
	ExecutorService executorService = Executors.newFixedThreadPool(5);
	//작업생성과 처리요청
	//executorService.shutdownNow();
	//이메일을 보내는 작업 생성
	for(int i=0; i<1000; i++) {
		int idx = i;
		executorService.execute(new Runnable() {
			@Override
			public void run() {
				Thread thread = Thread.currentThread();
				//스레드의 주소값을 사용해야 하는경우
				String from = mails[idx][0];
				String to = mails[idx][1];
				String content = mails[idx][2];
System.out.println("["+thread.getName()+"]"+ from + "==>"+to+": " + content);
			}
		});
	}
//ExecutorService종료
executorService.shutdown();	
	}

}
