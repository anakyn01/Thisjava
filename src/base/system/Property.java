package base.system;

/*
시스템 프로퍼티란 자바 프로그램이 시작될때 자동설정되는 시스템의
속성을 말한다
예를 들어 운영체제 종류 , 사용자 정보, 자바 버전등을 말한다

jDK (java Virtual Machine, JVM) java컴파일러, 디버깅, 
JRE (java Runtime Environment)

컴파일러 : 프로그램 전체를 스캔해서 모두 기계어로 번역
인터프리터 : 프로그램 실행시 한 번에 한 문장씩 번역

java.specification.version => 자바스펙버전 
java.home => jdk디랙토리 경로
os.name => 운영체제
user.name => 사용자 이름
user.home => 사용자 홈디렉토리 경로
user.dir => 현재 디렉토리 경로
*/
import java.util.Properties;
import java.util.Set;

public class Property {
	public static void main(String[] args) {
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");
		System.out.println(osName);
		System.out.println(userName);
		System.out.println(userHome);
		
		//전체 키와 값을 출력
		System.out.println("유니드어, 콤마");
		System.out.println("-----------------");
		System.out.println(" key: value");
		System.out.println("-----------------");
		
		Properties props = System.getProperties();
		Set keys = props.keySet();
		for(Object objKey:keys) {
			String key = (String) objKey;
			String value = System.getProperty(key);
			System.out.printf("%-40s: %s\n", key, value);
			
		}
		/*
		%d 부호있는 정수형을 출력합니다 printf("%d"-150) -150
		%c 문자열 하나를 출력합니다 printf("%c",'A') A
		%p 주로 주소를 출력합니다 메모리 크기만큼 자리수가 채워집니다
		출력될때 16진수로 표시됩니다 
		int a; printf("%p",&a) 0177F95C
		
		%x : 정수를 16진수로 출력합니다 %x소문자인데 
		16진수로 표시될때 알파벳은 소문자로 표시됩니다
		printf("%x",10) => a
		
		%X : 상동 다만 대문자로 표시 
		printf("%X",10) => a
		
		%o : 8진수로 출력
		printf("%o",8888) 21270
		
		%s : 문자열을 출력하는데 공백까지 포함하여
		printf("%s","hello, world")
		
		%u : 부호없는 정수출력 abs
		무조건 양수를 출력한다는 의미 
		printf("%s","hello, world")
		-1을 부호가 없으면 출력이 4294967295
		보수를 거치는 과정이 0000 0000 0000
		1111 1110 +1 -> 1111 1111 1111 =
		
		
		%ld = 부호있는 long형 정수출력 
		printf("%ld",1L) 1
		
		%lld 부호있는 long long형 정수출력
		printf("%lld",5294967295) 
		
		%lu 부호없는 long 형 정수출력
		printf("%lu",-12345)
		%llu 부호없는 long long형 정수출력
		printf("%llu",-12345)
		
		%f, %if : 실수형으로 출력합니다
		6자리까지 출력이 되면 그이하는 반올리 처리가 됩니다
		모자라면 0으로 채웁니다
		
		%e 실수를 지수 표기법으로 사용
		printf("%e",0.11223344f) 1.122334e-01
		%E 실수를 지수 표기법으로 사용
		printf("%E",0.11223344f) 1.122334E-01
		*/
		
		
	}
}
