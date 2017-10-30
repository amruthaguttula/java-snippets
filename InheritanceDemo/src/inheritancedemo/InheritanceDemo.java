package inheritancedemo;
class Super
{
int i,j;
void showij()
 {
  System.out.println("values of i and j are "+i+"\t"+j);
 }
}
class Sub extends Super
{
int k;
void showk()
{
System.out.println("Value of k is "+k);
}
void Sum()
{
System.out.println("Sum of i&j&k is "+(i+j+k));
}
}

public class InheritanceDemo 
{
  public static void main(String[] args) 
  {
    Super superobj=new Super();
    Sub subobj=new Sub();
    superobj.i=10;
    superobj.j=20;
    System.out.println("Super object contents");
    superobj.showij();
    subobj.i=7;
    subobj.j=8;
    subobj.k=9;
    System.out.println("Sub object contents");
    subobj.showij();
    subobj.showk();
    System.out.println("Sum of contents in sub is");
    subobj.Sum();
  }
}