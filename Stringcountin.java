package ProblemsUsingStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stringcountin {
	public static void main(String[]args) {
		List<String>name=Arrays.asList("bengaluru","managalore","kolkata","mumbai");
		List<Integer>count=name.stream().map(t->t.length()).collect(Collectors.toList());
		System.out.print(count);
	}

}
