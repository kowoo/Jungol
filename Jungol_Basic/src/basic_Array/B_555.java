package basic_Array;

import java.util.Scanner;

public class B_555 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] words = new char[10];
		
		for(int i=0; i<10; i++) {
			words[i] = sc.next().charAt(0);
		}
		for(int i=0; i<10; i++) {
			System.out.print(words[i]);				
		}
		
	}

}