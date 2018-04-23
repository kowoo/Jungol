package basic_RepeatControl;

import java.util.Scanner;

public class B_148 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n>0) {
			for(int i=0; i<n; i++) {
				for(int j=0; j<=i; j++) {
					System.out.printf("# ");
				}
				System.out.println();
			}
			for(int i=1; i<n; i++) {
				for(int k=0; k<=(i-1)*2; k++) {
					System.out.print(" ");
				}
				for(int k=i; k<n; k++) { 
					System.out.print(" #");
				}
				System.out.println();
			}
			
		}
	}
}
