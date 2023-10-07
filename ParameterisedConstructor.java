 class Bank2
{
   String name;
    String location;
    int turnover;
    Bank2(String n,String l,int t)
    {
       System.out.println("We are in Parameterised Constructor");
        name=n;
        location=l;
        turnover=t; 
    } 
    void display()
    {
        System.out.println("Name of bank is:"+name);
        System.out.println("Location of bank is:"+location);
        System.out.println("Turnover of bank is:"+turnover);
    }
}
public class ParameterisedConstructor
 {
    public static void main(String[] args) 
    {
        Bank2 bank2=new Bank2("HDFC","PANVEL",89);
        bank2.display();
    }
}
