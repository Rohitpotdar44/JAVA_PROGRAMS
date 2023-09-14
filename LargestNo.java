import java.util.Scanner;
public class LargestNo 
{
    public static void main(String[] args) 
    {
        float a,b,e;
         Scanner sc=new Scanner(System.in);
        System.out.println("enter value of a");
        a=sc.nextFloat();
        System.out.println("enter value of b");
        b=sc.nextFloat();
        System.out.println("enter value of e");
        e=sc.nextFloat();
        if(a>b && a>e)
        {
            System.out.println("a is greater");

        }
        else if(b>e)  
                {
                    System.out.println("b is greater");          
                }
        else        
        {
             System.out.println("e is greater");
        }
    }
    
}
