package base.hash;

public class Equals {

	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		if(obj1.equals(obj2)) {
			System.out.println("동등");
		}else {
			System.out.println("동등하지 않음");
		}
		
		if(obj1.equals(obj3)) {
			System.out.println("동등");
		}else {
			System.out.println("동등하지 않음");
		}
	}

}
