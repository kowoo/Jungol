package basic_Array;

import java.util.Scanner;

public class B_150 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] words = new char[10];
		
		for(int i=words.length-1; i>=0; i--) {
			words[i] = sc.next().charAt(0);
		}
		
		for(char print: words) {
			System.out.print(print+" ");
		}
	}
		
		
}

