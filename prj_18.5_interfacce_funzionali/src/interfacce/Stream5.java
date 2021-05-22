package interfacce;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream5 {

	public static void main(String[] args) {
		try {
			Stream<String> auto3 = Files.lines(Paths.get("documenti/auto.csv"));
			List<Integer> vendite = auto3.map(a -> a.split(","))
					.map(a->Integer.parseInt(a[1]))
					.collect(Collectors.toList());
			
			// statistiche
			IntSummaryStatistics summaryStatistics = 
					vendite.stream()
							.mapToInt(Integer::intValue)
							.summaryStatistics();
			System.out.println(summaryStatistics);			
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}

}
