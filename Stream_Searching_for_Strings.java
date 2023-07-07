package StreamsUsingStrings;

import java.util.stream.Stream;

public class Stream_Searching_for_Strings {
	public static void main(String[]args) {
		Stream<String> stringStream = Stream.of("apple", "banana", "grape", "orange");
		boolean containsOrange = stringStream.anyMatch(s -> s.equals("orange"));
		System.out.println(containsOrange);
	}

}
