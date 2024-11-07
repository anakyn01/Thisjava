package base.system;

/*
try and catch
try = 이상이 없으면 실행됨
catch = 오류가 있으면 실행할 코드블록 정의
둘다 세트로 제공이 되며
finally는 선택사항 = 결과에 상관없이 출력을 보장함

throw를 사용하면 사용자 정의오류를 생성합니다
*/
public class Exp {
	
	static void checkAge(int age) {
		if (age < 46) {
			throw new ArithmeticException("사용이 거부됨");
		}else {
			System.out.println("사용이 허가됨");
		}
		
	}
	
	
	
	public static void main(String[] args) {
		try {
			int[] myNumbers = {1,2,3};
			System.out.println(myNumbers[0]);
		}catch (Exception e) {
			System.out.println("잘못됨");
		}finally {
			System.out.println("프로세스가 종료됨");
		}
		checkAge(46);
	}
}
