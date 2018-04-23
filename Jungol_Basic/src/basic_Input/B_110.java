package basic_Input;

import java.util.Scanner;

public class B_110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double yard = 91.44;
		
		System.out.print("yard? ");
		double input = sc.nextDouble();
		
		System.out.printf("%.1fyard = %.1fcm", input, input*91.44);
	}

}
