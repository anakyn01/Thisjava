package base.training;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})//적용대상 : METHOD 
@Retention(RetentionPolicy.RUNTIME)
//유지정책(언제 까지 유지 할것인지) : RUNTIME : 실행하고 계속 유지됨
public @interface PrintAnnotation {
String value() default "-";//선의 종류
int number() default 15;//출력 횟수
}
