package basic_ChoiceControl;

import java.util.Scanner;

public class B_120 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a-b>0) {
			System.out.println(a-b);
		} else {
			System.out.println(b-a);
		}
		
	}

}
