package StreamsUsingStrings;

import java.util.Map;
import java.util.stream.Collectors;

public class Stream_Occurence_of_Character {
	public static void main(String[]args) {
	
	        String input = "Hello, World!";
	        
	        Map<Character, Long> characterCounts = input.chars()
	                .mapToObj(c -> (char) c)
	                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
	        
	        System.out.println(characterCounts);
	}

}
