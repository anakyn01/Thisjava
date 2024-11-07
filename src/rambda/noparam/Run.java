package rambda.noparam;

public class Run {

	public static void main(String[] args) {
      Person person = new Person();
      //람다 표현 실행문이 두개이상인 경우에는 중괄호가 필요합니다
      person.action(
	      () -> {
			 System.out.println("출근을 합니다");  
			 System.out.println("조퇴를 합니다");
	      }
    		  );
      //실행문이 하나일 경우 중괄호를 생략한다
      person.action(() -> System.out.println("퇴근"));

	}

}
