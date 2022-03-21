package application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		
		//HashSet -> Fast but don't sort
//		Set<String> set = new HashSet<>();
		
		//LinkedHashSet -> not so fast but sorted
		Set<String> set = new LinkedHashSet<>();
		
		set.add("TV");
		set.add("Notebook");
		set.add("Book");
		
		set.removeIf(x -> x.charAt(0) == 'B');
		
		
		for (String p : set) {
			System.out.println(p);
		}
		
		
	}

}
