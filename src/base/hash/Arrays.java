package base.hash;

import java.util.ArrayList;
import java.util.LinkedList;
//어레이리스트와 비슷하나 구축되는 방식이 다름 링크드리스트는  각각에 링크컨테이너 가있음 왼쪽 오른쪽을 찾을때 편리함
import java.util.HashMap;
import java.util.HashSet;
/*
기존 내장 외장 배열에 차이점
내장 -> 배열의 크기를 수정할수 없음
외장 -> 원할때마다 요소를 추가하고 제거할수 있다
클래스를 불러와서 객체생성 
*/

/*
배열은 단일 변수에 여러값을 저장해서 재사용하기 위해 사용
형 [] 어레이명
배열명에 엑세스 할때 배열명 인덱싱 변경할때도 동일
글자수 배열요소 => 배열명.length

다차원 배열 => 배열의 배열
행과 열이 있는 표와 같이 데이터를 표 형식으로 저장하려는 경우에 유용합니다
2차원 배열을 만들려면 각 배열 을 중괄호 세트내에 추가합니다
배열에 [] => 다차원일 경우 그 갯수만큼 씁니다
*/

public class Arrays {
	public static void main(String[] args) {
		String[] cars = {"v","b","f","m"};
		int[] myNum = {10,20,30,40};
		System.out.println(cars[0]);
		myNum[1] = 21;
		System.out.println(myNum[1]);
		System.out.println(myNum.length);
		
		for (int i=0; i < cars.length; i++) {
			//start index; last index; 개별증가
			System.out.println(cars[i]);
		}
		
		//연령의 평균을 계산하는 배열프로그램
		//다양한 연령중에 낮은 연령을 찾음
		int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};
		
		//avg, sum 초기화
		float avg, sum = 0;
		
		//전체 길이 
		int length = ages.length; //8
		
		//낮은 연령 변수를 생성하고 여기에 연령의 첫번째 배열요소에 할당합니다
		int lowestAge = ages[0];
		
		//반복해서 더해줌
		for (int age : ages) {
			sum += age;
			if (lowestAge > age ) {
				//더 작은 연령이 발견되면 해당요소로 업데이트
				lowestAge = age;
			}
		}
		
		//평균값 sum / 길이
		avg = sum / length;
		
		System.out.println(" 평균나이는 : " + avg);
		System.out.println(" 가장 적은 나이는 : " + lowestAge);
		
		//다차원 배열
		int [][] myNumbers = {{1,2,3,4},{5,6,7}};
		//{[0[0][1][2][3]],[1[0][1][2]]}
		myNumbers[1][2] = 9;
		System.out.println(myNumbers[1][2]);
		
		//다차원 배열에 중첩loop
		//전위 전산자[값이 먼저 증가], 
		//후위연산자[작업이 수행된 후에 값이 증가]
		for (int i = 0; i < myNumbers.length; i++) {
			for (int j = 0; j < myNumbers[i].length; j++) {
				System.out.println(myNumbers[i][j]);
			}
		}
		
		//외장 어레이
		ArrayList<String> cars2 = new ArrayList<String>();
		cars2.add("v");
		
		//링크드 리스트
		LinkedList<String> cars3 = new LinkedList<String>();
		cars3.add("v");
		//왼쪽 오른쪽을 추가할때
		cars3.addFirst("왼쪽");
		
		//해시맵 : 키와 밸류
		HashMap<String, String> capitalcities = new HashMap<String, String>();
		//추가할때 put
		capitalcities.put("korea", "seoul");
		
		//HashSet 고유함(중복을 허용하지 않음), 제거 remove, 모든제거 clear(), 자수 size(), 
		HashSet<Integer> numbers = new HashSet<Integer>();
		numbers.add(4);
		numbers.add(7);
		//확인 contains
		for(int i =0; i <= 10; i++) {
			if(numbers.contains(i)) {
				System.out.println(i + " 존재함");
			}else {
				System.out.println(i + " 존재하지 않음");
			}
		}
		
		
		
		
	}

}
