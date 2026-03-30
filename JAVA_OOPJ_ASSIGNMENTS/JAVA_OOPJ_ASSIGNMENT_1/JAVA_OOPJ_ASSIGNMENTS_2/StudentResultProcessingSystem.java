package java_OOps_Programms_2;


//Requirements 
//● Accept student name, roll number, and marks in 5 subjects. 
//● Calculate total, average, percentage. 
//● Display grade using conditions: 
//○ 90 and above → A 
//○ 75 to 89 → B 
//○ 60 to 74 → C 
//○ 40 to 59 → D 
//C-DAC Mumbai
//○ Below 40 → Fail 
//● Show whether the student is promoted or not. 

import java.util.Scanner;

public class StudentResultProcessingSystem 
{

	public static void main(String args[]) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();

        int total = 0;

        System.out.println("Enter marks of 5 subjects:");
        
        for (int i = 1; i <= 5; i++) 
        {
            int marks = sc.nextInt();
            total += marks;
        }

        double percentage = total / 5.0;

        char grade;
        
        if (percentage >= 90)
            grade = 'A';
        else if (percentage >= 75)
            grade = 'B';
        else if (percentage >= 60)
            grade = 'C';
        else if (percentage >= 40)
            grade = 'D';
        else
            grade = 'F';

        System.out.println("Students Result");
        
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll);
        System.out.println("Total: " + total);
        System.out.println("Percentage: " + percentage);
        System.out.println("Grade: " + grade);

        if (grade == 'F')
        {
            System.out.println("Status: Fail");
        }
        else
        {
            System.out.println("Status: Promoted");
        }
}
}

//Total: 329
//Percentage: 65.8
//Grade: C
//Status: Promoted

