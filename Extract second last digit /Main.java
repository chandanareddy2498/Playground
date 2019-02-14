import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in =new Scanner(System.in);
      int num1=in.nextInt();
      int s_d=(num1%100)/10;
      System.out.println(s_d);
	}
}