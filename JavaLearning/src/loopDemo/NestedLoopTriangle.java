package loopDemo;

import java.util.Scanner;

public class NestedLoopTriangle {

	public static void main(String[] args) {
		
		int row;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows needed for the triangle: ");
		row=input.nextInt();
		
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
								
			}
			System.out.println();
			
		}

	}

}
