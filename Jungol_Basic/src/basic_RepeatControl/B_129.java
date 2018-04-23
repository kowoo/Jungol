/*
Base = 11
Height = 5
Triangle width = 27.5
Continue? Y
Base = 10
Height = 10
Triangle width = 50.0
Continue? N */

package basic_RepeatControl;

import java.util.Scanner;

public class B_129 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int b=0;
		int h=0;
		double w=0;
		boolean isEnd=false;
	
		while(isEnd==false) {
			System.out.print("Base = ");
			b = sc.nextInt();
			System.out.print("Height = ");
			h = sc.nextInt();
			w = (double) b*h/2;
			System.out.printf("Triangle width = %.1f%n", w);
			System.out.print("Continue? ");
			char end = sc.next().charAt(0);
			if (end!='Y' && end!='y') {
				isEnd=true;
				
			}

		}

	}

}
