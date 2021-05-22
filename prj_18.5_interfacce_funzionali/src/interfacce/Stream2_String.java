package interfacce;

import java.util.Arrays;
import java.util.stream.Stream;

public class Stream2_String {

	public static void main(String[] args) {
		// stream of generic T
		// stream of String
		Stream.of("do", "re", "mi", "fa", "sol", "la", "si")
			.sorted()
			.forEach(s -> System.out.println(s));
		
		System.out.println("-------------");
		
		String[] note = {"do", "re", "mi", "fa", "sol", "la", "si"};
		Arrays.stream(note)
			.filter(n -> n.startsWith("s"))
			.forEach(System.out::println);
		
		
		
		
		
	}
}
