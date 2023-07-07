package ProblemsUsingStreams;

import java.util.ArrayList;
import java.util.HashSet;

public class findduplicateUsingHashset {
	 public static void main(String[]args) {
	 int[]nums= {34,65,2,4,8,77,54,23,67,34,2};
	  HashSet<Integer> store = new HashSet<Integer>();
      ArrayList<Integer> output = new ArrayList<Integer>();
      for (int i = 0; i < nums.length; i++) {
          int current = nums[i];
          if (store.contains(current)) {
              output.add(current);
          } else {
              store.add(current);
          }
      }
      for(int output1:output) {
    	  System.out.print(output1 +" ");
      }
	 }
}
