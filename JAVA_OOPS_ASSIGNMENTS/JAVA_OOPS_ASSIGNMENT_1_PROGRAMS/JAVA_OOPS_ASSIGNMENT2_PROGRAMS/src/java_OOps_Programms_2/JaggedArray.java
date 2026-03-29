package java_OOps_Programms_2;

//16. Weekly Work Hours 
//Create a program: 
//Requirements: 
//● Each employee works different number of days 
//● Use jagged array to store hours 
//● Display all employee work hours 

public class JaggedArray 
{
	
	
    public static void main(String[] args) {
        int[][] hours = {
            {9, 9, 9},
            {5, 6},
            {5, 6, 7, 8}
        };

        for (int i = 0; i < hours.length; i++)
        {
            System.out.print("Employee " + (i+1) + ": ");
            for (int h : hours[i])
            {
                System.out.print(h + " ");
            }
            System.out.println();
        }
    }
}