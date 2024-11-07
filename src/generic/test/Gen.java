package generic.test;

class Box <T>{ //box클래스에서 결정되지 않은 content의 타입을 T라는 타입파라미터를 정해주었음
	public T content;
	//public Object content; //만약 다양한 내용물을 저장하려고 하면 그래서 Object타입으로 선언해야 한다
    /*Object 타입은 모든 클래스의 최상위 부모 클래스 입니다
     그렇기 때문에 모든 객체는 부모 타입인 Object로 자동 타입변환이 되므로 
     content 필드에는 어떤 객체든 대입이 가능합니다
     * */
}

class Gen {
	/*Gen 클래스 선언
	 content필드를 선언할때 타입을 무엇을 할지 고민?
	 */
	public static void main(String arg[]) {
		Box<String>box = new Box<String>();
		box.content = "안녕하세요";
		String content = box.content;
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
