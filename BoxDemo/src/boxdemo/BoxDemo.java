package boxdemo;
class Box
{
  int length;
  int breadth;
  int height;
  int volume()
  {
    return(length*breadth*height);
  }
}
public class BoxDemo 
{
  public static void main(String[] args) 
  {
    Box myBox=new Box();
    myBox.length=10;
    myBox.breadth=20;
    myBox.height=30;
    int vol=myBox.volume();
    System.out.println("Volume of Box with given dimensions is "+vol);
  }
}
