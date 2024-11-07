package stream.ref;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//stream => 데이터의 흐름
public class Sort {

	public static void main(String[] args) {
	List<Student> studentList = new ArrayList<>();
	studentList.add(new Student("홍길동", 30));
	studentList.add(new Student("신용재", 10));
	studentList.add(new Student("이미선", 20));
	
	//점수를 기준으로 오름차순으로 정렬
	studentList.stream().sorted()
	.forEach(s->System.out.println(s.getName()+" :"+s.getScore()));
	//점수를 기준으로 내림차순으로 정렬
	studentList.stream().sorted(Comparator.reverseOrder())
	.forEach(s->System.out.println(s.getName()+" :"+s.getScore()));
	
	
	
	
	
	}

}
