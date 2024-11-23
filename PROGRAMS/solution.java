import java.util.*;
class solution
{
    public static void main(String[] args) 
        {
            Scanner sc=new Scanner(System.in);
            
            System.out.println("enter three numbers to add");
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            sum(a,b,c);
            sc.close();
        }
        public static void sum(int a,int b,int c)
        {
            int total=a+b+c;
            System.out.println("Sum of two numbers a & b: "+total);
        }
}
