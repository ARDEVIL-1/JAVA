import java.util.*;
public class Student {
    public static void main(String[] args) {
        int rn,p,m,c,total;
        String n;
        int a=1;
        int per;
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter Student Roll no ");
        rn=s1.nextInt();
        System.out.println("Enter Student Name ");
        Scanner S=new Scanner(System.in);
        n=S.nextLine();
        System.out.println("Enter Physics Marks ");
        p=S.nextInt();
        System.out.println("Enter Chemistry Marks ");
        c=S.nextInt();
        System.out.println("Enter Maths Marks ");
        m=S.nextInt();
        total=p+c+m;
        per=(total*100)/300;
        System.out.println("Roll No Of The Student is: "+rn);
        System.out.println("Name Of The Student is: "+n);
        System.out.println("Physics Marks: "+p);
        System.out.println("Chemistry Marks: "+c);
        System.out.println("Maths Marks: "+m);
        System.out.println("Total Marks: "+total);
        System.out.println("Percentage: "+per);
        if (per>=80)
        {
            a=2;
        }
        if((per<80)&&(per>=60))
        {
            a=3;
        }
        if((per<60)&&(per>=50))
        {
            a=4;
        }
        if((per<50)&&(per>=40))
        {
            a=5;
        }
        if(per<40)
        {
            a=6;
        }
        switch (a) {
            case 2 -> System.out.println("Distinction");
            case 3 -> System.out.println("First class");
            case 4 -> System.out.println("Second class");
            case 5 -> System.out.println("Pass");
            case 6 -> System.out.println("Fail");
        }
    }
}
