package implicit;
public class Implicit 
{
  public static void main(String[] args) 
  {
    int a=10;
    long b=2356789L;
    //a=b; SHOWS ERROR BECUASE YOU CAN'T INSERT AN LONG()INTERGER()
    b=a;
    System.out.println("Successful assign of int to long b="+b);
    char ch='A';
    a=ch;
    System.out.println("Succesful assign of char to int a="+a);
  }
}
