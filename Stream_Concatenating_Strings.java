package StreamsUsingStrings;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_Concatenating_Strings {
	public static void main(String[]args) {
		Stream<String> stringStream = Stream.of("Hello", "World", "!");
		String concatenatedString = stringStream.collect(Collectors.joining(" "));
		System.out.println(concatenatedString); // Output: Hello World !
	}

}
