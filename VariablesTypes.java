public class VariablesTypes 
{
        //int result;
        int sum()
        {   int result;
            int a,b;
            a=20;
            b=10;
            result=a+b;
            return result;
        }
        int div()
        {   int result;
            int a,b;
            a=20;
            b=10;
            result=a/b;
            return result;
        }
        int mul()
        {   int result;
            int a,b;
            a=20;
            b=10;
            result=a*b;
            return result;
        }
        int sub()
        {   int result;
            int a,b;
            a=20;
            b=10;
            result=a-b;
            return result;
        }
    public static void main(String[] args) 
    {
        VariablesTypes vTypes=new VariablesTypes();
        System.out.println("Sum is"+vTypes.sum());
        System.out.println("div is"+vTypes.div());
        System.out.println("mul is"+vTypes.mul());
        System.out.println("Sub is"+vTypes.sub());
        
    }    
}
