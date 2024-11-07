package stream.ref;

public class Optional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*
 * Optional 클래스
 * 집계값만 저장하는 것이 아니라 집계값이 존재하지 않는경우 디폴트값을 설정하거나
 * 집계값을 처리하는 Consumer를 등록할수 잇다
 * 
 * 리턴타입
 * boolean => isPresent() : 집계값이 있는지 여부
 * void => isPresent() : 집계값이 있을 경우 Consumer에서 처리
 * 
 * T, double, int, long  => orElse() : 집계값이 없을 경우 디폴트 값 설정
 * 
 * 컬렉션 요소는 동적으로 추가된다
 * 요소가 존재하지 않으면 집계값을 산출할수 없어서 
 * NoSuchElementEaception 예외가 발생한다
 * 하지만 위에 메소드를 이용하면 예외 발생을 막을수 있다
 * 
 * 아래와 같은 3가지 방법으로 요소(집계값)가 없는 경우를 대비할수 있다
 * isPresent() 메소드가 true를 리턴할때만 집계값을 얻는다
 * OptinalDouble optional = stream.average();
 * if(optinal.Present()){
 * System.out.println("평균: " + optinal.getAsDouble()); 
 * }else{
 * System.out.println("평균:0.0");
 * }
 * 
 * 
 * orElse()메소드로 집계값이 없을경우 대비해서 디폴트 값을 정해 놓는다
 * ifPresent() 메소드로 집계값이 있을 경우에만 동작하는 Consumer 람다식을 제공한다
 */








