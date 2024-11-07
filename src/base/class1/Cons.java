package base.class1;

public class Cons {
	//자바에서 생성자는 클래스명칭과 같다
	int modelYear;
	String modelName;
	
	//자바 생성자
	public Cons(int year, String name) {
		modelYear = year;
		modelName = name;
	}

	public static void main(String[] args) {
		Cons myCar = new Cons(1969, "Mustang");
			System.out.println(myCar);
			System.out.println(myCar.modelYear);
	}

}
