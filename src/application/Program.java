package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Product> list = new ArrayList<Product>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		//list.forEach(new PriceUpdate()); //pasando uma instancia do PriceUpdate 
		//list.forEach(Product::staticPriceUpdate); //referencia metod estatico na clase Product
		list.forEach(Product::nonStaticPriceUpdate); //referencia metod nao estatico na clase Product

		
		list.forEach(System.out::println);

	}

}