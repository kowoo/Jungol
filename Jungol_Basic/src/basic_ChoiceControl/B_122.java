package basic_ChoiceControl;

import java.util.Scanner;

public class B_122 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		
		if (year%400==0 || (year%100!=0 && year%4==0)) {
			System.out.println("leap year");
		} else {
			System.out.println("common year");
		}
		
	}

}
