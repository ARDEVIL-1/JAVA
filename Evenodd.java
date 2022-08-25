package First;

import java.util.Scanner;

public class Evenodd 
{

	public static void main(String[] args) 
	{
     Scanner S1= new Scanner(System.in);	
     int n;
     System.out.println("Enter the value");
    
     n=S1.nextInt();
     if(n%2==0)
     {
    	 System.out.println(n+ "Value is even");
     }
     else
     {
    	 System.out.println(n+ "Value is odd");
     }
	}
}
