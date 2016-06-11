package homework12;

import java.util.Arrays;
import java.util.List;

public class Word {
	
	public static void main(String[] args) {
		List<String> words = Arrays.asList("let", "any", "mut", "begin", "do", "after");

		Object[] letter =  words.stream().map(s -> s.charAt(0)).toArray();
		
		String word = Arrays.toString(letter)
				.replace(",", "")
				.replace("[", "")
				.replace("]", "")
				.replace(" ", "")
				.trim();
		System.out.println(word);
		// output lambda
	}

}
