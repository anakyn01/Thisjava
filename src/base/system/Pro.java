package base.system;
/*
운영체제는 실행중인 프로그램을 프로세스로 관리한다
자바프로그램을 시작하면 JVM 프로세스가 생성되고
이프로세스가 main()을 호출한다
프로세스를 강제 종료하고 싶으면 
System.exit(int status(0))
0 = 정상종료
1 ~ -1 = 비정상 종료
*/

public class Pro {

	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			System.out.println(i);
			if(i == 5) {
			System.out.println("프로세스 강제 종료");
			System.exit(0);
			}
		}

	}

}
