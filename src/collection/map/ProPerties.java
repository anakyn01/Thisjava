package collection.map;

import java.util.Properties;

public class ProPerties {

	public static void main(String[] args) throws Exception{
		
		//Properties컬렉션 생성
		Properties properties = new Properties();
		/*
		먼저 프로퍼티를 생성하고 load()메소드로 프로퍼티 파일내용을 메모리로 로드한다
		*/		
		properties.load(ProPerties.class.getResourceAsStream("database.properties"));
		//ProPerties클래스와 동일한 classPath에 있는 database.properties파일 로드
		
		//주어진 키에 대한 값 읽기
		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		String admin = properties.getProperty("admin");
		
		//값 출력
		System.out.println("driver: " + driver);
		System.out.println("url: " + url);
		System.out.println("username: " + username);
		System.out.println("password: " + password);
		System.out.println("admin: " + admin);
		
		
		
		
		
		
		
		
		String pro = "Properties\n"+
"Hashtable 의 자식 클래스이다\n"+
"Hashtable의 특징을 그대로 가지고 있습니다\n"+
"Properties는 주로 확장자가 .properties인 프로퍼티 파일을 읽을때 사용합니다\n"+
"프로퍼티 파일은 아래와 같이 키와 값이 = 기호로 연결되어 있는 텍스트파일\n"+
"일반 텍스트 파일과 다르게 ISO 8859-1문자셋으로 저장되며\n"+
"한글을 경우에는 경우에는 자동으로 유니코드로 바뀝니다\n"+
"driver=oracle.jdbc.OracleDriver\n"+
"url=jdbc:oracle:thin:@localhost:1521:orcl\n"+
"username=scott\n"+
"admin=\uD64D\uAE38";
System.out.println(pro);





	}

}
