public class Memberofclass 
{
   String name; //member variable
   int rollno;
   String ID;

   void initialisedStudent()
   {
      name="Rohit";
      rollno=23;
      ID="pillairohit"; 

   }
   void displayStudent() //member method
   {
    System.out.println("Name of student is:"+ name);
     System.out.println("Roll no of student is:"+rollno);
      System.out.println("ID of student is:"+ID);

   }
   public static void main(String[] args) 
   {
   Memberofclass  st=new Memberofclass ();
    st.initialisedStudent();
    st.displayStudent();
    
   }
}
