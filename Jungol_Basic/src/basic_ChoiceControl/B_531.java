package basic_ChoiceControl;

import java.util.Scanner;

public class B_531 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double weight = sc.nextDouble();
		double fly = 50.80;
		double light = 61.23;
		double middle = 72.57;
		double cruiser = 88.45;

		if(weight<=fly) {
			System.out.print("Flyweight");
		}else if(weight<=light) {
			System.out.print("Lightweight");
		}else if(weight<=middle) {
			System.out.print("Middleweight");	
		}else if(weight<=cruiser) {
			System.out.print("Cruiserweight");	
		}else {
			System.out.print("Heavyweight");	
		}
	}
}

