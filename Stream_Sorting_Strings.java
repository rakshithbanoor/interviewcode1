package StreamsUsingStrings;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_Sorting_Strings {
	public static void main(String[]word) {
	Stream<String> stringStream = Stream.of("banana", "apple", "orange", "grape");
	List<String> sortedStrings = stringStream.sorted().collect(Collectors.toList());
	System.out.println(sortedStrings);
	}
}
