package ProblemsUsingStreams;

import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class arrayproblems {
	public static void main(String[]args) {
		
		List<Integer>result=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		List<Integer>re=result.stream().filter(t->t %2!=0).collect(Collectors.toList());
		 ArrayDeque  q1 = new ArrayDeque();
		 
		 result.forEach(s1 -> {
			 if(s1 % 2 != 0) {
				 
				 q1.addLast(s1);
			 }
			 else {
				 q1.addFirst(s1);
			 }
		 });
		 System.out.println(q1);
//		result.stream().filter(t->t %2==0).forEach(System.out::print);
//		List<Integer>result1=new ArrayList<>();
//		for(int re:result) {
//			if(re%2!=0) {
//			result1.add(re);
//			}
//		}
//		for(int re:result) {
//			if(re%2==0) {
//			result1.add(re);
//			}
//		}
//	System.out.print(result1);
//		int[]result=new int[arr.length];
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]%2!=0) {
//			result[i]=arr[i];	
//			}
//			else {
//			result[i]=arr[i];	
//    		}
//		}
	

	}

	}
