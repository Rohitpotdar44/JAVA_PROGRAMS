import java.util.Scanner;
public class PowerDemo 
{
    public static void main(String[] args) 
    {
        int x,y,i,ans=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a value of x:");
        x=sc.nextInt();
        System.out.println("enter a value of y:");
        y=sc.nextInt();
        for(i=1;i<=y;i++)
        {
            ans=ans*x;
        }
        System.out.println("value of x ^y is="+ans);
    }
}
