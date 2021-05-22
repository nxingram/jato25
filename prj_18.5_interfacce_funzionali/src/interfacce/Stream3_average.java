package interfacce;

import java.util.Arrays;

public class Stream3_average {

	public static void main(String[] args) {
		
		Arrays.stream(new int[] {22,24,26,28,30})
			.map(x -> x-1)
			.forEach(System.out::println);
		
		Arrays.stream(new int[] {22,24,26,28,30})
			.map(x -> x-1)
			.average()
			.ifPresent(x->System.out.println("la media dei voti è: " + x));
		
		
		
	}
}
