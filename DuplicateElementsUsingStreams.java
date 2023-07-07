package ProblemsUsingStreams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElementsUsingStreams {
	public static void main(String[]args) {
		List<Integer>mylist=Arrays.asList(4,5,3,7,4,3,3,3,6,9);
		Set<Integer>set=new HashSet<>();
		mylist.stream().filter(n->!set.add(n)).forEach(System.out::println);
		System.out.println("************************");
		String s1="rakhi";
		String s2=s1;
		String s=new String(s1);
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s==s1);
		System.out.print(s.equals(s2));
	}

}
