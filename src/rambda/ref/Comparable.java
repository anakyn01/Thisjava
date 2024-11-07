package rambda.ref;
@FunctionalInterface
public interface Comparable {
int compare(String a, String b);
}
/*사람의 이름을 비교하기 위해서 String의 인스턴스 메소드인 
compareToIgnoreCase를 메소드 참조로 사용한다
compareToIgnoreCase(b)로 호출했을때 사전 순으로 a가
b보다 먼저오면 음수를, 동일하면 0을, 나중에 오면 양수를 리턴한다
*/
