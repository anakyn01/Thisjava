package generic.intro;

/*class Box{
	public Object content;
	/*Object타입은 모든 최상위 부모클래스 이다
	모든 객체는 부모 타입인 Object로 자동 변환이 되므로 content필드에
	어떤 객체든 대입이 가능하다
	아래예시처럼 Box안에 내용물을 얻을때 
	어떤 객체가 대입되어 있는지 확실치 않기 때문에
	내용물이  String이라 한다면 (string)으로 강제 타입변환해서 내용물을 얻는다
	
	결정되지 않은 타입을 파라미터로 처리하고
	실제 사용할때 파라미터를 구체적인 타입으로 대체시키는 기능

}	*/

public class Gen <T>{
	//클래스에서 결정되지 않은  content타입을 T라는 타입 파라미터로 정의 합니다
    public T content;
	
	public static void main(String[] args) {
		Gen<String>gen = new Gen<String>();
		gen.content = "안녕하세요";
		//강제 타입변환이 필요없이 "안녕하세요를 바로 얻을수 있다"
		gen.content = "hi";
		String content = gen.content;
		
		Gen<Integer>nums = new Gen<Integer>();
		nums.content = 20;
		
		/*Box box = new Box();
		box.content = "모든 객체";*/
		
		String q = "<T>는 T가 파라미터임을 뜻하는 기호로\n"+
"타입이 필요한 자리에 T를 사용할수 있음을 알려주는 역활을 한다 여기에서 Gen 클래스는 T를 content필드의 타입으로 사용하였습니다\n"+
"Gen은 T가 무엇이닞 모르지만 Gen객체가 생성될 시점에 다른 타입으로 대체된다는 것은 알고있습니다\n"+
"만약에 Gen의 내용물로 String을 저장하고 싶다면 아래와 같이 Gen생성할대 타입 파라미터 T를 String으로 대체합니다\n"+
"<T>가 아니라 A ~ Z까지 어떤걸 사용해도 상관없다\n"+
"주의할점은  타입 파라미터를 대체하는 타입은 클래스 및 인터페이스 이다\n"+
"그리고 변수를 선언할때와 동일한 타입으로 호출하고 싶다면 생성자 호출시에 타입을 명시 하지 않고 <>만 붙일수 있다";
	System.out.println(q);
	}

}
