package stringtokenizerdemo;
import java.util.*;
public class StringTokenizerDemo 
{
  public static void main(String[] args) 
  {
    int n;
    int sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter integer separated by space");
    String s=sc.nextLine();
    StringTokenizer st=new StringTokenizer(s," ");
    System.out.println("List you entered");
    while(st.hasMoreTokens())
    {
      String temp=st.nextToken();
      n=Integer.parseInt(temp);
      System.out.println(n);
      sum=sum+n;
    }
    System.out.println("sum="+sum);
  }
}
