package sum;
//using integer data type
public class Sum 
{
  public static void main(String[] args) 
  {
    int x=1;
    int sum=0;
    while(x<=5)
    {
      System.out.println("Value of x is "+x);
      sum+=x;
      x++;
    }
    System.out.println("Sum of first five numbers is "+sum);
  }
}