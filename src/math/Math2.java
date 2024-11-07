package math;

import java.util.Arrays;
import java.util.Random;

/*
.abs() : 절대값
.ceil() :올림값
.floor(): 버림값
.max() : 최대
.min() : 최소
.random() : 랜덤값
.round() : 반올림
*/

public class Math2 {

	public static void main(String[] args) {

	double v1 = Math.ceil(5.3);
	double v2 = Math.floor(5.3);
	System.out.println("v1= " + v1);
	System.out.println("v2= " + v2);	

	//큰값또는 작은값 얻기
	long v3 = Math.max(3,7);
	long v4 = Math.min(3,7);
	System.out.println("v3= " + v3);
	System.out.println("v4= " + v4);
	
	//소수이하 2자리 얻기
	double value = 12.3456;
	double temp1 = value * 100;
	long temp2 = Math.round(temp1);
	
	/*
	random() 메소드는 0.0과 1.0사이의 double타입 난수를
	리턴합니다
	int num = (int) (Math.random() * n) + start
	
	java util random클래스를 이용할수 있음
	이클래스를 이용하면 boolean, int, double 난수를 얻을수 있습니다
	Random() = 현재 시간을 이용해서 자동 설정
	Random(long seed) = 주어진 종자값을 사용합니다
	
	종자값 : 난수를 만드는 알고리즘에 사용되는 값으로 종자값이 같으면 난수를 ]
	얻는다
	boolean[nextBoolean()], 
	int[nextInt(), nextInt(int n)], 
	double[nextDouble()]
	
	아래에서는 로또 6개 숫자
	로또는 1 ~ 45 범위의 정수 숫자만 선택 
	nextInt(45)+1
	*/
	
	//lotto
	int[] selectNumber = new int[6]; //6개가 저장될 배열생성
	Random random = new Random();
	System.out.print("선택번호: ");
	for (int i =0; i<6; i++) {
		selectNumber[i] = random.nextInt(45)+1;
		System.out.print(selectNumber[i] + " ");
	}
	System.out.println();
	
	//당첨번호
	int[] winningNumber = new int[6];
	random = new Random();
	System.out.print("당첨번호: ");
	for (int i =0; i<6; i++) {
		winningNumber[i] = random.nextInt(45)+1;
		System.out.print(winningNumber[i] + " ");
	}
	System.out.println();
	
	//당첨여부
	Arrays.sort(selectNumber);//비교전 배열 항목을 정렬시킴
	Arrays.sort(winningNumber);
	boolean result = Arrays.equals(selectNumber, winningNumber);
	System.out.print("당첨여부: ");
	if(result) {
		System.out.println("1등에 당첨 되셨습니다");
	}else {
		System.out.println("당첨 되지 않았습니다");
	}
	
	
	}

}
