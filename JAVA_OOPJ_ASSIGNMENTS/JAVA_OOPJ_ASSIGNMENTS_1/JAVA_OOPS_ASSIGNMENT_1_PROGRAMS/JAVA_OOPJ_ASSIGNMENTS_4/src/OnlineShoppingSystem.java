//Q1: Online Shopping System 
//Design a system for an e-commerce platform to manage products, orders, and payments. 
//1.1 Create a class Product with: 
//● productId (int) 
//● productName (String) 
//● price (String input from user) 
//1.2 Add a method in Product to convert price from String to double using Wrapper class. 
//1.3 Create a class Order with: 
//● customerName (String) 
//● array of Product 
//1.4 Write a method in Order to: 
//● iterate through all products 
//● fetch numeric price 
//● calculate and return total bill 
//1.5 Overload the total calculation method: 
//● one method → normal total 
//● second method → total after applying discount (%) 
//1.6 Create a method to generate bill using: 
//● StringBuilder or StringBuffer 
//● Include: 
//○ customer name 
//○ list of products 
//○ total amount 
//1.7 Create an interface Payment with: 
//● pay(double amount) 
//● refund(double amount) 
//C-DAC Mumbai
//1.8 Create two classes: 
//● UPIPayment 
//● CardPayment 
//Implement Payment and provide different messages (method overriding). 
//1.9 In main method: 
//● take user input 
//● create products and order 
//● ask user to choose payment type 
//● call appropriate payment method 
//1.10 Add exception handling for: 
//● invalid price (NumberFormatException) 
//● product count ≤ 0 
//● invalid payment option 
//1.11 Display: 
//● formatted bill 
//● final payable amount 
//● payment success message 
//C-D

import java.util.*;


class Product 
{
    int productId;
    String productName;
    String price; 

    Product(int productId, String productName, String price) 
    {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

   
    double getPriceAsDouble() throws NumberFormatException 
    {
        return Double.parseDouble(price);
    }
}


class Order
{
    String customerName;
    Product[] products;

    Order(String customerName, Product[] products) 
    {
        this.customerName = customerName;
        this.products = products;
    }

   
    double calculateTotal() 
    {
        double total = 0;
        for (Product p : products) {
            total += p.getPriceAsDouble();
        }
        return total;
    }

  
    double calculateTotal(double discountPercent)
    {
        double total = calculateTotal();
        return total - (total * discountPercent / 100);
    }

    
    String generateBill() 
    {
        StringBuilder sb = new StringBuilder();
        
        sb.append("Bill Details");
        
        sb.append("Customer: ").append(customerName).append("\n");

        for (Product p : products)
        {
            sb.append(p.productName)
              .append(" - ₹")
              .append(p.price);
        }

        sb.append("Total: ₹").append(calculateTotal()).append("\n");
        
        return sb.toString();
    }
}


interface Payment 
{
    void pay(double amount);
    void refund(double amount);
}


class UPIPayment implements Payment
{
    public void pay(double amount)
    {
        System.out.println("Paid ₹" + amount + " using UPI");
    }

    public void refund(double amount)
    {
        System.out.println("Refunded ₹" + amount + " via UPI");
    }
}

class CardPayment implements Payment
{
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Card");
    }

    public void refund(double amount) {
        System.out.println("Refunded ₹" + amount + " via Card");
    }
}


public class OnlineShoppingSystem 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        try 
        {
            System.out.print("Enter number of products: ");
            int n = sc.nextInt();
            sc.nextLine();

            if (n <= 0) {
                throw new Exception("Product count must be > 0");
            }

            Product[] products = new Product[n];

            
            for (int i = 0; i < n; i++) 
            {
                System.out.println("\nEnter Product " + (i + 1) + " details:");
                System.out.print("ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Price: ");
                String price = sc.nextLine();

                products[i] = new Product(id, name, price);
            }

          
            System.out.print(" Enter Customer Name: ");
            String cname = sc.nextLine();

            Order order = new Order(cname, products);

   
            System.out.print("Enter discount %: ");
            double discount = sc.nextDouble();

            double finalAmount = order.calculateTotal(discount);

          
            System.out.println(" Choose Payment Method:");
            System.out.println("1. UPI");
            System.out.println("2. Card");
            
            int choice = sc.nextInt();

            Payment payment;

            if (choice == 1)
            {
                payment = new UPIPayment();
            } else if (choice == 2) 
            {
                payment = new CardPayment();
            } else
            {
                throw new Exception("Invalid Payment Option");
            }

  
            System.out.println(order.generateBill());
            System.out.println("Final Amount after discount: ₹" + finalAmount);

            payment.pay(finalAmount);

        } catch (NumberFormatException e) 
        {
            System.out.println("Invalid price entered!");
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}

