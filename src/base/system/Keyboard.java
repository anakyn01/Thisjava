package base.system;

/*
자바는 키보드로 부터 입력된 키를 읽기 위해 
System클래스에서 in필드를 제공합니다
in필드를 이용해서 read()메소드를 호출하면 입력된 키의 고유값을 
얻을수 있습니다
int keyCode = System.in.read();
예시)
0 = 48, A = 65 Enter=13, 10
*/

public class Keyboard {
	public static void main(String[] args) throws Exception {
	int speed = 0;
	int keyCode = 0; //초기화
	
	while(true) {
		//Enter키를읽지 않은 경우만 실행
		if(keyCode != 13 && keyCode != 10) {
			if (keyCode == 49) {//숫자 1키를 읽을 경우 증속
				speed++;
			} else if(keyCode == 50) {//숫자 2키를 읽을 경우 감속
				speed--;
			} else if(keyCode == 51) {//숫자 3키를 읽을 경우 중지
				break;
			}
		    System.out.println("--------------------");
		    System.out.println("1.증속 | 2.감속 | 3.중지");
		    System.out.println("--------------------");
		    System.out.println("현재 속도=" + speed);
		    System.out.println("선택: ");
		}
		//키를 하나씩 읽음
		keyCode = System.in.read();
	}
		System.out.println("프로그램 종료");		
	}
}
