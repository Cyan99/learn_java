package learn_java;
import java.util.Scanner;
public class Hw2 {

	public static void time() {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int UTC = 0;
		int hour = 0;
		int minutes = 0;
		int BJT = in.nextInt();
		if (BJT >= 800)
			UTC = BJT - 800;
		else {
			hour = BJT / 100;
			minutes = BJT - hour * 100;
			UTC = (24 - (8 - hour))  * 100 + minutes;
		}
		System.out.print(UTC);
	}

	public static void RS() {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int R = a / 10;
		int S = a % 10;
		String s1 = "";
		switch(R){
			case 1: 
				s1 = "unreadable.";
			break;
			case 2: 
				s1 = "barely readable, occasional words distinguishable.";
				break;
			case 3:
				s1 = "readable with considerable difficulty.";
				break;
			case 4:
				s1 = "readable with practically no difficulty.";
				break;
			case 5:
				s1 = "perfectly readable.";
				break;
		}
		switch(S){
		case 1: 
			System.out.print("Faint signals, barely perceptible, "+ s1);
			break;
		case 2: 
			System.out.print("Very weak signals, "+ s1);
			break;
		case 3:
			System.out.print("Weak signals, " + s1);
			break;
		case 4:
			System.out.print("Fair signals, " + s1);
			break;
		case 5:
			System.out.print("Fairly good signals, " + s1);
			break;
		case 6:
			System.out.print("Good signals, " + s1);
			break;
		case 7:
			System.out.print("Moderately strong signals, " + s1);
			break;
		case 8:
			System.out.print("Strong signals, "+ s1);
			break;
		case 9:
			System.out.print("Extremely strong signals, "+ s1);
			break;
	}
}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("which homework?");
		int test = in.nextInt();
		if (test == 1) {
			time();
		}
		else
			RS();		
	}
	
}	
