package ProblemsUsingStreams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamsConvertoInteger {
	public static void main(String[]args) {
	List<String> example=Arrays.asList("1","2","3","4","5");
	System.out.println("******************************************************************");
	List<Integer> ex=example.stream()
			  .map(Integer::parseInt)
			  .collect(Collectors.toList());
	System.out.println("******************************************************************");
    List<Integer> integers = example.stream()
              .mapToInt(Integer::parseInt) 
              .boxed() 
              .collect(Collectors.toList());
}
}