package ProblemsUsingStreams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstElement {
	public static void main(String[]args) {
		List<Integer>mylist=Arrays.asList(4,5,3,7,4,3,3,3,6,9);
		int count=mylist.stream().findFirst().get();
		System.out.print(count);
	}

}
