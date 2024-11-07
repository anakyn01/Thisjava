package multithread.ref;
/*
스레드 상태
스레드는 객체를 생성(New)하고 start메소드를 호출하면 
곧바로 스레드가 실행되는 것이 아니라 실행대기상태(RUNNABLE)가 된다
실행대기하는 스레드는 CPU스케줄링에 따라
CPU를 점유하고 run()메소드를 실행(RUNNING)한다

실행스레드는 run()메소드를 모두 실행하기전에 스케줄링에 의해서
다시 실행대기 상태로 돌아갈수 있다
그리고 다른 스레드가 실행 상태가 된다.

실행 대기 상태와 실행 상태를 번갈아 가면서 자신의 run()메소드를
조금씩 실행한다

실행 상태에서 run()메소드가 종료되면 더이상 실행할 코드가 없기 때문에
스레드의 실행을 멈춘다
이상태를 종료 상태(TERMINATED)라고 합니다

실행상태에서 일시 정지상태(스레드가 실행할수 없는 상태)로 가기도 합니다

스레드가 다시 실행상태로 가기위해서는 일시정지 상태에서
실행대기 상태로 가야만 한다

아래에서는 일시정지로 가기위한 메소드를 
벗어나기 위한 메소드 2가지를 보여준다

New => 객체생성
Start() => 스레드 실행(곧바로 실행되지 않음)
RUNNABLE => 실행하고 나서 대기 상태
RUN() => 대기하고 있던 스레드를 실행
RUNNING => 현재 실행되고 있는 스레드 러닝
TERMINATED => 종료
일시정지 => 스레드가 실행할수 없는 상태

스레드는 실행대기상태와 실행 상태를 번갈아 가면서 실행한다

일시정지 메소드
- 일시 정지로 보냄 -
sleep(long millis) => 주어진 시간 동안 스레드를 일시 정지 상태로 만든다
주어진 시간이 지나면 자동으로 실행 대기 상태가 된다
join() => 메소드를 호출한 스레드는 일시정지 상태가 된다
실행되기 상태가 되려면 join()메소드를 가진 스레드가 종료 되어야 한다
wait() 동기화 블록 내에서 스레드를 일시 정지상태로 만든다

- 일시 정지에서 벗어남 -
interrupt() : 일시 정지 상태일 경우, InterruptedException을 
발생시켜 실행 대기 상태 또는 종료상태를 만든다
notify() : 이객체에 대기 중인 스레드 하나를 깨움
notifyAll() : 이 객체에 대기 중인 모든 스레드를 깨웁니다

- 실행 대기로 보냄 -
yield() : 실행 상태에서 다른 스레드에게 실행을 양보하고 실행
대기 상태를 만든다

wait(),notify(),notifyAll() Object클래스의 메소드이고
그외는 스레드의 메소드이다

주어진 시간 동안 일시 정지 
sleep() 매개값에는 얼마 동안 일시 정지 상태로 있을지
밀리세컨드(1/1000)단위로 시간을 준다
*/

import java.awt.Toolkit;

public class Status {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<10; i++) {
			toolkit.beep();
		}try {
			Thread.sleep(1000);//1초
		}catch(InterruptedException e) {
			
		}
		
		
		
		
		
		
		
	}

}
