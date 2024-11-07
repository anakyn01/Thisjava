package multithread.ref;

public class SumThread extends Thread{
	private long sum;
//int(4바이트) long(8바이트) int가 보유할수 없는 큰정수를 보유할때 long을 사용
	public long getSum() {
		return sum;
	}

	public void setSum(long sum) {
		this.sum = sum;
	}
	public void run() {
		for(int i=1; i<=100; i++) {
			sum+=i;
		}
	}


	

}
