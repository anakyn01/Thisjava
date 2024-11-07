package rambda.noparam;

public class Click {

	public static void main(String[] args) {
		// OK버튼 객체 생성
		Button btnOk = new Button();
		// OK버튼 객체에 람다식(ClickListener 익명구현객체)주입
		btnOk.setClickListener(
		()-> System.out.println("OK 버튼을 클릭했습니다")		
		);
		//ok 버튼 클릭하기
		btnOk.click();
		
		// cancel 버튼 객체 생성
		Button btnCancel = new Button();
		
		// cancel 버튼 객체에 람다식(ClickListener 익명구현객체)주입
		btnCancel.setClickListener(
		()-> System.out.println("cancel 버튼을 클릭했습니다")		
		);
		//cancel 버튼 클릭하기
		btnCancel.click();
	}

}
