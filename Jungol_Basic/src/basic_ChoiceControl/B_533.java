package basic_ChoiceControl;

import java.util.Scanner;

public class B_533 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String gen = sc.next(); // 넥스트 라인과 넥스트는 다르다..
		int age = sc.nextInt();	

		if(age>=18) {
			System.out.println(gen.equalsIgnoreCase("M")? "MAN": "WOMAN");
		}else {
			System.out.println(gen.equalsIgnoreCase("M")? "BOY": "GIRL");
		}

	}

}
