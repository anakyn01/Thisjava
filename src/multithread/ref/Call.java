package multithread.ref;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
아래의 예제는 자연수를 덧셈하는 작업으로
100개의 callable을 생산하고
submit()메소드로 작업큐에 넣는다
최대 5개의 스레드로 작업큐에서  Callable을 하나씩 꺼내어
call()메소드를 실행하면서 작업을 처리한다

Future의 get()메소드는 작업이 끝날때 까지 기다렷다가 call()
메소드가 리턴한 값을 리턴한다
*/
public class Call {
	public static void main(String a[]) {
		ExecutorService executorService = Executors.newFixedThreadPool(5);
for (int i=1; i <= 100; i++) {
	final int idx = i;
	Future<Integer> future = executorService.submit(new Callable<Integer>() {
		@Override
		public Integer call() throws Exception{
			int sum = 0;
			for(int i=1; i<=idx; i++) {
				sum += i;
			}
			Thread thread = Thread.currentThread();//실행 스레드의 주소값을 보기위해서
			System.out.println("["+ thread.getName() + "] 1 ~" + idx + " 합 계산" );
			return sum; //작업 처리결과 리턴
		}
	});
	
	//Callable의 call()메소드가 리턴한 값 얻기
	try {
		int result = future.get();
		System.out.println("\t리턴값: " + result); // 이스케이프 시퀀스중 \n \t탭
	}catch (Exception e) {
		e.printStackTrace();
	}
}
		
		
		
		
		
		
		
		
	}

}
