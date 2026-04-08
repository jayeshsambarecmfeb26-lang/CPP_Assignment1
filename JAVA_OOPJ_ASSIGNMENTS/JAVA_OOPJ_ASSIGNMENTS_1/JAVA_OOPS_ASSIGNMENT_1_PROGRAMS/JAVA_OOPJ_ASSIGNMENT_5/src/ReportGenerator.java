//Question 2: Report Generator (Generic Method) 
//A business analytics system needs to generate reports for different types of data (sales, employee names, 
//product IDs). 
//Task: 
//Create a generic method to generate and display reports for any data type. 
//Requirements: 
//● Accept an array or list of any type 
//● Print all elements in a formatted way 
//● Test with: 
//○ Sales figures (Integer/Double) 
//○ Employee names (String) 
//○ Product IDs (Integer)

class Report 
{
	
	    public static <T> void generateReport(T[] data) 
	    {
	        System.out.println("Report:");
	        for (T item : data) {
	            System.out.println(item);
	        }
	    }
	}
	
	
	public class ReportGenerator 
	{
	    public static void main(String[] args) {
	        Integer[] sales = {200, 300,400};
	        String[] names = {"Rupesh", "Rahul"};
	        Integer[] ids = {201, 202};

	        Report.generateReport(sales);
	        Report.generateReport(names);
	        Report.generateReport(ids);
	    }
	
}
