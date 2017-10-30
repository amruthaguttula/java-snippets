package palan;
import java.util.*;
public class Palan 
{
  public static void main(String[] args) 
  {
   System.out.println("Enter a string");
   String s=new Scanner(System.in).next();
   for(int i=0,j=s.length()-1;i<=j;i++,j--)
   {
     if(s.charAt(i)==s.charAt(j));
     else
     {
       System.out.println("Not Palindrome !");
       System.exit(1);
     }
   }
   System.out.println("Given string is a Palindrome.");
  }
  
}
