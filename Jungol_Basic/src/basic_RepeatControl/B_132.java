package basic_RepeatControl;

import java.util.Scanner;

public class B_132 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int a = sc.nextInt();
		int five=0;
		int sum=0;
		
		for(int i=0; i<=a; i++) {
			if(i%5==0) {
				five=i;
				sum+=five;
			}
		}
		System.out.print(sum);
		
	}

}
