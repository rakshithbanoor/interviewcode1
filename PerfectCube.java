package ProblemsUsingStreams;

import java.util.Arrays;
import java.util.List;

public class PerfectCube {
	public static void main(String[]args) {
		List<Integer>list=Arrays.asList(12,65,34,77,16,94);
		list.stream().map(i->i*i*i).forEach(System.out::println);
	}

}
