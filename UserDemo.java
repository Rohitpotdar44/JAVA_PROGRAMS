import java.util.Scanner;
public class UserDemo 
{
   public static void main(String[] args)
    { int i,num;
        Scanner sc=new Scanner(System.in);
        for(i=1;1<=100;i++)
        {    System.out.println("Enter a number");
            num=sc.nextInt();
           if( num==0)
           {
            break;
           }
        }
    System.out.println("");
   } 
   
}
