package StreamsUsingStrings;

public class Stream_Reverse_String {
	public static void main(String[] args) {
        String input = "Hello, World!";
        
        String reversed = input.chars()
                .mapToObj(c -> (char) c)
                .reduce("", (s, c) -> c + s, (s1, s2) -> s2 + s1);
        
        System.out.println(reversed); // Output: !dlroW ,olleH
    }

}
