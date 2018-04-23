package basic_Debuging;

import java.util.Scanner;

public class B_117 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		int score = (int)a+(int)b+(int)c;
		int aver = (int)((a+b+c)/3.0);
		
		System.out.printf("sum %d%n", score);
		System.out.printf("avg %d",aver);
	}
}