package basic_Operator;

import java.util.Scanner;

public class B_115 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int minsu1 = sc.nextInt();
		int minsu2 = sc.nextInt();
		int kiyeoung1 = sc.nextInt();
		int kiyeoung2 = sc.nextInt();
		
		boolean vs = (minsu1>kiyeoung1 && minsu2>kiyeoung2);
		
		System.out.println(vs);
	}

}