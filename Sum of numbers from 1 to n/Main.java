import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     Scanner in  = new Scanner(System.in);
	     int n = in.nextInt();
      int sum = 0;
      
      
      for(int ct=1;ct<=n;ct++)
      {
         
      sum=ct+sum;
      }
          System.out.println(sum);
         
	}
}