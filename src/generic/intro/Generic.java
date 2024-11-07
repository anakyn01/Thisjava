package generic.intro;

public class Generic {

	public static void main(String[] args) {
		BOX<String> box1 = new BOX<>();
		box1.content = "안녕하세요";
		String str = box1.content;
		System.out.println(str);
		
		BOX<Integer>box2 = new BOX<>();
		box2.content = 100;
		int value = box2.content;
		System.out.println(value);
	}

}
