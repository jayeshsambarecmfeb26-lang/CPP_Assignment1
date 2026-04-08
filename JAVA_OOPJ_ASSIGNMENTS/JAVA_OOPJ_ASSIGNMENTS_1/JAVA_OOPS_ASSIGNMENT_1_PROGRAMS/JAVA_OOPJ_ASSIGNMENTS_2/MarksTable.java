package java_OOps_Programms_2;

//15. Student Marks Table 
//Create a program: 
//Requirements: 
//● Store marks of 3 students in 3 subjects using 2D array 
//● Calculate: 
//○ Total per student 
//○ Average marks 
//● Display in table format

public class MarksTable
{
	
	    public static void main(String[] args)
	    {
	        int[][] marks = {
	                         {50, 60, 70},
	                         {70, 65, 55},
	                         {80, 98, 62}
	                        };

	        for (int i = 0; i < marks.length; i++)
	        {
	            int total = 0;
	            for (int j = 0; j < marks[i].length; j++) 
	            {
	                total += marks[i][j];
	            }
	            double avg = total / 3.0;
	            System.out.println("Student " + (i+1) + " Total: " + total + " Avg: " + avg);
	        }
	    }
	

}
