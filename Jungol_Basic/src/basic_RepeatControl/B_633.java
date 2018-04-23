package basic_RepeatControl;

import java.util.Scanner;

public class B_633 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.println("1. Korea");
			System.out.println("2. USA");
			System.out.println("3. Japan");
			System.out.println("4. China");		
			System.out.print("number? ");
			int a = sc.nextInt();
			System.out.println();
			if(a<1 || a>4) {
				System.out.println("none");
				break;
			}
			switch(a) {
			case(1): 
				System.out.println("Seoul"+'\n');
				break;
			case(2): 
				System.out.println("Washington"+'\n');
				break;
			case(3): 
				System.out.println("Tokyo"+'\n');
				break;
			case(4): 
				System.out.println("Beijing"+'\n');
				break;
			}
		}


	}

}
