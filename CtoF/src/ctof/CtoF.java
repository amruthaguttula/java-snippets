package ctof;
import java.util.Scanner;
public class CtoF 
{
 public static void main(String[] args) 
 {
    float temp;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter temperature in Celsius:");
		temp=in.nextInt();
		temp=(((9*temp)/5)+32);
		System.out.println("Temperature in Fahrenheit = "+temp);
  }
}
