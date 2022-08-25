package First;

import java.util.Scanner;

public class Addition 
{

	public static void main(String[] args) 
	{
     int x;
     int y;
     Scanner S1= new Scanner(System.in);
     System.out.println("enter the value");
     x=S1.nextInt();
     y=S1.nextInt();
     int z=x+y;
     System.out.println("addition is= "+z);
	}
}
