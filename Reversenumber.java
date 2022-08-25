package First;

import java.util.*;
public class Reversenumber 
{

	public static void main(String[] args) 
	{
	int n,rem,rev=0;
	System.out.println("Enter The Number");
	Scanner S1=new Scanner(System.in);
	n=S1.nextInt();
	while(n!=0)
	{
		rem=n%10;
		rev=rev*10+rem;
		n=n/10;
	}
	  System.out.println("Reverse Number is "+rev);
	}
}
