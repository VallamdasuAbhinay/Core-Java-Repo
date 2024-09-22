package Java8_Examples;

import java.util.ArrayList;
import java.util.List;

public class Filtering_Products_Price_Using_Lambda_Expression {

	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();
		productsList.add(new Product(1, "HP Laptop", 25000f, true));
		productsList.add(new Product(2, "Dell Laptop", 30000f, null));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f, false));
		productsList.add(new Product(4, "Sony Laptop", 28000f, null));
		productsList.add(new Product(5, "Apple Laptop", 90000f, null));
		productsList.stream().filter(p -> p.price > 30000) // filtering price
				.map(pm -> pm.price) // fetching price
				.forEach(System.out::println); // iterating price
		//setting flag value to false, if their initial value is null
		productsList.stream().filter(x -> x.getFlag() == null).forEach(y -> y.setFlag(false));
		System.out.println(".............");
		//printing the elements of products list using forEach
		productsList.stream().forEach(System.out::println);
	}
}

class Product {
	int id;
	String name;
	float price;
	Boolean flag;

	public Product(int id, String name, float price, Boolean flag) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.flag = flag;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Boolean getFlag() {
		return flag;
	}

	public void setFlag(Boolean flag) {
		this.flag = flag;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", flag=" + flag + "]";
	}
}
