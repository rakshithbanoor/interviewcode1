package StreamsUsingStrings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Stream_word_counting {
	public static void main(String[]args) {
		String s="hi hello hi hello rakshith abhi abhi hi gaja";
		String[]arr=s.split(" ");
//		
		List<String>names=Arrays.asList(arr);
		Map<String,Long>namescount=names.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.print(namescount);
//		
        
//		
//		for(int i=0;i<arr.length;i++) {
//			int count=1;
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i].equals(arr[j])) {
//					count++;
//					arr[j]="/";
//				}
//			}
//			if(count>0 && arr[i]!="/" ) {
//			System.out.println(arr[i]+ " "+count);
//		}
//		System.out.println("*******************************************************************");
//		Map<String,Integer>map=new HashMap<>();
//		for(String ex:arr) {
//			if(map.containsKey(ex)) {
//				System.out.println("maaappppp"+map.get(ex));
//				map.put(ex,map.get(ex)+1);
//				
//			}
//			else {
//				map.put(ex, 1);
//			}
//		}
//	    map.forEach((k, v)
//                -> System.out.println(k + " : "
//                                      + v));
//
//		System.out.print("*******************************************************************");
//		
//	    //**************************************************************************
//	    
//		System.out.println(map);
//		
//		for(Map.Entry<String , Integer> itr: map.entrySet()) {
//			System.out.println(itr.getKey() +" "+ itr.getValue());
//		}
//
//		System.out.print("*******************************************************************");
//		
//		//**************************************************************************
//		Iterator it = map.keySet().iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
//
//		System.out.println("*******************************************************************");
//		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
//		
//		//**************************************************************************
//		 
//	}

}
}

