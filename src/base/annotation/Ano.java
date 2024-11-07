package base.annotation;
/*
코드에서 @로 작성되는 요소를 어노테이션이라고 합니다
어노테이션은 클래스 또는 인터페이스를 컴파일 하거나
실행할때 어떻게 처리 할것인지 알려주는 설정정보입니다
어노테이션은 세가지 용도로 사용됩니다
1) 컴파일시 사용되는 정보 전달 
컴파일시 사용되는 정보 전달에 대표적인 예는 @Override
@Override는 컴파일러가 메소드 재정의 검사를 하도로 ㄱ설정
정확이 재정의 하지 않았다면 컴파일러는 에러를 발생시킨다
어노테이션은 java프로그램을 개발할때 필수요소이다
Spring Framework또는 Spring boot는 
다양한 종류의 어노테이션을 사용합니다

2) 빌드툴이 코드를 자동으로 생성할때 사용하는 정보전달
3) 실행시 특정 기능을 처리할때 사용하는 정보 전달

어노테이션에 적용 대상
설정정보라고 한다 어떤 대상에 설정 정보를 적용할 것인지 
클래스에 적요할건지, 메소드에 적용할 것인지 명시해야 한다
적용할수 있는 대상의 종류는 ElementType열거 상수로 정의되어 있습니다
TYPE {클래스,인터페이스,열거 타입}
ANNOTATION_TYPE{어노테이션}
FIELD{필드}
CONSTRUCTOR{생성자}
METHOD{메소드}
LOCAL_VARIABLE{지역변수}
PACKAGE{패키지}

적용대상을 지정할때는  @Target어노테이션을 사용합니다
@Target의 기본속성인 valueElementType배열을 값으로 가진다
이유는 적용대상을 여러개로 가지기 위해서 이다

@Target({ElementType.Type, ElementType.FIELD, ElementType.METHOD})
public @interface AnnotationName{
}

@AnnotationName -> TYPE(클래스)에 적용
public class ClassName{
   @AnnotationName -> 필드에 적용
   private String fieldName;
   
   public ClassName(){} -> @Target에 CONSTRUCT가 없으므로 생성자에 적용못함
   
   @AnnotationName -> 메소드에 적용
   public void methodName(){}
}

어노테이션 유지 정책
어노테이션을 정의할때 추가해야 하는 내용은 @AnnotationName을 언제까지 유지 할것인지 정한다
어노테이션 유지 정책은 RetentionPolicy 열거 상수로 아래와 같이 정의 합니다
SOURCE 적용시점:컴파일할때 , 제거시점: 컴파일후에 제거됨
CLASS 적용시점:메모리로 로딩할때 , 제거시점:메모리로 로딩된후에 제거됨
RUNTIME 적용시점:실행할때 적용, 제거시점: 계속 유지됨

유지 정책을 지정할때는 @Retention어노테이션을 사용한다
@Retention기본 속성인 밸류도 RetentionPolicy 열거 상수값을 가집니다

@Target({ElementType.Type, ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
//실행시에도 어노테이션을 어노테이션 설정정보를 이용할수 있도록 유지정책 RUNTIME을 지정함
public @interface AnnotationName{
}

어노테이션 설정 정보 이용 : 아무런 동작을 가지지 않는 설정 정보일 뿐
이 설정 정보를 이용해서 어떻게 처리할것인지는 어플리케이션에 몫이다
리플렉션을 이용하여 적용대상으로부터 어노테이션의 정보를 아래메소드로 얻을수 있다
리턴타입 : boolean
메소드명(매개변수): isAnnotationPresent(AnnotationName.cass)
설명 : 지정한 어노테이션이 적용되었는지 여부

리턴타입 : Annotation
메소드명(매개변수): getAnnotation(AnnotationName.cass)
설명 : 지정한 어노테이션이 적용되어 있으면 어노테이션을 리턴하고 그렇지 않으면 null 리턴

리턴타입 : Annotation[]
메소드명(매개변수):getDeclaredAnnotations()
설명 : 적용된 모든 어노테이션을 리턴
*/
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})//적용대상 메서드
@Retention(RetentionPolicy.RUNTIME)//유지 정책은 RUNTIME
public @interface Ano{
	String value() default "-"; //선의 종류 hypen
	int number() default 15; //출력횟수 15회
}


