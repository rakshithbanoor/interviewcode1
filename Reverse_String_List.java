package ProblemsUsingStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Reverse_String_List {
	public static void main(String[]args) {
		List<String>reverse=Arrays.asList("aReca","maNgo","banIyan");
	    List<String>modifiedList = reverse.stream().map(str -> str.chars()
	    		   .mapToObj(c -> Character.isLowerCase(c) ? Character.toUpperCase(c) : Character.toLowerCase(c)) 
	    		   .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append) 
	    		   .toString()).collect(Collectors.toList()); 
	                System.out.println(modifiedList); 
	    		  
	       }
	}


