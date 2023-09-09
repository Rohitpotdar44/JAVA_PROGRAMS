import java.util.Scanner;
public class CircleDemo 
{
    public static void main(String[] args) 
    {
        float r,area;
        final float pi=3.14f;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius");
        r=sc.nextFloat(); //next float for set of numbers
        area=pi*r*r;
        System.out.println("Area is ="+ area);
            
    }
}
