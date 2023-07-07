package ProblemsUsingStreams;

import java.util.Arrays;
import java.util.List;

public class NumberStartingWithOne {
	public static void main(String[]args) {
		List<Integer>mylist=Arrays.asList(4,5,3,7,4,3,3,6,9,43,56,44);
		mylist.stream().map(s->s +"").filter(s->s.startsWith("4")).forEach(System.out::println);
	}

}
