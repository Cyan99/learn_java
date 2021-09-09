package learn_java;

import java.util.Scanner;

public class Hw4 {

//第一个小作业
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner in = new Scanner(System.in);
//		int up = in.nextInt();
//		int low = in.nextInt();
//		int []a = new int[200]; 
//		int k =0;
//		int sum = 0;
//		boolean flag = true;
//		for(int i = 2;;i++)
//		{
//			flag = true;
//			for (int j = 2; j <= Math.sqrt(i); j++) 
//			{
//				if (i%j == 0)
//				{
//					flag = false;
//					break;
//				}
//				
//			}
//			if(flag) 
//			{
//				a[k] = i;
//				if (k == low-1)
//					break;
//				k++;
//			}
//		}
//		for (int m = up-1;m<low;m++)
//		{
//			sum +=a[m];
//		}
//		System.out.println(sum);
//	}

//第二个小作业
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int olzs = in.nextInt();
		int zs = 0;
		if (olzs < 0)
		{
			zs = olzs * (-1);
		}
		else
			zs = olzs;
		int flag = 0,i = 0;
		String s1 = null;
		String []sen = new String[6];
		while (zs != 0)
		{
			flag = zs%10;
//			System.out.println("flag"+flag);
			zs = zs/10;
//			System.out.println("zs"+zs);
			switch(flag) 
			{
				case 0:
					s1 = "ling";
					break;
				case 1:
					s1 = "yi";
					break;
				case 2:
					s1 = "er";
					break;
				case 3:
					s1 = "san";
					break;
				case 4:
					s1 = "si";
					break;
				case 5:
					s1 = "wu";
					break;
				case 6:
					s1 = "liu";
					break;
				case 7:
					s1 = "qi";
					break;
				case 8:
					s1 = "ba";
					break;
				case 9:
					s1 = "jiu";
					break;
			}
		sen[i] = s1;
//		System.out.println("i:"+i+" "+s1);
		i++;
		}
		if(olzs<0)
		{
			System.out.print("fu ");
			for (int j=i-1;j >= 0;j--)
			{
				if(j == 0)
					System.out.print(sen[j]);
				else
					System.out.print(sen[j]+" ");
			}
		}
		else if (olzs == 0)
		{
			System.out.print("ling");
		}
		else
		{
			for (int j=i-1;j >= 0;j--)
			{
				if(j == 0)
					System.out.print(sen[j]);
				else
					System.out.print(sen[j]+" ");
			}
		}
	}
}


