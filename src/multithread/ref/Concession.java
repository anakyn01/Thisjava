package multithread.ref;
/*다른 스레드에게 실행 양보
스레드가 처리하는 작업은 반복적인 실행을 위해 for문이나
while문을 포함하는 경우가 많은데
무의미한 반복을 하는 경우가 있다

public void run(){
while(true){
if(work)
System.out.println("ThreadA 작업내용");
}else{
Thread.yield(); 
}
}
이럴때는 다른 스레드에게 실행을 양보하는것이 
프로그램 성능에 도움이 된다
실행양보하고 자신은 실행대기상태 
yield()라는 메소드를 제공한다 호출한 스레드는 실행대기 상태, 다른 스레드 실행

InterruptedException (자신이 해야될 일을 정상적으로 완료하지 못함)
프로세서가 A일을 진행하다가 B의 일을 진행할때 
하던일을 멈추도록하는 매커니즘중에 하나이다
 * */

public class Concession {

	public static void main(String[] args) {
		WorkThread workThreadA = new WorkThread("workThreadA");
		WorkThread workThreadB = new WorkThread("workThreadB");
		workThreadA.start();
		workThreadB.start();
		try {Thread.sleep(5000);}catch(InterruptedException e) {}
		workThreadA.work = false;
		try {Thread.sleep(10000);}catch(InterruptedException e) {}
		workThreadB.work = false;
	}

}
