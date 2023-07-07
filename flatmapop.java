package ProblemsUsingStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class flatmapop {
	public static void main(String[]args) {
		List<List<Integer>>flat=new ArrayList<>();
		flat.add(Arrays.asList(2,4));
		flat.add(Arrays.asList(3,5));
		flat.add(Arrays.asList(4,7));
		flat.add(Arrays.asList(6,8));
		flat.stream().flatMap(t->t.stream()).filter(s->s>5).forEach(System.out::print);
	}

}
