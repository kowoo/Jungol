package basic_ChoiceControl;

import java.util.Scanner;

public class B_534 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char upper = sc.nextLine().charAt(0);

		System.out.println(upper=='A'? "Excellent":
							upper=='B'? "Good" :
							upper=='C'? "Usually":
							upper=='D'? "Effort":
							upper=='F'? "Failure": "error" );
	}	

}
