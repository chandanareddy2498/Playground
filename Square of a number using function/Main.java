import java.util.Scanner;
class Main
{
	public static int area (int s)
    {
     return  s*s;
     
	 } 
  public static void main (String[] args)
  {
    Scanner in =new Scanner(System.in);
    int s=in.nextInt();
    System.out.println(area(s));
    
}
}