package basic_Operator;

import java.util.Scanner;

public class B_113 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int width = sc.nextInt();
		int length = sc.nextInt();
		width = width+5;
		length = length*2;
		int area = width*length;
		
		
		System.out.println("width = "+width);
		System.out.println("length = "+length);
		System.out.println("area = "+area);
	}

}