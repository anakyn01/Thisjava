package stream.ref;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class STREAM {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("홍");
		set.add("길");
		set.add("동");
		
		Stream<String> stream = set.stream();
		stream.forEach(n -> System.out.println(n));
	}

}
