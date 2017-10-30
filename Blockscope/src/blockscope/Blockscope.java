package blockscope;
public class Blockscope 
{
  public static void main(String[] args) 
  {
    int p=30;
    if (p==30)
    {
      int q=20;
      System.out.println("In the inner block P and Q are:"+p+"  "+q);
      p=7*q;
    }
    //q=100; HERE..,THIS LINE SHOWS ERROR BECAUSE IT'S SCOPE IS WITHIN IF BLOCK
    int q=100;//↑↑↑ IS THE ↑↑ REASON ↑↑ WHY WE NEED TO CREATE THE ↑↑ "Q" VARIABLE AGAIN OUTSIDE THE IF()
    System.out.println("In the outer block P and Q are:"+p+"  "+q);
  }
  
}
