package homework12;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class print {
	
	public static void main(String[] args) {
		
//		int [] num = new int [16];
//		
//		Arrays.stream(num)
//	      .mapToObj(i -> Integer.toUnsignedString(i, 16))
//	      .forEach(System.out::println);
		
		//Arrays.asList("let", "any", "mut", "begin", "do", "after");
		
		print("Names that start with A", e -> e.startsWith("A"), "Mati", "Kati", "Aadu");
		//print("Values that are greater than ten", e -> e > 10, 40, 0, 4, -5, -14, 35, 1, 5, 6, 7, 8);



	}
	
	public static void print(String title, Predicate<String> test, String... values) {
		
		System.out.println(values);
		
		
	} 
		
//    List<String> lb = Arrays.asList("let", "any", "mut", "begin", "do", "after");
//    
//    System.out.println("Languages which starts with A :"); 
//    
//    filter(lb, (str)->str.startsWith("A")); 
//    
//		
//	}
//
//	private static void filter(List names, Predicate condition) {
//		for (String name: names) {
//			if(condition.test(names)){
//				System.out.println(name + "");
//			}
//		}
//		
//	}
}
