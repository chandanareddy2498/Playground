import java.util.Scanner;
class Main{
	public static void main (String[] args) {
      Scanner in =new Scanner(System.in);
      int num1=in.nextInt();
      int sum=(num1/100)+(num1%10);
      System.out.println(sum);
	}
}