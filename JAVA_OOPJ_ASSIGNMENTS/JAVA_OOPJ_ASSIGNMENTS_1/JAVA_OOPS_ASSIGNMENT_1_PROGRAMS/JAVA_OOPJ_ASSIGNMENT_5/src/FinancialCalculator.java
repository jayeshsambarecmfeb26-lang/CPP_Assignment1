//Question 3: Financial Calculator (Bounded Generics) 
//A finance company needs a system to calculate totals from numerical datasets like transactions, salaries, 
//or profits. 
//Task: 
//Implement a program using bounded generics. 
//Requirements: 
//● Create a method that accepts only subclasses of Number 
//● Calculate: 
//○ Sum 
//○ Average 
//● Test with: 
//○ Integer transactions 
//○ Double salary data

	
	class FCalculator
	{

	    public static <T extends Number> void calculate(T[] data) 
	    {
	        double sum = 0;

	        for (T num : data) {
	            sum += num.doubleValue();
	        }

	        double avg = sum / data.length;

	        System.out.println("Sum = " + sum);
	        System.out.println("Average = " + avg);
	    }
	}
	public class FinancialCalculator 
	{
	    public static void main(String[] args)
	    {
	        Integer[] transactions = {20, 30, 40};
	        Double[] salaries = {4000.5, 5000.5};

	        FCalculator.calculate(transactions);
	        FCalculator.calculate(salaries);
	    }
	
}

