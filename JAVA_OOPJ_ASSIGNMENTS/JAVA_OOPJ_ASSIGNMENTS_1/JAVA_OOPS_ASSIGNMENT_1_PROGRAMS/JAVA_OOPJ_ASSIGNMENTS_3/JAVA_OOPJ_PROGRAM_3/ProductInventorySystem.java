package JAVA_OOPJ_PROGRAM_3;

//Question 5: Design a Product Inventory System 
//Requirements: 
//Each product has: 
//● Product ID, name 
//● Price, quantity 
//System should: 
//● Store multiple products 
//● Calculate total inventory value 
//● Update stock quantity 
//Support: 
//● Use constructor for initialization 
//● Use method overloading for price update (discount / direct update) 
//Display: 
//● Product details and stock value


class Product 
{
    int id, qty;
    String name;
    double price;

    Product(int i,String n,double p,int q){
        id=i; name=n; price=p; qty=q;
    }

    void updatePrice(double p)
    {
    	price=p; 
    	
    }
    void updatePrice(double p,double discount)
    {
    	price=p-discount; 
    	}

    double totalValue()
    {
    	return price*qty; 
    	
    }

    void display()
    {
        System.out.println(name+" Value="+totalValue());
    }
}

public class ProductInventorySystem 
{
    public static void main(String[] args) 
    {
        Product p=new Product(1,"Campass",40,4);
        p.display();
    }
}