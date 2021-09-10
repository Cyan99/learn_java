package learn_java;
import java.util.Scanner;

public class Hw5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int []a = new int[200];
		int count = 0;
		int temp = 0;
		int num = 0;
		int []max = new int[2];
//		System.out.print(a[0]);
 		for (int i = 0;;i++)
		{
			temp = in.nextInt();
			num = in.nextInt();
			a[temp] += num;
			if (temp == 0 )
			{
				count++;
				if (count == 2)
				{
					break;
				}
			}
		}
 		for (int j=a.length-1;j>=0;j--)
 		{
 			if(a[j]!=0)
 			{
 				if(j==1) 
 				{
 					System.out.print(a[j]+"x"+"+");
 				}
 				else if(j==0)
 				{
 					System.out.print(a[j]);
 				}
 				else
 					System.out.print(a[j]+"x"+j+"+");
 			}
 		}
	}

}
