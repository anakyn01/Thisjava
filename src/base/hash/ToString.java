package base.hash;

public class ToString {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("순실","안드로이드");
		
		String strObj = myPhone.toString();
		System.out.println(strObj);
		System.out.println(myPhone);

	}

}
