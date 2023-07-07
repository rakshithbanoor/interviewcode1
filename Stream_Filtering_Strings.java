package StreamsUsingStrings;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_Filtering_Strings {
	public static void main(String[]args) {
	
	Stream<String> stringStream = Stream.of("apple", "banana", "grape", "orange");
	List<String> filteredStrings = stringStream.filter(s -> s.startsWith("a")).collect(Collectors.toList());
	System.out.println(filteredStrings); // Output: [apple]
	}
}
