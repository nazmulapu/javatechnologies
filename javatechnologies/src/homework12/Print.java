package homework12;

import java.util.function.Predicate;

public class Print {
	
    public static void main(String[] args) {
		
    	print("Names that start with A", e -> e.startsWith("A"), "Mati", "Kati", "Aadu");
    	print("Values that are greater than ten", e -> e > 10, 40, 0, 4, -5, -14, 35, 1, 5, 6, 7, 8);
	}
    
    
	@SafeVarargs
	private static <T> void print( String title, Predicate<T> condition, T... values ) {
		for (T value : values) {
			if(condition.test(value)){
				System.out.println(value);
//				output
//				Aadu
//				40
//				35
			}
			
		}
		
	}

}
