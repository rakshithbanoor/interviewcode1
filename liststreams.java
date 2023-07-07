package ProblemsUsingStreams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class liststreams {
	public static void main(String[]args) {
	List<Integer>list=new ArrayList<>();
	List<String>liststring=new ArrayList<>();
	list.add(2);
	list.add(1);
	list.add(7);
	list.add(4);
	list.add(2);
	list.add(0);
	list.add(8);
	list.add(9);
	liststring.add("kiran");
	liststring.add("keerthi");
	liststring.add("vinod");
	liststring.add("vanya");
	liststring.add("tilok");
	list.stream().sorted().forEach(t->System.out.print(t +" "));
	System.out.println();
	liststring.stream().sorted().forEach(t->System.out.print(t +" "));
	System.out.println();
	list.stream().sorted(Comparator.reverseOrder()).forEach(t->System.out.print(t +" "));
	System.out.println();
	liststring.stream().sorted(Comparator.reverseOrder()).forEach(t->System.out.print(t +" "));
	
	
	}
}
