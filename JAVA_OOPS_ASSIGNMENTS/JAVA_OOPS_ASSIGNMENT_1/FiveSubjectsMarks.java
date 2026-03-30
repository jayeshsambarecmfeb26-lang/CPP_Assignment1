package JAVA_OOPS_ASSIGNMENT_1;

//27. Take marks of 5 subjects and: 
//● Calculate total 
//● Calculate percentage 
//● Print grade (A/B/C/Fail)

public class FiveSubjectsMarks {

	public static void main(String[] args)
	{
        int total=300;
        double per=total/5.0;

        if(per>=75) 
        	System.out.println("A");
        else if(per>=60) 
        	System.out.println("B");
        else if(per>=35) 
        	System.out.println("C");
        else 
        	
           System.out.println("Fail");

	}

}
