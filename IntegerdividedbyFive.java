package ProblemsUsingStreams;

import java.util.Arrays;
import java.util.List;

public class IntegerdividedbyFive {
	public static void main(String[]args) {
		List<Integer>list=Arrays.asList(455,89,19,80,20,77,56,18);
		list.stream().filter(i->i%5==0).forEach(System.out::println);
	}

}
