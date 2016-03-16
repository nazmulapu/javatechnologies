package exercise1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NameSort {
	public static void main(String[]args){
		ArrayList<String> names = new ArrayList<String>();
		names.addAll(Arrays.asList(
				"Aavo",
				"Kati",
				"Matilde",
				"Ants",
				"Veronika",
				"Siim"
				
				
				));
		Collections.sort(names, new BackwardsNameComparator());
		
		for (String name : names) {
		System.out.println(name);
		}
		
	}

}
