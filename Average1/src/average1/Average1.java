package average1;
public class Average1 
{
  public static void main(String[] args) 
  {
double nums[] = {10, 11, 12, 13, 14,15};
double result = 0;
int i; 
for(i=0; i<6; i++)
result = result + nums[i];
System.out.println("Average is " + result / 6);
  }
  
}
