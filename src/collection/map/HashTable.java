package collection.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String table = "Hashtabl\n"+
		"- HashMap과 동일하 내부 구조를 가지고 있다\n"+
		"- 차이점은 Hashtable은 동기화된 메소드로 구성되어 있다\n"+
		"- 멀티스레드에서 동시에 Hashtable메소드를 실행할수 없다\n"+
		"- 멀티 스레드 환경에서도 안전하게 객체를 추가 ,삭제 할수 있다";
		System.out.println(table);
		
		//Hashtable 컬렉션 생성
		Map<String, Integer> map = new Hashtable<>();
		/*Map을 사용할 경우
		Map<String, Integer> map = new HashMap<>();*/
		
		//A
		Thread threadA = new Thread() {
				@Override
				public void run() {
				//엔트리 1000개 추가
				for (int i =1; i <= 1000; i++) {
					map.put(String.valueOf(i), i);
				}
			}
		};
		
		//valueOf(i)해당안에 ()를 객체로 변환
		//B
		Thread threadB = new Thread() {
			@Override
			public void run() {
			//엔트리 1000개 추가
			for (int i =1001; i <= 2000; i++) {
				map.put(String.valueOf(i), i);
			}
		}
		};
		
		//작업스레드를 실행
		threadA.start();
		threadB.start();
		
		//작업스레들이 순차적으로 실행되게끔 
		try {
			threadA.join();
			threadB.join();
		}catch (Exception e) {
			
		}

		
		//저장된 총 엔트리 수 얻기
		int size = map.size();
		System.out.println("총 엔트리수: " + size);
		System.out.println();
		
		
		
		

	}

}
