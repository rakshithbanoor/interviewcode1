package StreamsUsingStrings;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_Grouping_Strings {
	public static void main(String[]args) {
		Stream<String> stringStream = Stream.of("apple", "banana", "grape", "orange");
		Map<Integer, List<String>> groupedStrings = stringStream.collect(Collectors.groupingBy(String::length));
		System.out.println(groupedStrings); 
	}

}
