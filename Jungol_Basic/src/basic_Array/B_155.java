package basic_Array;

import java.util.Scanner;

public class B_155 {

	public static void main(String[] args) {
		char[] jungol = {'J','U','N','G','O','L'};
		
		Scanner input = new Scanner(System.in);
		char a = input.next().charAt(0);
		
		for(int i=0; i<jungol.length; i++) {
			if(a==jungol[i]) {
				System.out.print(i);
				break;			
			} else if(i==jungol.length-1) {
				System.out.print("none");
			}
		}
		
		
	}

}