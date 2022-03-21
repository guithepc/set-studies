package application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import entities.Product;

public class App {

	public static void main(String[] args) {
		Set<Product> set = new TreeSet<>();
		
		set.add(new Product("TV", 1200.00));
		set.add(new Product("Notebook", 2200.00));
		set.add(new Product("Book", 120.00));
		
		
		for (Product product : set) {
			System.out.println(product);
		}
	}

}
