package basic_Array;

import java.util.Scanner;

public class B_557 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] words = new char[10];
		
		for(int i=0; i<words.length; i++) {
			words[i] = sc.next().charAt(0);
		}
		for(int i=0; i<words.length; i++) {
			if(i==0||i==3||i==6)
			System.out.print(words[i]+" ");
		}
		
	}

}