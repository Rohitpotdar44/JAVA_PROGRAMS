//this key word= use when name of local and instance variable is same(this is a reference variable use to mapping relationship between local and instance variable)
public class Students
{
    String name;
    int marks;
    Students(int marks,String name)
    {
        System.out.println("We are in a parameterised constructer");
        this.name=name;
        this.marks=marks;
    }
    void display()
    {
        System.out.println("Student name is:"+name);
        System.out.println("Student marks is:"+marks);
    }
    public static void main(String[] args) 
    {
        Students stud=new Students(100, "Rohit");
        stud.display();    
    }

}