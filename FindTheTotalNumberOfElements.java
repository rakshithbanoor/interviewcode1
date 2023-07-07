package ProblemsUsingStreams;

import java.util.Arrays;
import java.util.List;

public class FindTheTotalNumberOfElements {
	public static void main(String[]args) {
		List<Integer>mylist=Arrays.asList(4,5,3,7,4,3,3,3,6,9);
		long count=mylist.stream().count();
		System.out.print(count);
	}

}
