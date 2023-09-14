import java.util.Scanner;
public class PrimeNo 
{
    /**
     * @param args
     */
    public static void main(String[] args) 
    {
        int num,i,flag=1;
         System.out.println("Enter number");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        for (i=2;i<=num;i++)
        {
            if(num%i==0)
            {
                flag=2;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("No is prime");
        }
        else
        {
             System.out.println("No is not prime");
        }
        sc.close();



    }
}
