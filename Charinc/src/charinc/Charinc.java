package charinc;
public class Charinc 
{
  public static void main(String[] args) 
  {
    char ch;
    ch='A';
    ch++;//Here ch=ch+1; Gives an error we couldn't add  1(which is treated as int value) directly to the char val
    System.out.println("Now ch="+ch);
  }
  
}
