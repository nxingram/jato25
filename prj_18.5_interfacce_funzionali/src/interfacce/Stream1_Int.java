package interfacce;

import java.util.stream.IntStream;

public class Stream1_Int {

	
	public static void main(String[] args) {
		
		// stream interi
		IntStream.range(0, 100)
			.filter(x -> x%2 == 0) // numeri pari
			.forEach(System.out::println);
		
		long count = IntStream.range(0, 100)
			.filter(x -> x%2==0 && x%3==0)
			.count();
		System.out.println("Count :" + count);
	}
}
