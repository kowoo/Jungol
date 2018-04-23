package basic_RepeatControl;

import java.util.Scanner;

public class B_126 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int odd=0;
		int even=0;
		
		while(true) {
			int a = sc.nextInt();
			if(a%2==0 && a!=0) {
				even++;
			}else if(a%2==1) {
				odd++;
			}
			if(a==0) {
				break;
			}
		}
		System.out.printf("odd : %d%n",odd);
		System.out.printf("even : %d%n",even);
		
	}

}
