package StringDemo;

public class StringMethod
{
    public static void main(String[] args) 
    {
        String s1="Aptech";
        String s2="PanveP";
        String name="   Rohit";
            String name1=name.trim();

        System.out.println("length of s1 is:"+s1.length());
         System.out.println("concat of s1 & s2 is:"+s1.concat(s2));//String concat(String s)
         System.out.println("lndex of A is:"+s1.indexOf('A')); //int indexOf(char A)
         System.out.println("replace of A to K is:"+s1.replace('A', 'K')); //String replace(char A,charK)
         System.out.println("last index of P is:"+s2.lastIndexOf('P'));   
         System.out.println("length of name is:"+name.length());  
         System.out.println(" trimmed length of name is:"+name1.length());
         System.out.println("string  name is:"+name1);
    }   
}
