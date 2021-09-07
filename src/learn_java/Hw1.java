package learn_java;
import java.util.Scanner;
public class Hw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a;
		a = in.nextInt();
		double b;
		b = (a-32.0)*5.0/9.0;
		System.out.println((int)b);
	}

}
