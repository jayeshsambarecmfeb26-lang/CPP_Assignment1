package JAVA_OOPS_ASSIGNMENT_1;

//2. Take two numbers (int and double) and perform: 
//○ Addition 
//○ Division 
//○ Type casting result to int 

public class TypeCasting 
{

	
    public static void main(String[] args)
     {
        int a = 50;
        double b = 5.5;

        double add = a + b;
        double div = a / b;

        int  HS= (int) div;

        System.out.println(add);

        System.out.println(div);

        System.out.println(HS);
     }



}

//55.5
//9.090909090909092
//9