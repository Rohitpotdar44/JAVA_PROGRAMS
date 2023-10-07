 class Bank 
{
    String name;
    String location;
    int turnover;
     Bank()
    {
        System.out.println("We are in Default Constructor");
        name="BOI";
        location="Panvel";
        turnover=23;
    }
    void display()
    {
        System.out.println("Name of bank is:"+name);
        System.out.println("Location of bank is:"+location);
        System.out.println("Turnover of bank is:"+turnover);
    }
}
public class DefaultConstructorDemo
{
    public static void main(String[] args) 
    {
     Bank bank=new Bank();
     bank.display();   
    }
}
    

