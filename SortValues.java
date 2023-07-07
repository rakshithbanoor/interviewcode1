package ProblemsUsingStreams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class SortValues {
	public static void main(String[]args) {
		List<Integer>list=Arrays.asList(23,21,98,45,32,67,89,30,77);
		//sorted order
		list.stream().sorted().forEach(System.out::println); 
		//reverse order
		System.out.println("*************");
		list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
		//finding the highest 
		System.out.println("*****************************");
		int count=list.stream().reduce(Integer::max).get();
		System.out.println(count);
		System.out.println("*****************************");
		int c=list.stream().sorted().findFirst().get();
		System.out.println("lowest number "+c);
		System.out.println("*****************************");
	    Integer a=list.stream().sorted(Collections.reverseOrder()).findFirst().get();
	    System.out.println("highest number "+a);
	}

}
