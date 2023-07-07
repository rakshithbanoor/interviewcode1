package StreamsUsingStrings;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_Transforming_Strings {
	public static void main(String[]args) {
		Stream<String> stringStream = Stream.of("apple", "banana", "grape", "orange");
		List<String> transformedStrings = stringStream.map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(transformedStrings); 
	}

}
