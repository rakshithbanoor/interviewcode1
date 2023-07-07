package ProblemsUsingStreams;

import java.util.Arrays;
import java.util.List;

public class EvenInteger {
	public static void main(String[]args) {
		List<Integer>list=Arrays.asList(23,54,67,89,43,90);
		list.stream().filter(n->n%2==0).forEach(System.out::println);
	}

}
