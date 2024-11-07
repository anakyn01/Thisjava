package base.lombok;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NonNull;

@Data
//@NoArgsConstructor
@AllArgsConstructor
public class Member {
//Data에 포함되어 있는 @RequiredArgsConstructor는 기본적으로 매개변수가 없는 생성자를 포함시키지만 
//final또는 @NonNull이 붙은 필드가 있다면 이필드만 초기화시키는 생성자를 포함합니다
private final String id;
@NonNull private String name;
private int age;
}
