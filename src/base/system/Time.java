package base.system;
/*
진행시간 읽기
currentTimeMillis() 1/1000초 단위로 진행된 시간을 리턴
nanoTime() 1/10 9초 단위로 진행된 시간을 리턴
1970년 1월 1일 0시부터 시작해서 현재까지 진행된 시간을 의미합니다
*/
public class Time {
   public static void main(String[] args) {
	   long time1 = System.nanoTime();
	   int sum = 0;
	   for(int i=1; i<=1000000; i++) {
		   sum += i;
	   }
	   long time2 = System.nanoTime();
	   
	   System.out.println("1 에서 100만 까지의 합 :" + sum);
	   System.out.println(" 계산에 걸린 시간은 :" + (time2 - time1) + "나노초가 소요되었습니다");	   
   }
}
