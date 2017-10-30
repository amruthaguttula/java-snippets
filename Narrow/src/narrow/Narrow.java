package narrow;
public class Narrow 
{
  public static void main(String[] args) 
  {
    int a;
    byte b;
    a=321;
    //b=a; SHOWS ERROR BECUASE INTEGER VALUE IS GREATER TO STORE IN BYTE WHICH ID OF 8 BITS
    b=(byte)a;
    System.out.println("After narrowing b="+b);
  }
  
}
