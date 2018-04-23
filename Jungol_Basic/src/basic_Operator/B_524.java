package basic_Operator;

import java.util.Scanner;

public class B_524 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		boolean a2 = a!=0? true: false;
		boolean b2 = b!=0? true: false;
		
		System.out.print((a2&&b2)+" "+(a2||b2));
		
	}

}
