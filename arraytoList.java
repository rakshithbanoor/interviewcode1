package ProblemsUsingStreams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class arraytoList {
	public static void main(String[]args) {
		List<Integer>al=Arrays.asList(1,5,9,5,2,8,2,3,7,1,4,9);
		Set<Integer>set=new HashSet<>();
		al.stream().filter(n->!set.add(n)).collect(Collectors.toList()).forEach(r->System.out.print(r+" "));;
	}

}
