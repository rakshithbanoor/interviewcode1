package ProblemsUsingStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindMaxElement {
	public static void main(String[]args) {
		List<Integer>list=Arrays.asList(23,56,98,99,123,543,233);
		int max=list.stream().max(Integer::compare).get();
		int min=list.stream().min(Integer::compare).get();
		System.out.println("max value:"+max);
		System.out.println("min value:"+min);
		
		
		Integer sumofarray=list.stream().mapToInt(Integer::intValue).sum();
		
		Integer sumofarray1=list.stream().collect(Collectors.summingInt(Integer::intValue));
		
		System.out.print(sumofarray1 +" "+sumofarray);
	}
}
