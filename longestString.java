package ProblemsUsingStreams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class longestString {
	public static void main(String[]args) {
		List<String>longstring=Arrays.asList("sachin","pavansagars","sandeep","pavansagar");
		Optional<String>rrr=longstring.stream().reduce((word1,word2)->word1.length()<word2.length()?word1:word2);
		rrr.ifPresent(System.out::println);
		longstring.stream().filter(t->t.startsWith("s")).forEach(System.out::println);
		
	}

}
