package basic_RepeatControl;

import java.util.Scanner;

public class B_545 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=0;
		int three=0;
		int five=0;

		for(int i=0;i<10;i++) { 
			n = sc.nextInt();
			if(n%3==0) {
				three++;
			}
			if(n%5==0) {
				five++;
			}
		}
		System.out.println("Multiples of 3 : "+three);
		System.out.println("Multiples of 5 : "+five);

	}

}