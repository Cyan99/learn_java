package learn_java;

import java.util.Scanner;

public class Hw3 {

	//第一个小作业
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner in = new Scanner(System.in);
//		int a = 0;
//		int ou = 0;
//		int ji = 0;
//		while( a != -1)
//		{
//			a = in.nextInt();
//			if(a%2 == 0) 
//			{
//				ou+= 1;
//			}
//			else if (a>0)
//				ji+=1;
//		}
//		System.out.println(ji+" "+ou);
//	}
	
	//第二个小作业
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = 0;
		int flag = 0;
		int sum = 0;
		int num = 0;
		while(a!=0)
		{
			b = a%10;
			flag += 1;
			if (flag%2 == 0 && b%2 == 0)
			{
				sum = 1;
			}
			else if(flag%2 != 0 && b%2 != 0)
			{
				sum = 1;
			}
			else
			{
				sum = 0;
			}
			a = a/10;
			num += sum * Math.pow(2,flag-1);
		}
		System.out.println(num);
}
}
