package AddDemo;
import java.util.Scanner;
public class StudentMarks 
{
    int marks[]=new int[4];
    int i;
    void storeMarks()
    {   Scanner sc=new Scanner(System.in);
        
        for(i=0;i<4;i++)
        {
            System.out.println("Enter" +(i+1)+"marks");
            marks[i]=sc.nextInt();
        }

        /*marks[0]=100;
        marks[1]=99;
        marks[2]=98;
        marks[3]=97;*/
    }
    void displayMarks()
    {
        for(int i=0;i<=3;i++)
        {   System.out.println("    ");
            System.out.println(marks[i]);
            System.out.println(" ");

        }
    }

    public static void main(String[] args) 
    {
        StudentMarks stu=new StudentMarks();
        stu.storeMarks();
        stu.displayMarks();
    }    
}
