package stream.ref;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileControl {

	public static void main(String[] args) throws Exception  {
	Path path = Paths.get(FileControl.class.getResource("data.txt").toURI());
	//Uniform Resource Identifier 통합자원식별자 , Uniform Resource Locator 고유한 리소스
	//data.txt 파일의 경로(Path)객체 얻기
	Stream<String> stream = Files.lines(path, Charset.defaultCharset());
	//path로 부터 파일을 열고 한 행씩 읽으면서 문자열 스트림을 생성합니다 기본 UTF-8문자셋으로 읽음
	stream.forEach(line -> System.out.println(line));
	stream.close();
	}

}
/*
파일로 부터 스트림 얻기
java.nio.file.Files의 lines()메소드를 이용하면 텍스트 파일의 
행단위 스트림을 얻을수 있다
한 행씩 읽고 처리할때 유용하게 사용할수 있다
*/