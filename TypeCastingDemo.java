public class TypeCastingDemo 
{
    public static void main(String[] args) 
    {
        /*int a,b,result;
        a=10;
        b=37;
        result=a/b;
        System.out.println("result is = "+result);*/

         //implicit type casting (int to float) 
        /*int a,b;
        a=10;
        b=12;
        float x,y,result;                
        x=a;
        y=b;
        result=x/y;
        System.out.println("result is = "+result);*/

        //explicit type casting(float to int)
        float pi=3.14f;
        System.out.println("before casting value of pi is =" + pi );
        int a=(int) pi;
        System.out.println("after casting value of pi is =" + a );


        
    }    
}
