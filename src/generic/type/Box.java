package generic.type;

public class Box<T> {
public T content;
	//Box의 내용물이 같은지를 비교
	public boolean compare(Box<T> other) {//(숫자/문자)비교
		boolean result = content.equals(other.content);
		//Object의 equals()메소드로 content필드값 비교
		return result;	
	}
}
