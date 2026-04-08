package JAVA_OOPS_ASSIGNMENT_1;
//37. Check whether a number is perfect number. 

public class PerfectNumber {

	 public static void main(String[] args) {
		 {
			 int n=28;
			
			 int sum=0;
			 for(int i=1;i<28;i++)
			 {
				 if(n%i==0)
				 {
					 sum=sum+i;
				 }
			 }
			 if(sum==n)
			 {
				 System.out.println(n+" is a perfect no");
			 }
			 else
			 {
				 System.out.println(n+" is not a perfect no");
			 }
		 }
		 
	 }

}
