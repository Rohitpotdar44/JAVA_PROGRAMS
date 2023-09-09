import java.util.Scanner;
public class SwitchDemo 
{
    public static void main(String[] args)
    {
        System.out.println("Enter your grettings");
        Scanner sc=new Scanner(System.in); //for taking input from user
        String type=sc.nextLine();//next line for set of characAMters
         String timeString=sc.nextLine();
        switch (type) {
            case "Good Morning":
                                System.out.println("Good Morning");
                                switch (timeString)
                                {
                                case "AM":
                                System.out.println("AM");
                                break;       
                                default :
                               System.out.println("Time is invalid"); 
                               break;
                             }                                     
                break;
                            
            case "Good Afternoon":    
                                System.out.println("Good Afternoon");
                                switch (timeString)
                                {
                                case "NOON":
                                System.out.println("NOON");
                                break;       
                                default :
                               System.out.println("Time is invalid"); 
                               break;
                             }    
                break;
                            
            case "Good Evening":    
                                System.out.println("Good Evening");
                                switch (timeString)
                                {
                                case "PM":
                                System.out.println("PM");
                                break;       
                                default :
                               System.out.println("Time is invalid"); 
                               break;
                             }    
                break;  
            
        }    
    }
    
}
