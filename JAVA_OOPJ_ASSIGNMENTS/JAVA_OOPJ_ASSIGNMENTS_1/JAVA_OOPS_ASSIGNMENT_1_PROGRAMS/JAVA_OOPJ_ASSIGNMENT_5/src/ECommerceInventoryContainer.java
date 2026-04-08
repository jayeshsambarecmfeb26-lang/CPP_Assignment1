//Question 1: E-Commerce Inventory Container 
//An e-commerce company needs a flexible system to store different types of products (e.g., electronics, 
//clothing, books). 
//Task: 
//Design a generic class Inventory<T> to store product items. 
//Requirements: 
//● Store a single product of type T 
//● Provide methods to: 
//○ Add product 
//○ Retrieve product 
//● Create and test the class with: 
//○ Electronics objects 
//○ Clothing objects 
//● Display product details

	class Inventory<T>
	{
	    private T product;

	    public void addProduct(T product) {
	        this.product = product;
	    }

	    public T getProduct() {
	        return product;
	    }
	}

	
	class Electronics
	{
	    String name;
	    double price;

	    Electronics(String name, double price) {
	        this.name = name;
	        this.price = price;
	    }

	    public String toString() {
	        return "Electronics: " + name + " Price: " + price;
	    }
	}

	class Clothing {
	    String name;
	    String size;

	    Clothing(String name, String size) {
	        this.name = name;
	        this.size = size;
	    }

	    public String toString() {
	        return "Clothing: " + name + " Size: " + size;
	    }
	}
	
	public class ECommerceInventoryContainer
	{
	    public static void main(String[] args) 
	    {
	        Inventory<Electronics> e = new Inventory<>();
	        e.addProduct(new Electronics("Mobile", 55000));
	        System.out.println(e.getProduct());

	        Inventory<Clothing> c = new Inventory<>();
	        c.addProduct(new Clothing("Pant", "34"));
	        System.out.println(c.getProduct());
	    }
	
	
}
