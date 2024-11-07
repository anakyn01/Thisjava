package collection.vector;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VecTor{

	public static void main(String[] args) {
		String vector = "arraylist와 동일한 내부 구조를 가지고 있습니다\n"+
		"차이점은 Vector는 동기화된(synchronized)메소드로 구성되어 있기 때문에\n"+
		"멀티스레드가 동시에 Vector()메소드를 실행 할수 없다는 것이다\n"+
		"그렇기 때문에 멀티스레드 환경에서는 안전하게 객체를 추가 또는 삭제할수 있다\n"+
		"Vector컬렉션은 아래와 같이 생성할수 있다\n";
		System.out.println(vector);
		
		List<String> li = new Vector<String>();//지정된 타입의 객체만 저장
		List<String> li1 =  new Vector<>();//형을 바꾸지 않으면 <>생략
		List li3 = new Vector();//모든 타입의 객체 저장

        //Vector 컬렉션 생성
		List<Board> list = new Vector<>();
		/*백터가 아닌 경우
		List<Board> list = new ArrayList<>();
		실행결과는 2000개가 나오지 않거나 
		pc에 따라 에러가 발생할수 있다
		그이유는 ArrayList는 두 스레드가 동시에 add() 메소드를 호출할수 있기 때문에
		경합이 발생해서 결국은 하나만 저장되기 때문에
		반면에 Vector의 add()는 동기화 메소드 이므로 하번에 하나의 스레드만 
		실행할수 있어 경합이 발생하지 않는다
		*/
		
		//작업 스레드 객체생성
		Thread threadA = new Thread() {
			@Override
			public void run() {
			//객체 1000개 추가
				for (int i =1; i <= 1000; i++) {
					list.add(new Board("제목"+i, "내용"+i, "글슨이"+i));
				}
			}
		};
		
		Thread threadB = new Thread() {
			@Override
			public void run() {
			//객체 1000개 추가
				for (int i =1001; i <= 2000; i++) {
					list.add(new Board("제목"+i, "내용"+i, "글슨이"+i));
				}
			}
			
		};
		
		//작업 스레드 실행
		threadA.start();
		threadB.start();
		
		//작업 스레드 들이 모두 종료될때까지 메인 스레드를 기다리게 함
		try {
			threadA.join();
			threadB.join();
		} catch(Exception e) {
			
		}
		
		//저장된 총 객체수 얻기
		int size = list.size();
		System.out.println("총 객체수 : " + size);
		System.out.println();
		
		
		
		






	}

}
