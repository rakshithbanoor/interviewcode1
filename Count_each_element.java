package ProblemsUsingStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Count_each_element {
	public static void main(String[]args) {
	// To count the character 
    List<String>names=Arrays.asList("c","b","c","d");
    List<Integer>num=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    Map<String,Long>namescount=names.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    System.out.println(namescount);
    System.out.println("**************************");
    //To count the integer
    Map<Integer,Long>a=num.stream().collect(Collectors.toMap(Function.identity(),v-> 1L,Long::sum));
    System.out.println(a);
    System.out.println("**************************");
     int sum=num.stream().collect(Collectors.summingInt(Integer::intValue));
     System.out.println(sum);
     int sum1=num.stream().mapToInt(Integer::intValue).sum();
     System.out.println("**************************");
     List<Integer>result=new ArrayList<Integer>();
     num.stream().forEach(x->{
    	 if(x>5) {
    		result.add(x);
    	 }
    	 else {
    		 result.add(x); 
    	 }
     });
     System.out.print(result);
//     num.stream().filter(t->t%2==0).forEach(System.out::print);
     
}
}
