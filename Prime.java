import java.util.*;
public class Prime {
    public static void main(String[] args){
        int n,i,flag=0;
        Scanner s1= new Scanner(System.in);
        System.out.println("Enter the value ");
        n= s1.nextInt();
        int m = n / 2;
        for(i=2;i<=m;i++)
        {
            if(n%i==0){
                System.out.println("Number is not prime number ");
                flag=1;
                break;
            }
        }
        if(flag==0) {
            System.out.println("Number is prime number");
        }
    }
}
