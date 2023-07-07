package StreamsUsingStrings;

import java.util.stream.Stream;

public class Stream_Counting_Strings {
	public static void main(String[]args) {
		Stream<String> stringStream = Stream.of("apple", "banana", "grape", "orange");
		long count = stringStream.filter(s -> s.length() > 5).count();
		System.out.println(count);
	}

}
