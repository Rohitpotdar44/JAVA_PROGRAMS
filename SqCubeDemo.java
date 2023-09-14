import java.util.Scanner;
public class SqCubeDemo 
{
  public static void main(String[] args)
   {
    int i,num;
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter loop count ");

    num=sc.nextInt();
 


    for(i=1;i<=num;i++)
    {
        if(i%4==0)
        continue;
        {
             System.out.println("number is "+(i));
              System.out.println("number square is "+(i*i));
             System.out.println("number cube is "+(i*i*i)); 
             

        }
        System.out.println(" ");
    }
    
  }  
}
