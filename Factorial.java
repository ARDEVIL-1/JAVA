package First;

import java.util.*;

public class Factorial
{

	public static void main(String[] args) 
	{
     Scanner S=new Scanner(System.in);
     int n,i;
     int fact=1;
     System.out.println("Enter The Number ");
     n=S.nextInt();
     for(i=1;i<=n;i++)
     {
    	 fact=fact*i;
     }
     System.out.println("Factorial "+fact);
	}
}
