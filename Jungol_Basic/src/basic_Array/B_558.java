package basic_Array;

import java.util.Scanner;

public class B_558 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[100];
		int count = 0;
		
		for(int i=0; i<numbers.length; i++) {
			numbers[i] = sc.nextInt();
			if(numbers[i]==0) {
				count--;
				break;
			}
			count++;
		}
		for(int i=count; i>=0; i--) {
			System.out.print(numbers[i]+" ");
		}
		
	}

}