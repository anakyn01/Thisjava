package collection.vector;


public class Board {

	private String subject;//접근제어자
	private String content;
	private String writer;
	
	public Board(String subject, String content, String writer) {//생성자
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}
	
	
	public String getSubject() {return subject;}//메소드
	public void setSubject(String subject) {this.subject = subject;}
	public String getContent() {return content;}
	public void setContent(String content) {this.content = content;}
	public String getWriter() {return writer;}
	public void setWriter(String writer) {this.writer = writer;}
	
	
}
