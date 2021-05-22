package interfacce;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream4_Read_File_txt_csv {

	public static void main(String[] args) {

		try {
			Stream<String> nani = Files.lines(Paths.get("documenti/scrittura.txt"));
			nani.forEach(n->System.out.println(n));
			
			
			Stream<String> auto = Files.lines(Paths.get("documenti/auto.csv"));			
			auto.map(a -> a.split(","))
				.forEach(a -> System.out.println(a[0] + " " + a[1]));			
			
			
			Stream<String> auto2 = Files.lines(Paths.get("documenti/auto.csv"));			
			Integer res = auto2.map(a -> a.split(","))
				.map(a->Integer.parseInt(a[1]))
//				.reduce(0, Integer::min);
//				.reduce(0, Integer::max);
//				.reduce(0,(acc,elem) -> acc += elem );
				.reduce(0, Integer::sum);
			
			System.out.println("Tot: " + res);
			
			
			Stream<String> auto3 = Files.lines(Paths.get("documenti/auto.csv"));	
			List<Integer> vendite = auto3.map(a -> a.split(","))
				.map(a->Integer.parseInt(a[1]))
				.collect(Collectors.toList());
			System.out.println(vendite);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
