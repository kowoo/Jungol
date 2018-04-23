package basic_RepeatControl;

import java.util.Scanner;

public class B_543 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if(a<=50) {
			for(int i=2; i<=a; i++) {
				if(i%2==0) {
					System.out.print(i+" ");
				}
			}
		}
				
	}

}
