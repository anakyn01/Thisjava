package rambda.noparam;

/*
각종 위젯을 클릭하거나 텍스트를 입력하거나
드래그 하는등의 UI에 적용되는 사용자의 반응을 이벤트라 한다
흔히 GUI프로그래밍에서 만날수 있는 단어이다
이러한 이벤트 처리는 Listener라고 불리우는 여러 클래스들이 담당한다
*/

public class Button {
	
	@FunctionalInterface
	public static interface ClickListener{
		void onClick();
	}
	//필드
	private ClickListener clickListener;
	
	//메소드
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	public void click() {
		this.clickListener.onClick();
	}
	
	
	
	
	
	
	
	

}
