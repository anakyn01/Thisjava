package stream.ref;

public class Student implements Comparable<Student>{
//Comparable 기본설정(보통 오름차순)
private String name;
private int score;

public Student(String name, int score) {
	this.name = name;
	this.score = score;
}

public synchronized String getName() {
	return name;
}

public synchronized void setName(String name) {
	this.name = name;
}

public synchronized int getScore() {
	return score;
}

public synchronized void setScore(int score) {
	this.score = score;
}

@Override
public int compareTo(Student o) {
	return Integer.compare(score, o.score);
	//score, o.score가 같을 경우 0을 리턴, 작을 경우 음수, 클 경우 양수
}

}
