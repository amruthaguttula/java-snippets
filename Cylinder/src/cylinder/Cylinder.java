package cylinder;
public class Cylinder 
{
  public static void main(String[] args) 
  {
    double pi,r=5.0,h=25.0,area,vol;
	pi=22.0/7.0;
	area=(2*pi*r*r)+(2*pi*r*h);
	vol=(pi*r*r*h);
	System.out.println("area="+area+"\tvolume="+vol);
  }
}