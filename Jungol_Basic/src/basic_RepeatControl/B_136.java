package basic_RepeatControl;

import java.util.Scanner;

public class B_136 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int a = sc.nextInt();
		
		for(int i=1, j=a; i<=10 ; i++) {
			a=i*j;
			System.out.print(a+" ");
		}
		
	}

}
