package multithread.ref;

public class Calculator {
private int memory;

public int getMemory() {
	return memory;
}
//setMemory1, setMemory2는 동일하게 매개값을 메모리에 저장하고 2초간 일시정지후에 메모리값을 출력한다
public synchronized void setMemory1(int memory) {//동기화 메소드
	this.memory = memory;//메모리값 저장
	try {
		Thread.sleep(2000);//2초간 일시 정지
	}catch(InterruptedException e) {}
	System.out.println(Thread.currentThread().getName()+":"+this.memory);	
}

public void setMemory2(int memory) {
	synchronized(this) {
		this.memory = memory;//메모리값 저장
	}try {
		Thread.sleep(2000);
	}catch(InterruptedException e) {}
	System.out.println(Thread.currentThread().getName()+":"+this.memory);
}






}
