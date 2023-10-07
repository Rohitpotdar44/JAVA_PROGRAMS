package constructer_overloading;

public class Studentt
{
       String name,email;
       int rollno,marks;
       Studentt(int marks,String name,int rollno)
       {
        System.out.println("I am in a 1ST constructor");
       }
       Studentt(String name,int rollno,String email)
       {
        System.out.println("I am in a 2ND constructor");
       }
       Studentt(int marks,String name)
       {
        System.out.println("I am in a 3RD constructor");
       }    
       void display()
       {
        System.out.println("Name of student is:"+name);
        System.out.println("Email of student is:"+email);
        System.out.println("RollNo of student is:"+rollno);
        System.out.println("Marks of student is:"+marks);
       }
       
       public static void main(String[] args)
       {
        Studentt st1=new Studentt(100,"ROHIT",23);
        st1.display();
        System.out.println("**********************");
        Studentt st2=new Studentt("ROHIT",23,"abc@gamil.com");
        st2.display();
        System.out.println("**********************");
        Studentt st3=new Studentt(100,"ABC");
        st3.display();
       }
}
