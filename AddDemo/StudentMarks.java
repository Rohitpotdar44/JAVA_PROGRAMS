package AddDemo;

public class StudentMarks 
{
    int marks[]=new int[4];
    void storeMarks()
    {
        marks[0]=100;
        marks[1]=99;
        marks[2]=98;
        marks[3]=97;
    }
    void displayMarks()
    {
        for(int i=0;i<=3;i++)
        {
            System.out.println(marks[i]);

        }
    }

    public static void main(String[] args) 
    {
        StudentMarks stu=new StudentMarks();
        //stu.storeMarks();
        stu.displayMarks();
    }    
}
