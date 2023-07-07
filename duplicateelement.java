package ProblemsUsingStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class duplicateelement {
	public static void main(String[]args) {
		List<Integer>list= Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8);
		list.stream().distinct().collect(Collectors.toSet()).forEach(x->System.out.println(x));
	}

}
