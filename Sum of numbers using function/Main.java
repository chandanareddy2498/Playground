import java.util.Scanner;
class Main{
	
	    public  static int findSum(int n) 
    { 
        int sum = 0; 
        for (int x = 1; x <= n; x++)  
            sum = sum + x; 
        return sum; 
    } 
  
   
    public static void main(String args[]) 
    { 
        Scanner in =new Scanner(System.in);
      int n=in.nextInt();
        System.out.println(findSum(n)); 
    }  
}