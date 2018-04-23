package basic_RepeatControl;

import java.util.Scanner;

public class B_134 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int even=0;
		int odd=0;
		
		for(int i=0; i<10; i++) {
			int a = sc.nextInt();
			if(a%2==0) {
				even++;
			} else {
				odd++;
			}
		}
		System.out.println("even : "+even);
		System.out.println("odd : "+odd);
		
	}

}
