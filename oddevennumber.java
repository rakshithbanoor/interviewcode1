package ProblemsUsingStreams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class oddevennumber {
	public static void main(String[]args) {
		 List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		 
	        Map<Boolean, List<Integer>> partitionedNumbers = numbers.stream()
	                .collect(Collectors.partitioningBy(n -> n % 2 != 0));

	        List<Integer> sortedNumbers = Stream.concat(partitionedNumbers.get(true).stream(),
	                partitionedNumbers.get(false).stream())
	                .toList();

	        System.out.println(sortedNumbers);


		
	   }
	}


